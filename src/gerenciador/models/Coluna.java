package gerenciador.models;

public class Coluna {

	private String nome;
	private Byte tipo;
	private Byte tamanho;
	
	public Coluna() {
		super();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Byte getTipo() {
		return tipo;
	}
	public void setTipo(Byte tipo) {
		this.tipo = tipo;
	}
	public Byte getTamanho() {
		return tamanho;
	}
	public void setTamanho(Byte tamanho) {
		this.tamanho = tamanho;
	}	
}
