package gerenciador.models;

public class Chave {
	private String dado;
	
	public Chave() {
		// TODO Auto-generated constructor stub
	}
	
	public Chave(String dado){
		this.dado = dado;
	}

	public String getDado() {
		return dado;
	}

	public void setDado(String dado) {
		this.dado = dado;
	}
	
	@Override
	public String toString(){
		String retorno = dado.toString();
		return retorno;
	}
	
}
