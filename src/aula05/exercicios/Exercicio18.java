package aula05.exercicios;

import java.util.Scanner;

/**
 * Escreva um algoritmo que leia o código de uma figura geométrica
 * (1 - triângulo, 2 - quadrado, 3 - círculo, 4 - retângulo).
 * Depois de escolhida a figura, leia as informações necessárias
 * para calcular a área da figura correspondente, calcule e escreva
 * o valor da área.
 */
public class Exercicio18 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Selecione um tipo de figura para calcular a área");
		System.out.println("t - triângulo retângulo");
		System.out.println("q - quadrado");
		System.out.println("c - círculo");
		System.out.print("r - retângulo: ");
		char opc = ler.next().toLowerCase().charAt(0);
		switch (opc){
			case 't'->{
				System.out.print("Qual o valor da base: ");
				float base = ler.nextFloat();
				System.out.print("Qual o valor da altura: ");
				float altura = ler.nextFloat();
				float area = base*altura/2;
				System.out.printf("A área do triângulo vale %.2f cm²\n",area);
			}
			case 'q'->{
				System.out.print("Qual o valor do lado: ");
				float lado = ler.nextFloat();
				float area = lado*lado;
				System.out.printf("A área do quadrado vale %.2f cm²\n",area);
			}
			case 'c'->{
				System.out.print("Qual o valor do raio: ");
				float raio = ler.nextFloat();
				double area = Math.PI*Math.pow(raio,2);
				System.out.printf("A área do círculo vale %.2f cm²\n",area);
			}
			case 'r'->{
				System.out.print("Qual o valor da base: ");
				float base = ler.nextFloat();
				System.out.print("Qual o valor da altura: ");
				float altura = ler.nextFloat();
				float area = base*altura;
				System.out.printf("A área do retângulo vale %.2f cm²\n",area);
			}
			default -> System.out.println("Opção não suportada!");
		}
	}
}
