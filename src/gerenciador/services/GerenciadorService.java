package gerenciador.services;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import gerenciador.GerenciadorArquivos;
import gerenciador.GerenciadorIndice;
import gerenciador.arquivos.Arquivo;
import gerenciador.arquivos.blocosControle.UnidadeDescricao;
import gerenciador.models.Request;
import gerenciador.models.Tabela;

@Path("/gerenciador")
public class GerenciadorService {

	@Path("/fireworks")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public String Fireworks(Request request) {
		GerenciadorArquivos gerenciadorArquivos = new GerenciadorArquivos();
		
		gerenciadorArquivos.getTabelas();
		return "HUEHUEHUEBR";
	}
}
