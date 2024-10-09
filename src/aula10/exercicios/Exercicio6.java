package aula10.exercicios;

public class Exercicio6 {
	public static boolean ePrimo(int numero){
		int contDiv = 0;
		for(int i=1;i<=numero;i++){
			if(numero%i==0)
				contDiv++;
		}
		return contDiv==2;
	}

	public static void main(String[] args) {
		for(int i=1;i<1000;i++){
			if(ePrimo(i))
				System.out.print(i+" ");
		}
	}
}
