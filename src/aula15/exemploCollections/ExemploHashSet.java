package aula15.exemploCollections;

import java.util.HashSet;

public class ExemploHashSet {
	public static void main(String[] args) {
		HashSet<String> listaCompras = new HashSet<>();
		System.out.println(listaCompras.add("Chocolate"));
		System.out.println(listaCompras.add("Coca-cola"));
		System.out.println(listaCompras.add("Água"));
		System.out.println(listaCompras.add("Mentos"));
		System.out.println(listaCompras.add("Água"));
		System.out.println(listaCompras);
		listaCompras.remove("Água");
		System.out.println(listaCompras);
	}
}
