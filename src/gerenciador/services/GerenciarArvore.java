package gerenciador.services;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import gerenciador.GerenciadorArquivos;
import gerenciador.GerenciadorBuffer;
import gerenciador.GerenciadorIndice;
import gerenciador.RowId;
import gerenciador.arquivos.blocos.Coluna;
import gerenciador.arquivos.enums.ETipoBlocoArquivo;
import gerenciador.arquivos.interfaces.IArquivo;
import gerenciador.indice.blocos.DadosNode;
import gerenciador.indice.blocos.Node;
import gerenciador.models.Chave;
import gerenciador.models.Noh;
import gerenciador.models.responses.GetNohResponse;

@Path("/arvore")
public class GerenciarArvore {

	@Path("/getArvore")
	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public GetNohResponse getArvore(@QueryParam("id") Integer type) {
		GerenciadorIndice gi = new GerenciadorIndice();
		GerenciadorArquivos ga = new GerenciadorArquivos();
		GerenciadorBuffer gb = new GerenciadorBuffer();
		
		GetNohResponse response = new GetNohResponse();
		
		IArquivo indice = ga.getArquivo(type.byteValue());
		
		if(indice.getTipo() ==  ETipoBlocoArquivo.indices){
			Node raiz = gi.getRaiz(indice);
			Noh noh = montarNoh(gb, raiz);
			
			response.setNoh(noh);
		}
		
		return response;
	}
	
	private Noh montarNoh(GerenciadorBuffer gb, Node raiz){
		Noh retorno = new Noh();
		
//		retorno.setColunas(raiz.getChaves());
		
		for(gerenciador.indice.blocos.Chave c: raiz.getChaves()){
			retorno.addChave(new Chave(c.toString()));
		}
		
		for(RowId p : ((DadosNode)raiz.getDados()).getPonteiros()){
			Node filho = (Node) gb.getBloco(p);
			retorno.add(montarNoh(gb, filho));
		}
		
		return retorno;
	}
	
}
