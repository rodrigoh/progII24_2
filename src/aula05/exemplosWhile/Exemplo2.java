package aula05.exemplosWhile;

import java.util.Scanner;

public class Exemplo2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite uma nota: ");
		int nota = ler.nextInt();
		while (nota<0 || nota>10){
			System.out.print("Nota é inválida, digite outra: ");
			nota = ler.nextInt();
		}
		System.out.println("Agora deu certo, a nota é "+nota);
	}
}
