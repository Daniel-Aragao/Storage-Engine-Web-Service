package gerenciador.models.responses;

public class GetBuscaResponse {
	private String [][] buscas;

	public GetBuscaResponse(String[][] buscas) {
		super();
		this.buscas = buscas;
	}

	public String[][] getBuscas() {
		return buscas;
	}

	public void setBuscas(String[][] buscas) {
		this.buscas = buscas;
	}	
	
}