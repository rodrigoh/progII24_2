package aula08.exercicios;

import java.util.Random;

public class Exercicio07 {
	public static void main(String[] args) {
		Random aleatorio = new Random();
		int[][] matriz = new int[5][5];
		int somaAcima = 0;
		int somaAbaixo = 0;
		int somaD = 0;
		int somaDI = 0;
		System.out.println("Dados na matriz...");
		for(int l=0;l<matriz.length;l++){
			for(int c=0;c<matriz[l].length;c++){
				matriz[l][c] = aleatorio.nextInt(1,50);
				System.out.printf("%02d ",matriz[l][c]);
			}
			System.out.println();
		}
		for(int l=0;l<matriz.length;l++) {
			for (int c = 0; c < matriz[l].length; c++) {
				//Diagonal principal
				if(l==c)
					somaD+=matriz[l][c];
				//Elementos acima da diagonal
				if(l<c)
					somaAcima+=matriz[l][c];
				//Elementos abaixo da diagonal (l>c)
				else
					somaAbaixo+=matriz[l][c];
				//matriz.length-1 = 4
				//Diagonal secundária
				if(l+c==matriz.length-1)
					somaDI+=matriz[l][c];
			}
		}
		System.out.println("As somas valem");
		System.out.println("Diagonal principal "+somaD);
		System.out.println("Diagonal secundária "+somaDI);
		System.out.println("Elementos acima da diagonal "+somaAcima);
		System.out.println("Elementos abaixo da diagonal "+somaAbaixo);
	}
}
