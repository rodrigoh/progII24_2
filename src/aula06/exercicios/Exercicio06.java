package aula06.exercicios;

import java.util.Locale;
import java.util.Scanner;

/**
 * Escreva um algoritmo para ler um valor entre 1 (inclusive)
 * e 10 (inclusive). Se o valor lido não estiver entre 1 (inclusive)
 * e 10 (inclusive), deve ser lido um novo valor.
 * Após a leitura do valor, escrever o valor lido na tela.
 */
public class Exercicio06 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		char opc;
		float n1;
		float n2;
		float media;
		do{
			System.out.print("Entre com a primeira nota: ");
			n1 = ler.nextFloat();
			while(n1<0 || n1>10){
				System.out.print("Nota inválida, digite outra: ");
				n1 = ler.nextFloat();
			}
			System.out.print("Entre com a segunda nota: ");
			n2 = ler.nextFloat();
			while(n2<0 || n2>10){
				System.out.print("Nota inválida, digite outra: ");
				n2 = ler.nextFloat();
			}
			media = (n1+n2)/2;
			System.out.printf("Sua média é de %.2f\n",media);
			System.out.print("Tem mais alunos (s/n): ");
			opc = ler.next().toLowerCase().charAt(0);
		}
		while(opc=='s');
	}
}
