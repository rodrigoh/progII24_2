package aula06.exemploVetores;

import java.util.Random;
import java.util.Scanner;

public class Exemplo5 {
	public static void main(String[] args) {
		Random aleatorio = new Random();
		Scanner ler = new Scanner(System.in);
		int[] vetor = new int[10];
		int tamanho = vetor.length;
		for(int i=0;i<tamanho;i++){
			vetor[i] = aleatorio.nextInt(1,50);
			System.out.print(vetor[i]+" ");
		}
		System.out.print("\nDos números acima qual devo remover: ");
		int remove = ler.nextInt();
		int posicao = -1;
		//Buscar o número do vetor
		for(int i=0;i<tamanho;i++){
			if(vetor[i]==remove)
				posicao = i;
		}
		//Verificar se achei ou não o número
		if(posicao>=0){
			//Remover...
			for(int i=posicao;i<tamanho-1;i++)
				vetor[i] = vetor[i+1];
			tamanho--;
			System.out.println("\nDados no vetor");
			for(int i=0;i<tamanho;i++){
				System.out.print(vetor[i]+" ");
			}
		}
		else{
			System.out.println("Ops, o valor nem está no vetor");
		}
	}
}
