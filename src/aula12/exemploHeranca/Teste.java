package aula12.exemploHeranca;

public class Teste {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("Jonas", "Silva","js@gmail.com");
//		f1.setNome("Jonas");
//		f1.setSobrenome("Silva");
//		f1.seteMail("js@gmail.com");
		System.out.println(f1.obterDados());
		Motorista m1 = new Motorista("Fernando","Souza","fernando@gmail.com", "25262563233");
//		m1.setNome("Fernando");
//		m1.setSobrenome("Souza");
//		m1.setCnh("25262563233");
//		m1.seteMail("fernando@gmail.com");
		System.out.println(m1.obterDados());
		System.out.println("CNH: "+m1.getCnh());

		Engenheiro e1 = new Engenheiro("Ana", "Silva", "ana@gmail.com");
//		e1.setNome("Ana");
//		e1.setSobrenome("Silva");
		e1.setCrea("s525222");
//		e1.seteMail("ana@gmail.com");
		System.out.println(e1.obterDados());



	}
}
