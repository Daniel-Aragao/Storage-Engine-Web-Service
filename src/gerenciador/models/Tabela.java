package gerenciador.models;

import java.util.ArrayList;
import java.util.List;

public class Tabela {
	private Byte id;
	private String nome;
	private List<Coluna> colunas;
	private byte[] indices;
	private Integer qtdIndices;
	
	public Tabela() {
		super();
		colunas = new ArrayList<Coluna>();
	}

	public Byte getId() {
		return id;
	}

	public void setId(Byte id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Coluna> getColunas() {
		return colunas;
	}

	public void setColunas(List<Coluna> colunas) {
		this.colunas = colunas;
	}
	
	public void addColuna(Coluna coluna) {
		this.colunas.add(coluna);
	}

	public byte[] getIndices() {
		return indices;
	}

	public void setIndices(byte[] indices) {
		this.indices = indices;
	}

	public Integer getQtdIndices() {
		return qtdIndices;
	}

	public void setQtdIndices(Integer qtdIndices) {
		this.qtdIndices = qtdIndices;
	}	
}
