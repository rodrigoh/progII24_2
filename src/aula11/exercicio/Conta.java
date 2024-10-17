package aula11.exercicio;

import java.util.Random;

public class Conta {
	String titular;
	String identificador;
	float saldo;
	float limite;

	Conta(String titular, float limite){
		this.titular = titular;
		this.limite = limite;
		geraIdentificador();
	}

	boolean sacar(float valor){
		if(saldo+limite>=valor) {
			saldo -= valor;
			return true;
		}
		return false;
	}

	void depositar(float valor){
		saldo+=valor;
	}

	void geraIdentificador(){
		Random aleatorio = new Random();
		char letra = (char)aleatorio.nextInt(65,90);
		identificador = letra+"_"+aleatorio.nextInt(1000,10000);
	}

	String verificaSaldo(){
		String retorno = "Seu saldo é de R$"+String.format("%.2f",saldo);
		if(saldo<0){
			retorno+="\nSeu limite é de R$"+String.format("%.2f",saldo+limite);
		}
		else {
			retorno += "\nSeu limite é de R$" + String.format("%.2f", limite);
		}
		return retorno;
	}

}
