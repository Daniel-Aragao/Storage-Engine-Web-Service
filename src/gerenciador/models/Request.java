package gerenciador.models;

import java.util.List;

public class Request {

	private List<Tabela> tabelas;

	public Request() {
		super();
	}

	public List<Tabela> getTabelas() {
		return tabelas;
	}

	public void setTabelas(List<Tabela> tabelas) {
		this.tabelas = tabelas;
	}
	
}
