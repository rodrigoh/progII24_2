package aula10.exercicios;

import java.util.Random;

public class Exercicio3_4 {

	public static int dado(){
		Random aleatorio = new Random();
		return aleatorio.nextInt(6);
	}

	public static void main(String[] args) {
		int[] lancamentos = new int[6];
		int total = 1000000;
		for(int i=0;i<total;i++){
			int valor = dado();
			lancamentos[valor]++;
		}
		for(int i=0;i<6;i++){
			float percentual = lancamentos[i]/(float)total*100;
			System.out.println("A face "+(i+1)+" foi sorteada "+lancamentos[i]+" " +
							"vezes, o que representa "+percentual+"% das vezes");
		}
	}
}
