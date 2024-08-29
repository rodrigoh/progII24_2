package aula04.exercicios;

import java.util.Scanner;

/**
 * Faça um programa em Java que calcule a área de um círculo
 */
public class Exercicio3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Qual o valor do raio em cm: ");
		float raio = ler.nextFloat();
		float area = (float)Math.PI*raio*raio;
		System.out.printf("A área do círculo de raio %.2f vale %.2f cm²\n",raio,
						area);
	}
}
