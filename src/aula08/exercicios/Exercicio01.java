package aula08.exercicios;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		//tipo[][] nome = new tipo[nLinhas][nColunas]
		int[][] matriz = new int[2][3];
		for(int l=0;l<2;l++){
			for(int c=0;c<3;c++){
				System.out.print("matriz["+l+"]["+c+"] = ");
				matriz[l][c] = ler.nextInt();
			}
		}
		System.out.print("Qual número devo procurar na matriz: ");
		int valor = ler.nextInt();
		boolean achei = false;
		for(int l=0;l<matriz.length;l++){
			for(int c=0;c<matriz[l].length;c++){
				System.out.printf("%02d ",matriz[l][c]);
				if(matriz[l][c]==valor)
					achei = true;
			}
			System.out.println();
		}
		if(achei)
			System.out.println(valor+" está na matriz");
		else
			System.out.println(valor+" não está na matriz");
	}
}
