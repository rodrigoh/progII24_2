package aula15.exemploCollections;

import java.util.LinkedList;
import java.util.Queue;

public class ExemploQueue {
	public static void main(String[] args) {
		Queue<Pessoa> fila = new LinkedList<>();
		fila.add(new Pessoa("Jonas","Silva",175));
		fila.add(new Pessoa("Ana","Souza",180));
		fila.add(new Pessoa("Vera","Fischer",170));
		fila.add(new Pessoa("Joaquim","Pereira",200));
		System.out.println("Quem é o próximo: "+fila.peek());
		System.out.println("Atendendo a pessoa "+fila.remove());
		System.out.println(fila);
	}
}
