package aula07.exercicios;

import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		float[] notas = new float[10];
		float soma = 0;
		for(int i=0;i< notas.length;i++){
			System.out.print("Qual a média do aluno "+(i+1)+": ");
			notas[i] = ler.nextFloat();
			soma+=notas[i];
		}
		float media = soma/notas.length;
		int contAcima=0;
		for(int i=0;i<notas.length;i++){
			if(notas[i]>media)
				contAcima++;
		}
		System.out.printf("Média da turma %.2f\n",media);
		System.out.println("Estão acima da média da turma "+contAcima+" alunos");
	}
}
