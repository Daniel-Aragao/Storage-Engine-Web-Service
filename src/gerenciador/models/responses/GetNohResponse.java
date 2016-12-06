package gerenciador.models.responses;

import gerenciador.models.Noh;

public class GetNohResponse {
	private Noh noh;
	
	public GetNohResponse(){
		Noh noh= new Noh();
	}

	public Noh getNoh() {
		return noh;
	}

	public void setNoh(Noh noh) {
		this.noh = noh;
	}
}
