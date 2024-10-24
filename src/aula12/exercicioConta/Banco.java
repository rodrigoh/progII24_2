package aula12.exercicioConta;


import java.util.Scanner;

public class Banco {

	public static String leString(String mensagem){
		System.out.print(mensagem+": ");
		return new Scanner(System.in).nextLine();
	}

	public static float leFloat(String mensagem){
		System.out.print(mensagem+": ");
		return new Scanner(System.in).nextFloat();
	}

	public static int leInt(String mensagem){
		System.out.print(mensagem+": ");
		return new Scanner(System.in).nextInt();
	}

	public static ContaCorrente acessaContaCorrente(ContaCorrente c1){
		String opc;
		do{
			System.out.println("Acessando a conta corrente "+c1.getIdentificador());
			System.out.println("Selecione uma opção");
			System.out.println("d - depositar");
			System.out.println("s - sacar");
			System.out.println("v - verificar saldo");
			System.out.println("e - sair da conta");
			opc = leString("").toLowerCase();
			switch (opc){
				case "d"->{
					float valor = leFloat("Qual o valor");
					c1.depositar(valor);
					System.out.println("Deposito realizado");
				}
				case "s"->{
					float valor = leFloat("Qual o valor");
					if(c1.sacar(valor))
						System.out.println("Saque realizado");
					else
						System.out.println("Saldo + limite insuficiente");
				}
				case "v"-> System.out.println(c1.verificaSaldo());
			}
		}
		while (!opc.equals("e"));
		return c1;
	}

	public static ContaPoupanca acessaContaPoupanca(ContaPoupanca c1){
		String opc;
		do{
			System.out.println("Acessando a conta poupança "+c1.getIdentificador());
			System.out.println("Selecione uma opção");
			System.out.println("d - depositar");
			System.out.println("s - sacar");
			System.out.println("v - verificar saldo");
			System.out.println("e - sair da conta");
			opc = leString("").toLowerCase();
			switch (opc){
				case "d"->{
					float valor = leFloat("Qual o valor");
					c1.depositar(valor);
					System.out.println("Deposito realizado");
				}
				case "s"->{
					float valor = leFloat("Qual o valor");
					if(c1.sacar(valor))
						System.out.println("Saque realizado");
					else
						System.out.println("Saldo insuficiente");
				}
				case "v"-> System.out.println(c1.verificaSaldo());
			}
		}
		while (!opc.equals("e"));
		return c1;
	}

	public static ContaCorrente cadastraContaCorrente(){
		String titular = leString("Qual o nome do titular");
		String senha = leString("Qual a senha");
		float limite = leFloat("Qual o limite inicial");
		return new ContaCorrente(titular,senha,limite);
	}

	public static ContaPoupanca cadastraContaPoupanca(){
		String titular = leString("Qual o nome do titular");
		String senha = leString("Qual a senha");
		float deposito = leFloat("Qual o deposito inicial");
		return new ContaPoupanca(titular,senha,deposito);
	}

	public static void main(String[] args) {
		ContaCorrente[] listaCC = new ContaCorrente[100];
		ContaPoupanca[] listaCP = new ContaPoupanca[100];
		int contCC=0;
		int contCP=0;
	}

}
