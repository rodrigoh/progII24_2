package aula01;

public class Exemplo1 {
	public static void main(String[] args){
		//Usa a mesma sintaxe do printf do C
		System.out.printf("Olá mundo!\n");
		//Imprime o texto na tela e quebra linha no final
		System.out.println("Olá mundo!");
		//Imprime o texto na tela sem quebra de linha no final
		System.out.print("Olá mundo!\n");
		//Declarando variáveis
		String nome = "Jonas";
		int altura = 180;
		//Imprimir essas variáveis usando printf
		System.out.printf("Nome: %s, altura: %d cm\n",nome,altura);
		//Imprimir essas variáveis usando print ou println
		System.out.println("Nome: "+nome+", altura: "+altura+" cm");

	}

}
