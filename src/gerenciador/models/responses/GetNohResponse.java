package gerenciador.models.responses;

import java.io.Serializable;

import gerenciador.models.Noh;

public class GetNohResponse implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 282821578048155506L;
	private Noh noh;
	
	public GetNohResponse(){
	}

	public Noh getNoh() {
		return noh;
	}

	public void setNoh(Noh noh) {
		this.noh = noh;
	}
}
