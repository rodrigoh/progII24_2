package aula06.exercicios;

import java.util.Scanner;

/**
 * Escreva um algoritmo que leia 10 valores e conte quantos deles
 * estão no intervalo entre 10 e 20. Depois escreva essa informação
 */
public class Exercicio02 {
	public static void main(String[] args) {
		int cont=0;
		for(int i=0;i<10;i++){
			System.out.print("Digite o "+(i+1)+"º valor: ");
			int valor = new Scanner(System.in).nextInt();
			if(valor>=10 && valor<=20)
				cont++;
		}
		System.out.println("Dos valores digitados estão entre 10 e 20 "+cont);
	}
}
