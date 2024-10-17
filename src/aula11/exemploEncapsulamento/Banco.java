package aula11.exemploEncapsulamento;

public class Banco {
	public static void main(String[] args) {
		ContaCorrente c1 = new ContaCorrente("Jonass",100);
		c1.depositar(1000);
		System.out.println("Conta criada obteve o id "+c1.getIdentificador());
		System.out.println(c1.verificaSaldo());
		//c1.saldo = 0;
		System.out.println(c1.verificaSaldo());
		c1.setTitular("jonas");

	}
}
