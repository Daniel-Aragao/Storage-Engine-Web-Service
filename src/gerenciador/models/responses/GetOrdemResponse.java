package gerenciador.models.responses;

public class GetOrdemResponse {
	private Integer ordem;

	public GetOrdemResponse(Integer ordem) {
		super();
		this.ordem = ordem;
	}

	public Integer getOrdem() {
		return ordem;
	}

	public void setOrdem(Integer ordem) {
		this.ordem = ordem;
	}
	
	
}
