package aula12.exercicioConta;

import java.util.Random;

public class Conta {
	private String titular;
	private String identificador;
	private String senha;
	protected float saldo;

	public Conta(String titular, String senha){
		this.titular = titular;
		this.senha = senha;
		identificador = geraIdentificador();
		saldo = 0;
	}

	private String geraIdentificador(){
		Random aleatorio = new Random();
		char letra = (char)aleatorio.nextInt(65,90);
		return letra+"_"+aleatorio.nextInt(1000,10000);
	}

	public void depositar(float valor){
		saldo+=valor;
	}

	public String getIdentificador(){
		return identificador;
	}

	public void setSenha(String senha){
		this.senha = senha;
	}

	public boolean validaAcesso(String identificador, String senha){
		return this.identificador.equals(identificador) && this.senha.equals(senha);
	}

}
