package gerenciador.models.responses;

import java.util.List;

import gerenciador.models.Tabela;

public class GetTabelasResponse {
	private List<Tabela> tabelas;

	public GetTabelasResponse() {
		super();
	}

	public List<Tabela> getTabelas() {
		return tabelas;
	}

	public void setTabelas(List<Tabela> tabelas) {
		this.tabelas = tabelas;
	}	
	
	public void addTabela(Tabela tabela) {
		this.tabelas.add(tabela);
	}
}
