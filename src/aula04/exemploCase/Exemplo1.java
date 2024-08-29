package aula04.exemploCase;

import java.util.Scanner;

public class Exemplo1 {
	public static void main(String[] args) {
		//Scanner ler = new Scanner(System.in);
		System.out.print("Entre com um número de 1 a 7: ");
		int dia = new Scanner(System.in).nextInt();

		switch(dia){
			case 1:
				System.out.println("É segunda feira");
				System.out.println("É dia útil");
				break;
			case 2:
				System.out.println("É terça feira");
				System.out.println("É dia útil");
				break;
			case 3:
				System.out.println("É quarta feira");
				System.out.println("É dia útil");
				break;
			case 4:
				System.out.println("É quinta feira");
				System.out.println("É dia útil");
				break;
			case 5:
				System.out.println("É sexta feira");
				System.out.println("É dia útil");
				break;
			case 6:
				System.out.println("É sábado");
				break;
			case 7:
				System.out.println("É domingo");
				break;
				//o default é opcional
			default:
				System.out.println("O número informado não corresponde a nenhum dia");

		}
	}
}
