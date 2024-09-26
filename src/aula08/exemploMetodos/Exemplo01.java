package aula08.exemploMetodos;

import java.util.Random;

public class Exemplo01 {

	public static int somaVetor(int[] lista){
		int soma = 0;
		for(int i=0;i< lista.length;i++){
			soma+=lista[i];
		}
		return soma;
	}

	public static void main(String[] args) {
		Random aleatorio = new Random();
		int[] vetor = new int[10];
		for (int i=0;i<vetor.length;i++){
			vetor[i] = aleatorio.nextInt(1,50);
			System.out.print(vetor[i]+" ");
		}

		int soma = somaVetor(vetor);
		System.out.println("\nA soma dos elementos do vetor vale "+soma);
	}
}
