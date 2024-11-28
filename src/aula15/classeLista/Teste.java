package aula15.classeLista;

import aula15.exemploCollections.Pessoa;

public class Teste {
	public static void main(String[] args) {
		Lista<String> l1 = new Lista<>(4);

		System.out.println(l1);
		l1.adiciona("Ana");
		l1.adiciona("Pedro");
		l1.adiciona("Jonas");
		l1.adiciona("Joaquim");
		l1.adiciona("Betina");
		l1.adiciona("Ricardo");
		System.out.println(l1);
		System.out.println("Qual elemento está na posição "+l1.obterElemento(2));
		l1.adiciona(2,"Rodrigo");
		System.out.println(l1);
		System.out.println("A lista contém um 'Jonas'? "+(l1.contem("Jonas")?"Sim":"Não"));
		//Nossa lista pode ser de qualquer tipo
		Lista<Pessoa> listaPessoa = new Lista<>();
		listaPessoa.adiciona(new Pessoa("Jonas","Silva",170));
		Lista<Integer> numeros = new Lista<>();

	}
}
