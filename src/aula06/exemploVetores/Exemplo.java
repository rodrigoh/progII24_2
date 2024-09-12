package aula06.exemploVetores;

public class Exemplo {
	public static void main(String[] args) {
		int[] idades = {12,14,28,45,20,1,10,21};
		String[] nomes = {"João", "Pedro", "Ana", "Jonas", "Betina"};

		System.out.println("O tamanho de idades é "+idades.length);
		System.out.println("O tamanho de nomes é "+nomes.length);
		System.out.println("Dados no vetor idades");

		for(int i=0;i<idades.length;i++){
			System.out.print(idades[i]+" ");
		}

		System.out.println("\nDados no vetor nomes");
		for(String nome: nomes)
			System.out.print(nome+" ");
	}
}
