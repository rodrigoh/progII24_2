package aula10.exemploOO;

public class Main {
	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		a1.nome = "Jonas";
		a1.sobrenome = "Silva";
		a1.notas[0] = 8;
		a1.notas[1] = 7;
		a1.notas[2] = 8;
		Aluno a2 = new Aluno();
		a2.nome = "Ana";
		a2.sobrenome = "Souza";
		a2.notas[0] = 8;
		a2.notas[1] = 6;
		a2.notas[2] = 10;

		System.out.println("A media do "+a1.nome+" é "+a1.calculaMedia());
		System.out.println(a1.obterDadosAluno());
		System.out.println("A media da "+a2.nome+" é "+a2.calculaMedia());
		System.out.println(a2.obterDadosAluno());
		System.out.println("Ela está "+a2.verificaStatus(8));

	}
}
