package aula07.matrizes;

public class Exemplo03 {
	public static void main(String[] args) {
		int[] vetor = {1,2,3,4,5,6,7};
		int[] vetor2 = vetor;
		System.out.println("Dados do vetor:");
		for(int i:vetor){
			System.out.print(i+" ");
		}
		System.out.println("\nDados do vetor 2:");
		for(int i:vetor2){
			System.out.print(i+" ");
		}

		vetor2[1] = 10;
		System.out.println("\nDados do vetor:");
		for(int i:vetor){
			System.out.print(i+" ");
		}
		System.out.println("\nDados do vetor 2:");
		for(int i:vetor2){
			System.out.print(i+" ");
		}

		vetor2 = new int[10];
		//System.arraycopy(vetor,0,vetor2,0,vetor.length);
		for(int i=0;i< vetor.length;i++){
			vetor2[i] = vetor[i];
		}
		vetor[3] = 100;
		System.out.println("\nDados do vetor:");
		for(int i:vetor){
			System.out.print(i+" ");
		}
		System.out.println("\nDados do vetor 2:");
		for(int i:vetor2){
			System.out.print(i+" ");
		}
	}
}
