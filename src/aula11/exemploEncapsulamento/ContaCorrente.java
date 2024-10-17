package aula11.exemploEncapsulamento;

import java.util.Random;

public class ContaCorrente {
	private String titular;
	private String identificador;
	private float saldo;
	private float limite;

	public ContaCorrente(String titular, float limite){
		this.titular = titular;
		this.limite = limite;
		geraIdentificador();
	}

	public float getLimite(){
		return limite;
	}

	public void setLimite(float limite){
		this.limite = limite;
	}

	public void setTitular(String titular){
		this.titular = titular;
	}

	public String getTitular(){
		return titular;
	}

	public String getIdentificador(){
		return identificador;
	}

	public boolean sacar(float valor){
		if(saldo+limite>=valor) {
			saldo -= valor;
			return true;
		}
		return false;
	}

	public void depositar(float valor){
		saldo+=valor;
	}

	private void geraIdentificador(){
		Random aleatorio = new Random();
		char letra = (char)aleatorio.nextInt(65,90);
		identificador = letra+"_"+aleatorio.nextInt(1000,10000);
	}

	public String verificaSaldo(){
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
