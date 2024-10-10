package aula10.exemploOO.exercicio01;

public class Lampada {
	String marca;
	String modelo;
	String cor;
	boolean ligada;

	Lampada(){
		ligada = false;
	}

	Lampada(String marca, String modelo){
		this.marca = marca;
		this.modelo = modelo;
		ligada = false;
	}

	Lampada(String marca, String modelo, String cor){
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		ligada = false;
	}

	Lampada(String marca, String modelo, String cor, boolean status){
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		ligada = status;
	}

	void ligar(){
		ligada = true;
	}
	void desligar(){
		ligada = false;
	}

	boolean estaLigada(){
		return ligada;
	}

	String obterInformacoes(){
		return "Marca: "+marca+", modelo: "+modelo+", cor: "+cor+
						", Ligada? "+(ligada?"Sim":"Não");
		//teste?valor se verdadeiro: valor se falso
		//testes possíveis teste==0, valor==1, numero>0
	}
}
