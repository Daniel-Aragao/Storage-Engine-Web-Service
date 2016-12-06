package gerenciador.services;


import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import gerenciador.GerenciadorIndice;
import gerenciador.arquivos.blocos.Coluna;
import gerenciador.arquivos.exceptions.IncorrectFormatException;
import gerenciador.arquivos.interfaces.ITupla;
import gerenciador.models.ChaveDeBusca;
import gerenciador.models.responses.GetBuscaResponse;

@Path("/busca")
public class GerenciarChaveDeBusca {

	@Path("/getBusca")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public GetBuscaResponse getBusca(ChaveDeBusca busca) {

		GerenciadorIndice gerenciadorIndice = new GerenciadorIndice();
		
		GetBuscaResponse response = null;
		
		ArrayList<ITupla> resultado = gerenciadorIndice.Buscar(busca.getBuscas(), busca.getId());
		String[][] buscas = new String[resultado.size()][0];
		
		if (!resultado.isEmpty()){
			buscas = new String[resultado.size()][resultado.get(0).getColunas().size()];
			
			int i = 0;
			for(ITupla t : resultado){
				int j = 0;
				for (Coluna c : t.getColunas()){
					buscas[i][j] = c.toString();
					j++;
				}
				i++;
			}
		}
		response = new GetBuscaResponse(buscas);
		
		return response;
	}
}




