package aula13.exemploPolimorfismo;

public class Teste {
	public static void main(String[] args) {
		Calculadora c1 = new Calculadora();

		int[] v = {1,2,3,5,9,7};

		System.out.println("Somando vetor: "+c1.soma(v));
		System.out.println("Somando números inteiros: "+c1.soma(5,7));
		System.out.println("Somando strings "+c1.soma("Aula","programação"));
	}
}
