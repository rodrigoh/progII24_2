package aula07.exercicios;

import java.util.Random;

public class Exercicio03 {
	public static void main(String[] args) {
		Random aleatorio = new Random();
		int[] vetor = new int[10];
		int[] vetorI = new int[10];
		System.out.println("Dados no vetor...");
		for(int i=0;i<vetor.length;i++){
			vetor[i] = aleatorio.nextInt(1,50);
			System.out.print(vetor[i]+" ");
		}
		System.out.println("\nDados no vetorI");
		for(int i=0, j=9;i<10;i++,j--){
			vetorI[i] = vetor[j];
			System.out.print(vetorI[i]+" ");
		}
	}
}
