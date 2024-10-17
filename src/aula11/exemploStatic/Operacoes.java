package aula11.exemploStatic;

public class Operacoes {

	static int soma(int n1, int n2){
		return n1+n2;
	}

	static int soma(int[] vetor){
		var soma = 0;
		for(int i=0;i< vetor.length;i++){
			soma+=vetor[i];
		}
		return soma;
	}
}
