package aula07.exercicios;

import java.util.Random;
import java.util.Scanner;

/*Ler dois vetores, A e B com um número variável de conteúdo (números)
(no máximo 10). O programa deve solicitar antes da leitura dos vetores
a quantidade de dados a serem lidos (1 a 10), os dois vetores terão o
mesmo número de elementos.
Gerar um terceiro vetor chamado Soma (de no máximo 10 elementos) que
seja a soma dos dados do vetor A com os do vetor B.
 */
public class Exercicio01Opc2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Random aleatorio = new Random();
		System.out.print("Informe a capacidade dos vetores (1..10): ");
		int tamanho = ler.nextInt();
		while(tamanho<1 || tamanho>10){
			System.out.print("Eu disse entre 1 e 10: ");
			tamanho = ler.nextInt();
		}
		int[] vetorA = new int[tamanho];
		int[] vetorB = new int[tamanho];
		int[] soma = new int[tamanho];
		for(int i=0;i<vetorA.length;i++) {
			System.out.print("vetorA[" + i + "]: ");
			vetorA[i] = ler.nextInt();
		}
		for(int i=0;i<vetorB.length;i++) {
			System.out.print("vetorB[" + i + "]: ");
			vetorB[i] = ler.nextInt();
		}
		for(int i=0;i<vetorA.length;i++){
			soma[i] = vetorA[i]+vetorB[i];
			System.out.printf("%02d + %02d = %02d\n", vetorA[i],vetorB[i],soma[i]);
		}
	}
}
