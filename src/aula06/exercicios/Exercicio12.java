package aula06.exercicios;

import java.util.Scanner;

public class Exercicio12 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite um valor para testar se é primo ou não: ");
		long numero = ler.nextLong();
		int contDiv = 0;
		for(long i=1;i<=numero;i++)
			if(numero%i==0)
				contDiv++;
		if(contDiv==2)
			System.out.println(numero+" é primo");
		else
			System.out.println(numero+" não é primo");
	}
}
