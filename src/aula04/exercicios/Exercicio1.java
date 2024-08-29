package aula04.exercicios;

import java.util.Scanner;

/**
 * Faça uma classe Java que peça as 4 notas bimestrais e mostre a média
 */
public class Exercicio1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Entre com a primeira nota: ");
		float n1 = ler.nextFloat();
		System.out.print("Entre com a segunda nota: ");
		float n2 = ler.nextFloat();
		System.out.print("Entre com a terceira nota: ");
		float n3 = ler.nextFloat();
		System.out.print("Entre com a quarta nota: ");
		float n4 = ler.nextFloat();
		float media = (n1+n2+n3+n4)/4;
		System.out.printf("A média do aluno %.2f\n",media);
		System.out.println("A média do aluno é "+media);
		System.out.println("A média do aluno é "+String.format("%.2f",media));

	}
}
