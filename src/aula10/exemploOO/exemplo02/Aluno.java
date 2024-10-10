package aula10.exemploOO.exemplo02;

public class Aluno {
	String nome;
	String sobrenome;
	float[] notas = new float[3];

	Aluno(String nome, String sobrenome){
		this.nome = nome;
		this.sobrenome = sobrenome;
	}

	Aluno(String nome, String sobrenome, float n1, float n2, float n3){
		this.nome = nome;
		this.sobrenome = sobrenome;
		notas[0] = n1;
		notas[1] = n2;
		notas[2] = n3;
	}

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
