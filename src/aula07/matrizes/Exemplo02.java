package aula07.matrizes;

public class Exemplo02 {
	public static void main(String[] args) {
		int[] vetor = {1, 2, 3, 4, 5};
		int[][] matriz = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

		System.out.println("O tamanho do vetor é " + vetor.length);
		System.out.println("A matriz tem " + matriz.length + " linhas");
		System.out.println("A matriz tem " + matriz[0].length + " colunas");

		System.out.println("Dados na matriz");
		for (int l = 0; l < matriz.length; l++) {
			for (int c = 0; c < matriz[l].length; c++) {
				System.out.printf("%02d ", matriz[l][c]);
			}
			System.out.println();
		}
		System.out.println("\nElementos na diagonal principal");
		for (int l = 0; l < matriz.length; l++) {
			for (int c = 0; c<matriz[l].length; c++) {
				if(l==c)
					System.out.printf("%02d ", matriz[l][c]);
			}
		}
		System.out.println("\nElementos na diagonal principal opc 2");
		for(int i=0;i<matriz.length;i++)
			System.out.print(matriz[i][i]+" ");

		System.out.println("\nElementos na diagonal secundária");
		for (int l = 0; l < matriz.length; l++) {
			for (int c = 0; c<matriz[l].length; c++) {
				if(l+c==matriz.length-1)
					System.out.printf("%02d ", matriz[l][c]);
			}
		}

		System.out.println("\nImprimindo uma matriz com o for simplificado");
		for(int[] linha : matriz){
			for(int coluna : linha){
				System.out.printf("%02d ",coluna);
			}
			System.out.println();
		}
	}
}
