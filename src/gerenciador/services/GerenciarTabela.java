package gerenciador.services;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import gerenciador.GerenciadorArquivos;
import gerenciador.arquivos.blocosControle.UnidadeDescricao;
import gerenciador.arquivos.enums.ETipoColuna;
import gerenciador.arquivos.interfaces.IArquivo;
import gerenciador.models.Coluna;
import gerenciador.models.Tabela;
import gerenciador.models.responses.GetTabelasResponse;

@Path("/tabelas")
public class GerenciarTabela {

	@Path("/getTabelas")
	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public GetTabelasResponse getTabelas(@QueryParam("tipo") Integer type) {
		GerenciadorArquivos gerenciadorArquivos = new GerenciadorArquivos();
		
		GetTabelasResponse response = new GetTabelasResponse();
		
		for (IArquivo arquivo : gerenciadorArquivos.getTabelas()) {
			if (arquivo.getTipo().getValor() == type.byteValue()) {
				Tabela tabela = createTabela(arquivo);
				response.addTabela(tabela);
			}
		}
		return response;
	}
	
	private Tabela createTabela(IArquivo arquivo) {
		Tabela tabela = new Tabela();
		
		tabela.setId(arquivo.getId());
		tabela.setNome(arquivo.getNome());
		tabela.setQtdIndices(arquivo.qtdIndices());
		tabela.setIndices(arquivo.getBlocoControle().getIndices());
		
		for (UnidadeDescricao unidadeDescricao : arquivo.getDescritor().getDescritores()) {
			tabela.addColuna(createColuna(unidadeDescricao));
		}
		
		return tabela;
	}
	
	private Coluna createColuna(UnidadeDescricao unidadeDescricao) {
		Coluna coluna = new Coluna();
		
		coluna.setNome(unidadeDescricao.getNome());
		coluna.setTamanho(unidadeDescricao.getTamanho());
		coluna.setTipo(unidadeDescricao.getTipo().getValor());
		
		return coluna;
	}
}
