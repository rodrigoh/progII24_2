package aula07.exercicios;

import java.util.Random;

/*
Ler dois vetores, X e Y de 10 elementos cada um
(ocupando as posições de 0 a 10 em cada vetor). Intercalar os
elementos desses dois vetores formando assim um novo vetor R de 20 elementos,
onde nas
 - posições ímpares de R estejam os elementos de X e
nas
 - posições pares os elementos de Y.
Escrever o vetor R,
após sua completa geração.
 */
public class Exercicio10 {
	public static void main(String[] args) {
		Random aleatorio = new Random();
		int[] vetorX = new int[10];
		int[] vetorY = new int[10];
		int[] vetorR = new int[20];

		System.out.println("\nDados no vetorX");
		for(int i=0;i<10;i++){
			vetorX[i] = aleatorio.nextInt(1,50);
			System.out.print(vetorX[i]+" ");
		}
		System.out.println("\nDados no vetorY");
		for(int i=0;i<10;i++){
			vetorY[i] = aleatorio.nextInt(50,100);
			System.out.print(vetorY[i]+" ");
		}
		int cx = 0;
		int cy = 0;
		System.out.println("\nDados no vetorR");
		for(int i=0;i<20;i++){
			if(i%2==0){
				vetorR[i] = vetorY[cy];
				cy++;
			}
			else{
				vetorR[i] = vetorX[cx];
				cx++;
			}
			System.out.print(vetorR[i]+" ");
		}
	}
}
