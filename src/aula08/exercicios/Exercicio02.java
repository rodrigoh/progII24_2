package aula08.exercicios;

import java.util.Random;

public class Exercicio02 {
	public static void main(String[] args) {
		Random aleatorio = new Random();
		int[][] matriz = new int[4][4];
		int somaLinha = 0;
		int somaColuna = 0;
		int somaT = 0;
		for(int l=0;l<matriz.length;l++){
			for(int c=0;c<matriz[l].length;c++){
				matriz[l][c] = aleatorio.nextInt(1,50);
				System.out.printf("%02d ",matriz[l][c]);
				if(l==3)
					somaLinha+=matriz[l][c];
				if(c==2)
					somaColuna+=matriz[l][c];
				somaT+=matriz[l][c];
			}
			System.out.println();
		}
		System.out.println("A soma de todos os elementos da matriz vale "+somaT);
		System.out.println("A soma dos elementos da linha de índice 3 vale "+somaLinha);
		System.out.println("A soma dos elementos da coluna de índice 2 vale "+somaColuna);
	}
}
