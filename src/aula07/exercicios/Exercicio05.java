package aula07.exercicios;

import java.util.Random;

public class Exercicio05 {
	public static void main(String[] args) {
		Random aleatorio = new Random();
		int[] vetor = new int[20];
		int[] par = new int[20];
		int[] impar = new int[20];
		int cp = 0;
		int ci = 0;

		for(int i=0;i<vetor.length;i++){
			vetor[i] = aleatorio.nextInt(1,100);
			if(vetor[i]%2==0){
				par[cp] = vetor[i];
				cp++;
			}
			else{
				impar[ci] = vetor[i];
				ci++;
			}
			System.out.print(vetor[i]+" ");
		}
		System.out.println("\nSão pares:");
		for(int i=0;i<cp;i++){
			System.out.print(par[i]+" ");
		}
		System.out.println("\nSão impares:");
		for(int i=0;i<ci;i++){
			System.out.print(impar[i]+" ");
		}
	}
}
