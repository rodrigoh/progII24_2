package aula08.exercicios;

import java.util.Random;

public class Exercicio03 {
	public static void main(String[] args) {
		Random aleatoria = new Random();
		int[][] matriz = new int[3][3];
		int[] sl = new int[3];
		int[] sc = new int[3];
		for(int l=0;l< matriz.length;l++){
			for(int c=0;c<matriz[l].length;c++){
				matriz[l][c] = aleatoria.nextInt(1,50);
				System.out.printf("%02d ",matriz[l][c]);
			}
			System.out.println();
		}
		//0 1 2
		for(int i=0;i< 3;i++) {
			for (int j = 0; j < 3; j++) {
				sl[i] += matriz[i][j];
				sc[i] += matriz[j][i];
			}
		}
		System.out.println("Soma de cada linha:");
		for(int i:sl)
			System.out.print(i+" ");
		System.out.println("\nSoma de cada coluna:");
		for(int i:sc)
			System.out.print(i+" ");
	}
}
