package aula08.exemploMetodos;

import java.util.Random;
import java.util.Scanner;

public class Exemplo03 {

//	public static boolean pesquisaNumero(int[][] matriz, int numero){
//		boolean achei = false;
//		for(int l=0;l< matriz.length;l++){
//			for(int c=0;c<matriz[l].length;c++){
//				if(matriz[l][c]==numero)
//					achei = true;
//			}
//		}
//		return achei;
//	}

	public static boolean pesquisaNumero(int[][] matriz, int numero){
		for(int l=0;l< matriz.length;l++){
			for(int c=0;c<matriz[l].length;c++){
				if(matriz[l][c]==numero)
					return true;
			}
		}
		return false;
	}

	public static String imprimeMatriz(int[][] matriz){
		String resultado = "";
		for(int[] linha: matriz){
			for(int c:linha){
				//System.out.printf("%02d ",c);
				resultado+=String.format("%02d ",c);
			}
			resultado+="\n";
		}
		return resultado;
	}

	public static void geraMatriz(int[][] matriz){
		Random aleatorio = new Random();
		for(int i=0;i<matriz.length;i++){
			for(int j=0;j<matriz[i].length;j++){
				matriz[i][j] = aleatorio.nextInt(1,100);
			}
		}
	}
	//Soma a diagonal[0]
	//Soma acima dela[1]
	//soma abaixo dela[2]
	public static int[] somaElementos(int[][] matriz){
		int[] resultado = new int[3];
		for(int l=0;l<matriz.length;l++){
			for(int c=0;c<matriz[l].length;c++){
				if(l==c)
					resultado[0]+=matriz[l][c];
				else if(l<c)
					resultado[1]+=matriz[l][c];
				else
					resultado[2]+=matriz[l][c];
			}
		}
		return resultado;
	}

	public static void main(String[] args) {
		int[][] mapa = new int[10][10];
		geraMatriz(mapa);
		System.out.println(imprimeMatriz(mapa));
		System.out.print("Qual número devo pesquisar na matriz: ");
		int valor = new Scanner(System.in).nextInt();
		if(pesquisaNumero(mapa,valor))
			System.out.println(valor+" está na matriz");
		else
			System.out.println(valor+" não está na matriz");

		int[] soma = somaElementos(mapa);
		System.out.println("Soma diagonal "+soma[0]);
		System.out.println("Soma elementos acima "+soma[1]);
		System.out.println("Soma elementos abaixo "+soma[2]);
	}
}
