package gerenciador.models;

public class ChaveDeBusca {

	byte id;
	String [] buscas;
	
	public ChaveDeBusca(){
		super();
	}
	
	public byte getId() {
		return id;
	}
	public void setId(byte id) {
		this.id = id;
	}
	public String[] getBuscas() {
		return buscas;
	}
	public void setBuscas(String[] buscas) {
		this.buscas = buscas;
	}
	
}

