package aula11.exercicio;

import java.util.Scanner;

public class Banco {


	static Conta acessaConta(Conta c1) {
		Scanner ler = new Scanner(System.in);
		String opcSub;
		do {
			System.out.println("Acessando a conta " + c1.identificador);
			System.out.println("selecione uma operação");
			System.out.println("d - depositar");
			System.out.println("s - sacar");
			System.out.println("v - verificar saldo");
			System.out.println("e - sair");
			opcSub = ler.next().toLowerCase();
			switch (opcSub) {
				case "d" -> {
					System.out.print("Qual o valor deseja depositar ");
					float valor = ler.nextFloat();
					c1.depositar(valor);
					System.out.println("Deposito realizado");
				}
				case "s" -> {
					System.out.print("Qual o valor deseja sacar ");
					float valor = ler.nextFloat();
					if (c1.sacar(valor))
						System.out.println("Saque realizado");
					else
						System.out.println("Saldo insuficiente");
				}
				case "v" -> System.out.println(c1.verificaSaldo());
			}
		}
		while (!opcSub.equals("e"));
		return c1;
	}

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Conta[] listaConta = new Conta[100];
		int cont = 0;
		String opc;
		do {
			System.out.println("Bem vindo ao banco");
			System.out.println("Selecione uma opção");
			System.out.println("c - criar uma conta");
			System.out.println("s - sair do sistema");
			System.out.println("a - acessar uma conta");
			opc = ler.next().toLowerCase();
			switch (opc) {
				case "c" -> {
					System.out.print("Qual o nome do titular: ");
					String titular = ler.next();
					System.out.print("Qual o limite inicial: ");
					float limite = ler.nextFloat();
					listaConta[cont] = new Conta(titular, limite);
					System.out.println("Conta criada obteve o identificador " +
									listaConta[cont].identificador);
					cont++;
				}
				case "a" -> {
					System.out.print("Qual o identificador da sua conta: ");
					String id = ler.next();
					int posicao = -1;
					for (int i = 0; i < cont && posicao == -1; i++) {
						if (listaConta[i].identificador.equalsIgnoreCase(id))
							posicao = i;
					}
					//Operações com a conta
					if (posicao >= 0) {
						listaConta[posicao] = acessaConta(listaConta[posicao]);
					} else {
						System.out.println("conta não encontrada");

					}
				}
			}
		}while (!opc.equals("s"));

	}
}
