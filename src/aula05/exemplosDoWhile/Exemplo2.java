package aula05.exemplosDoWhile;

public class Exemplo2 {
	public static void main(String[] args) {
		int cont = 10;
		while(cont<10){
			System.out.print(cont+" ");
			cont++;
		}
		//Mesmo que a condição já seja inválida o do..while executa uma vez
		do{
			System.out.print(cont+" ");
			cont++;
		}
		while(cont<10);
		System.out.println("\ncont "+cont);
	}
}
