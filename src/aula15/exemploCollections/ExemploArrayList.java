package aula15.exemploCollections;

import java.util.ArrayList;

public class ExemploArrayList {
	public static void main(String[] args) {
		//String, Float, Double, Integer, Algum objeto que eu tenha definido
		ArrayList<String> lista = new ArrayList<>();
		//Adicionar elemento na lista
		lista.add("A");
		lista.add("B");
		lista.add("D");
		lista.add("E");
		lista.add("F");
		lista.add("G");
		lista.add("H");
		lista.add("I");
		lista.add("J");
		//Adiciona um elemento em qualquer posição da lista
		lista.add(2,"C");
		System.out.println(lista);
		//Pegando um elemento da lista
		System.out.println("Pegando o elemento da posição 3 "+lista.get(3));
		//Verificando se um elemento existe na lista
		System.out.println("A lista contém o elemento 'D' "+lista.contains("D"));
		System.out.println("A lista contém o elemento 'T' "+lista.contains("T"));
		//Pesquisando a posição de um elemento na lista
		System.out.println("A posição do elemento 'E' na lista é "+lista.indexOf("E"));
		System.out.println("A posição do elemento 'T' na lista é "+lista.indexOf("T"));
		lista.add("E");
		System.out.println("A última posição do elemento 'E' na lista é "+lista.lastIndexOf("E"));
		//Removendo um elemento da lista pelo elemento
		System.out.println("Apagando o elemento 'C': "+lista.remove("C"));
		//Removendo um elemento pela posição
		System.out.println("Apagando o elemento da posição 2 "+lista.remove(2));
		System.out.println("A lista está vazia? "+lista.isEmpty());
		System.out.println("O tamanho da lista é "+lista.size());
		lista.clear();
		System.out.println(lista);
	}
}
