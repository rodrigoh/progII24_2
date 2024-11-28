package aula15.exemploCollections;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pessoa {
	private String nome;
	private String sobrenome;
	private int altura;

	public Pessoa(String nome, String sobrenome, int altura) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.altura = altura;
	}

	@Override
	public String toString(){
		return "Nome: "+nome+" "+sobrenome+" mede "+altura+" metros";
	}
}
