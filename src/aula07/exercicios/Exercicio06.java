package aula07.exercicios;

import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String[] nomes = {"Ana", "Bruno", "Carlos", "Daniela", "Eduardo", "Fernanda", "Gabriel", "Helena", "Isabela", "João"};
		System.out.println("Tenho uma lista de "+nomes.length+" nomes");
		System.out.print("Tente adivinhar um nome que esteja nela: ");
		String nome = ler.next();

		boolean achei = false;
		for(int i=0;i<nomes.length && !achei;i++){
			if(nomes[i].equalsIgnoreCase(nome))
				achei = true;
		}
		if(achei)
			System.out.println(nome+ " está na lista");
		else
			System.out.println(nome+ " não está na lista");

	}
}
