package aula12.exemploHeranca;

public class Motorista extends Funcionario{
	private String cnh;

	public Motorista(String nome, String sobrenome, String eMail, String cnh){
		super(nome,sobrenome,eMail);
		this.cnh = cnh;
	}

	public String getCnh() {
		return cnh;
	}

	public void setCnh(String cnh) {
		this.cnh = cnh;
	}
}
