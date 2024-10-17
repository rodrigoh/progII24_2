package aula11.exemploStatic;

public class Main {
	public static void main(String[] args) {
		Conta c1 = new Conta("Jonas",100);
		Conta c2 = new Conta("Ana",150);
		c1.nomeBanco = "Banco Real";
		System.out.println("Nome banco c1 "+c1.nomeBanco);
		System.out.println("Nome banco c2 "+c2.nomeBanco);
		Conta.nomeBanco = "Teste";
		System.out.println("Nome banco c1 "+c1.nomeBanco);
		System.out.println("Nome banco c2 "+c2.nomeBanco);

		//Exemplos de uso de métodos estáticos
		//Não precisa criar instância
		//Operacoes op = new Operacoes();
		System.out.println(Operacoes.soma(5,2));
		int[] v = {5,9,8,7};
		System.out.println(Operacoes.soma(v));
	}
}
