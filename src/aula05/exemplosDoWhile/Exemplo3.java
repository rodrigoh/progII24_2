package aula05.exemplosDoWhile;

import java.util.Scanner;

public class Exemplo3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int nota;
		do{
			System.out.print("Entre com uma nota: ");
			 nota = ler.nextInt();
			 if(nota<0 || nota>10)
				 System.out.println("Nota inválida!");
		}
		while(nota<0 || nota>10);
	}
}
