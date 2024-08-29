package aula01;

import java.util.Scanner;

public class Exemplo3 {
	public static void main(String[] args) {
		//Preciso criar uma instância da classe Scanner do Java
		Scanner ler = new Scanner(System.in);

		System.out.print("Digite um número inteiro: ");
		//Para ler um número inteiro do teclado, uso o método nextInt() da classe
		// Scanner
		int numero = ler.nextInt();
		//scanf("%d",&numero);
		System.out.println("O número digitado foi "+numero);
		System.out.printf("O número digitado foi %d\n",numero);
		//Número float
		System.out.print("Digite a medida em metros: ");
		float medida = ler.nextFloat();
		System.out.printf("A medida vale %.2f m\n",medida);
		System.out.println("A medida vale "+medida+"m");



	}
}
