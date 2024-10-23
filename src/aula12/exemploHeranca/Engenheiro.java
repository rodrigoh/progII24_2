package aula12.exemploHeranca;

public class Engenheiro extends Funcionario{
	private String crea;

	public Engenheiro(String nome, String sobrenome, String eMail) {
		super(nome, sobrenome, eMail);
	}


	public String getCrea() {
		return crea;
	}

	public void setCrea(String crea) {
		this.crea = crea;
	}
}
