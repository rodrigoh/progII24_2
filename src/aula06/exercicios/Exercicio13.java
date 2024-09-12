package aula06.exercicios;

import java.util.Scanner;

/**
 * Escreva um algoritmo que pergunte ao usuário um número e
 * após, escreva na tela a soma total de 1 até o número lido.
 * Exemplo:  Número lido é o 5. Resultado: 1+2+3+4+5 = 15
 */
public class Exercicio13 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite um número maior que 1: ");
		int num = ler.nextInt();
		int soma = 0;
		for(int i=1;i<num;i++){
			System.out.print(i+"+");
			soma+=i;
		}
		soma+=num;
		System.out.println(num+"="+soma);
	}
}
