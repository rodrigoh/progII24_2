package aula06.exemploVetores;

import java.util.Random;

public class Exemplo4 {
	public static void main(String[] args) {
		int[] vetor = new int[100];
		Random aleatorio = new Random();
		System.out.println("Dados no vetor...");
		for(int i=0;i<vetor.length;i++) {
			vetor[i] = aleatorio.nextInt(50, 300);
			System.out.print(vetor[i]+" ");
		}
	}
}
