package aula13.exemploPolimorfismoOverrice;

import java.util.Objects;

public class Aluno extends Pessoa{
	private String matricula;

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Aluno aluno = (Aluno) o;
		return Objects.equals(matricula, aluno.matricula);
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(matricula);
	}

	@Override
	public String obterDados(){
		return matricula+" "+getNome()+" "+getSobrenome();
	}

	@Override
	public String toString(){
		return obterDados();
	}
}
