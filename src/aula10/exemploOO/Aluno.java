package aula10.exemploOO;

public class Aluno {
	String nome;
	String sobrenome;
	String matricula;
	float[] notas = new float[3];

	float calculaMedia(){
		float soma = 0;
		for(int i=0;i<notas.length;i++)
			soma+=notas[i];
		return soma/notas.length;
	}

	String verificaStatus(float mediaMinima){
		float media = calculaMedia();
		if(media>=mediaMinima){
			return "aprovado";
		}
		else{
			return "recuperação";
		}
	}

	String obterDadosAluno(){
		String retorno = "Nome: "+nome+" "+sobrenome;
		retorno+="\nMédia = "+calculaMedia();
		return retorno;
	}

}
