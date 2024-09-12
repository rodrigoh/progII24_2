package aula06.exemploVetores;

import java.util.Scanner;

public class Exemplo1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		//tipo[] nome = new tipo[capacidade]
		int[] vetor = new int[10];
		//Lendo informações para o vetor
		for(int i=0;i<10;i++){
			System.out.println("vetor["+i+"]: ");
			vetor[i] = ler.nextInt();
		}
		System.out.println("Dados no vetor...");
		//Mostrando o vetor na tela
		for(int i=0;i<10;i++){
			System.out.print(vetor[i]+" ");
		}
		System.out.println("\nUsando o para cada");
		//Com o for simplificado
		for(int i:vetor)
			System.out.print(i+" ");
	}
}
