package aula08.exemploMetodos;

import java.util.Scanner;

public class Exemplo02 {

	public static int soma(int n1, int n2){
		return n1+n2;
	}

	public static int achaMaior(int n1, int n2){
		if(n1<n2)
			return n2;
		else
			return n1;
	}

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int v1 = ler.nextInt();
		System.out.print("Digite um número: ");
		int v2 = ler.nextInt();
		System.out.println("A soma dos números vale "+soma(v1,v2));
		int maior = achaMaior(v1,v2);
		System.out.println("O maior deles "+maior);

	}

//	public static int achaMaior(int n1, int n2){
//		int retorno = 0;
//		if(n1<n2)
//			retorno = n2;
//		else if(n2<n1)
//			retorno =  n1;
//		return retorno;
//	}
}
