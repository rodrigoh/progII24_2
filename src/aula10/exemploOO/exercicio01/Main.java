package aula10.exemploOO.exercicio01;

public class Main {
	public static void main(String[] args) {
		Lampada l1 = new Lampada("Philips", "led");
//		l1.marca = "Philips";
//		l1.modelo = "led";
		l1.cor = "branca";
		System.out.println(l1.obterInformacoes());
		l1.ligar();
		System.out.println(l1.obterInformacoes());
		Lampada lampadaQuarto = new Lampada("Taschibra", "halógena");
//		lampadaQuarto.marca = "Taschibra";
//		lampadaQuarto.modelo = "halógena";
		lampadaQuarto.cor = "amarelo";
		System.out.println(lampadaQuarto.obterInformacoes());

		Lampada l2 = new Lampada();
		Lampada l3 = new Lampada("Marca", "modelo");
		l3.marca = "teste";
		Lampada l4 = new Lampada("Marca", "modelo","cor",true);

	}
}
