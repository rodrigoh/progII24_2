package aula07.exercicios;

import java.security.SecureRandom;
import java.util.Random;

/*
Ler dois vetores: R de 5 elementos e S de 10 elementos.
Gerar um vetor X de 15 elementos cujas 5 primeiras posições
contenham os elementos de R e as 10 últimas posições, os elementos de S.
Escrever o vetor X.
 */
public class Exercicio09 {
	public static void main(String[] args) {
		Random aleatorio = new Random();
		int[] vetorR = new int[5];
		int[] vetorS = new int[10];
		int[] vetorX = new int[15];
		System.out.println("Dados no vetor R");
		for(int i=0;i<vetorR.length;i++){
			vetorR[i] = aleatorio.nextInt(1,10);
			System.out.print(vetorR[i]+" ");
		}
		System.out.println("\nDados no vetor s");
		for(int i=0;i<vetorS.length;i++){
			vetorS[i] = aleatorio.nextInt(1,50);
			System.out.print(vetorS[i]+" ");
		}
		System.out.println("\nDados vetor x");
		for(int i=0;i<15;i++){
			if(i<5)
				vetorX[i] = vetorR[i];
			else
				vetorX[i] = vetorS[i-5];
			System.out.print(vetorX[i]+" ");
		}
	}
}
