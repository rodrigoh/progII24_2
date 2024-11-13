package aula14.exemploExcecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExemploDois {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		boolean ok = false;
		int n1;
		do{
			try {
				System.out.print("Digite um número: ");
				n1 = ler.nextInt();
				ok = true;
			}
			catch (InputMismatchException e){
				//ler.next();
				ler = new Scanner(System.in);
				System.out.println("Precisa digitar um número");
				ok = false;
			}
		}
		while (!ok);
	}
}
