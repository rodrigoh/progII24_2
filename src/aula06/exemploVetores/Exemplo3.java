package aula06.exemploVetores;

import java.util.Random;

public class Exemplo3 {
	public static void main(String[] args) {
		Random aleatorio = new Random();
		int n = aleatorio.nextInt();
		System.out.println(n);
		n = aleatorio.nextInt(100);
		System.out.println(n);
		n = aleatorio.nextInt(50,150);
		System.out.println(n);
		System.out.println(aleatorio.nextBoolean());
		int valor = aleatorio.nextInt(65,91);
		char letra = (char) valor;
		System.out.println(letra);
	}
}
