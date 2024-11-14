package aula14.exemploInterface;

public class Teste {
	public static void main(String[] args) {
		Vetor v1 = new Vetor();
		v1.adiciona("A");
		v1.adiciona("B");
		v1.adiciona("C");
		v1.adiciona("D");
		v1.adiciona("E");
		v1.adiciona("F");
		System.out.println("Qual o tamanho da lista "+v1.tamanho());
		System.out.println(v1.obterLista());
		System.out.println("Removendo o "+v1.remove()+" da lista");
		System.out.println(v1.obterLista());
		//Criando uma instância de interface
		//em l1 estão disponíveis apenas os comportamentos
		//comuns aos dois objetos
		Lista l1 = new Vetor();
	}
}
