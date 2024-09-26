package aula08.exercicios;

import java.util.Random;

public class Exercicio09 {
	public static void main(String[] args) {
		Random aleatorio = new Random();
		int[][] cartela = new int[5][5];
		int[] vetor = new int[25];
		int v = 0;
		for(int l=0;l< cartela.length;l++){
			for(int c=0;c<cartela[l].length;){
				int numero = aleatorio.nextInt(1,99);
				boolean achei = false;
				for(int t=0;t<v;t++){
					if(numero==vetor[t])
						achei = true;
				}
				if(!achei){
					cartela[l][c] = numero;
					vetor[v] = numero;
					v++;
					c++;
				}
			}
		}
		System.out.println("Cartela de bingo");
		for(int[] linha : cartela){
			for(int coluna : linha){
				System.out.printf("%02d ",coluna);
			}
			System.out.println();
		}
//		int meio = (int) cartela.length/2;
//		for(int l=0;l<cartela.length;l++){
//			for(int c=0;c<cartela[l].length;c++){
//				if(l==meio && c==meio)
//					System.out.printf("   ");
//				else
//					System.out.printf("%02d ",cartela[l][c]);
//			}
//			System.out.println();
//		}
	}
}
