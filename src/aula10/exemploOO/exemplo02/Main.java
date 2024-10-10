package aula10.exemploOO.exemplo02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite o nome do aluno: ");
		String nome = ler.nextLine();
		System.out.print("Qual o sobrenome do aluno: ");
		String sobrenome = ler.nextLine();
		Aluno alunoUm = new Aluno(nome,sobrenome);
		System.out.println("Sobre o aluno "+alunoUm.nome+" informe");
		for(int i=0;i<3;i++){
			System.out.print((i+1)+"° nota: ");
			float nota = ler.nextFloat();
			alunoUm.notas[i] = nota;
		}
		System.out.println(alunoUm.obterDadosAluno());
		System.out.println("E está "+alunoUm.verificaStatus(6));
	}
}
