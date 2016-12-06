package gerenciador.services;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import gerenciador.GerenciadorIndice;
import gerenciador.arquivos.blocosControle.UnidadeDescricao;
import gerenciador.arquivos.enums.ETipoColuna;
import gerenciador.arquivos.exceptions.IncorrectFormatException;
import gerenciador.models.Coluna;
import gerenciador.models.Tabela;
import gerenciador.models.responses.GetOrdemResponse;

@Path("/indices")
public class GerenciarIndice {

	@Path("/getOrdem")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public GetOrdemResponse getOrdem(Tabela tabela) {
		GerenciadorIndice gerenciadorIndice = new GerenciadorIndice();
		UnidadeDescricao[] descricoes;
		
		GetOrdemResponse response = null;
		try {
			descricoes = createDescricoes(tabela.getColunas());
			int ordem = gerenciadorIndice.CriarIndice(tabela.getQtdIndices().byteValue(), descricoes, tabela.getNome());
			response = new GetOrdemResponse(ordem);
			
		} catch(IncorrectFormatException ex) {
			ex.printStackTrace();
			response = new GetOrdemResponse(0);
		}
		return response;
	}

	private UnidadeDescricao[] createDescricoes(List<Coluna> colunas) throws IncorrectFormatException {
		UnidadeDescricao[] descricoes = new UnidadeDescricao[colunas.size()];
		
		for (int i = 0; i < colunas.size(); i++) {
			Coluna coluna = colunas.get(i);
			descricoes[i] = new UnidadeDescricao(coluna.getNome(), ETipoColuna.getByValue(coluna.getTipo()), coluna.getTamanho());
		}
		
		return descricoes;
	}
}
