package aula14.exemploExcecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExemploUm {
	public static void main(String[] args){
		try {
			Scanner ler = new Scanner(System.in);
			System.out.print("Digite o primeiro número: ");
			int n1 = ler.nextInt();
			System.out.print("Digite o segundo número: ");
			int n2 = ler.nextInt();
			float r = n1 / n2;
			System.out.println(r);
		}
		catch (InputMismatchException e){
			System.out.println("n1 e n2 precisam ser números");

		}
		catch (ArithmeticException e){
			System.out.println("Não é possível dividir por zero!");
			System.out.println(e.getMessage());
		}
		catch (Exception e){
			System.out.println("Algo mais deu errado...");
		}
	}
}
