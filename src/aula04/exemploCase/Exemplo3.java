package aula04.exemploCase;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Entre com o nome de um mês: ");
		String mes = ler.next();
		switch (mes){
			case "janeiro", "Janeiro"-> System.out.println("O mês equivale ao número 1");
			case "fevereiro", "Fevereiro"-> System.out.println("O mês equivale ao número 2");
			//...
			default -> System.out.println("O que tu digitou não é um mês");
		}
	}
}
