package gerenciador.models;

public class Coluna {

	private String nome;
	private String tipo;
	private Short tamanho;
	
	public Coluna() {
		super();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Short getTamanho() {
		return tamanho;
	}
	public void setTamanho(Short tamanho) {
		this.tamanho = tamanho;
	}	
}
