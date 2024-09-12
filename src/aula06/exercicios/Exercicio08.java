package aula06.exercicios;

import java.util.Scanner;

/**
 * Escreva um algoritmo para pedir que o usuário digite números
 * positivos, ou seja, ele pode digitar quantos números positivos
 * ele quiser. Para parar de digitar números, ele deve digitar -1.
 * Após o usuário digitar -1, o programa deve escrever na tela
 * quantos números o usuário digitou (a quantidade de números
 * lidos) e a soma total dos números que ele digitou.
 */
public class Exercicio08 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num;
		int cont = 0;
		int soma = 0;
		do{
			System.out.print("Digite um número e -1 para encerrar: ");
			num = ler.nextInt();
			if(num>=0) {
				cont++;
				soma += num;
			}
		}
		while(num>=0);
		System.out.println("Foram digitados "+cont+" números que somados valem "+soma);

	}
}
