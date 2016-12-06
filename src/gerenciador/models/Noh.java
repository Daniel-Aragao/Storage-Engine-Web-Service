package gerenciador.models;

import java.util.ArrayList;
import java.util.List;

public class Noh {
	private List<Noh> nohs;
	private List<Chave> chaves;
	
	public Noh(){
		chaves = new ArrayList<Chave>();
		nohs = new ArrayList<Noh>();
	}

	public List<Noh> getNos() {
		return nohs;
	}

	public void setNos(List<Noh> nos) {
		this.nohs = nos;
	}

	public List<Chave> getColunas() {
		return chaves;
	}

	public void setColunas(ArrayList<Chave> arrayList) {
		this.chaves = arrayList;
	}
	
	public void addChave(Chave chave) {
		chaves.add(chave);
		
	}

	public void add(Noh montarNoh) {
		nohs.add(montarNoh);
		
	}
	
	@Override
	public String toString(){
		String retorno = this.chaves.get(0).toString();
		return retorno;
	}
}
