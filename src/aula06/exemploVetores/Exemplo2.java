package aula06.exemploVetores;

import java.util.Scanner;

public class Exemplo2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int[] vetor = new int[100];
		int cont=0;
		char resp;
		do{
			System.out.print("Digite um valor para vetor["+cont+"]: ");
			vetor[cont] = ler.nextInt();
			cont++;
			System.out.print("Tem mais números (s/n): ");
			resp = ler.next().toLowerCase().charAt(0);
		}
		while(resp=='s' && cont<100);
		System.out.println("Dados no vetor...");
		for(int i=0;i<cont;i++){
			System.out.print(vetor[i]+" ");
		}
	}
}
