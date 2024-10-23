package aula12.exemploHeranca;

public class Funcionario {

	private String nome;
	private String sobrenome;
	private String eMail;

	public Funcionario(String nome, String sobrenome, String eMail){
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.eMail = eMail;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String obterDados(){
		return "Nome: "+nome+" "+sobrenome+"\nE-mail: "+eMail;
	}
}
