package aula07.matrizes;

import java.util.Scanner;

public class Exemplo01 {
	public static void main(String[] args) {
		//int[] vetor = new int[10];
		//tipo[][] nome = new tipo[nLinhas][nColunas]
		Scanner ler = new Scanner(System.in);
		int[][] matriz = new int[2][3];

		for(int l=0;l<2;l++){
			for(int c=0;c<3;c++){
				System.out.print("matriz["+l+"]["+c+"]: ");
				matriz[l][c] = ler.nextInt();
			}
		}
		for(int l=0;l<2;l++){
			for(int c=0;c<3;c++){
				System.out.printf("%02d ",matriz[l][c]);
			}
			System.out.println();
		}
	}
}
