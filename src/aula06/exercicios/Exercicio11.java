package aula06.exercicios;

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite um número entre 1 e 10: ");
		int valor = ler.nextInt();
		while(valor<1 || valor>10){
			System.out.print("Eu disse entre 1 e 10: ");
			valor = ler.nextInt();
		}
		for(int i=1;i<=10;i++){
			System.out.println(i+" x "+valor+" = "+valor*i);
		}
	}
}
