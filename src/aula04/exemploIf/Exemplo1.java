package aula04.exemploIf;

import java.util.Scanner;

public class Exemplo1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int n = ler.nextInt();
		// == -> testa se o valor é igual, para tipos primitivos float, int,
		// double, char
		// a > b -> testa se o valor de a é maior que o valor de b
		// a < b -> testa se o valor de a é menor que o valor de b
		// a <= b -> testa se o valor de a é menor ou igual ao de b
		// a >= b -> testa se o valor de a é maior ou igual ao de b
		// a != b -> testa se o valor de a é diferente de b
		if(n<0)
			System.out.println(n+" é negativo");
		else if(n>0)
			System.out.println(n+" é positivo");
		else {
			System.out.println(n + " é zero");
			System.out.println("Aqui é o senão...");
		}
	}
}
