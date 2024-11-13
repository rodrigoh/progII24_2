package aula13.exemploPolimorfismoOverrice;

public class Teste {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		p1.setNome("Jonas");
		p1.setSobrenome("Silva");

		Aluno a1 = new Aluno();
		a1.setNome("Pedro");
		a1.setSobrenome("Souza");
		a1.setMatricula("a123");

		System.out.println(p1.obterDados());
		System.out.println(a1.obterDados());
		System.out.println(a1);
	}
}
