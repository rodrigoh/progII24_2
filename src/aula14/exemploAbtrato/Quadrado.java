package aula14.exemploAbtrato;

public class Quadrado extends Figura{
	private double lado;

	public Quadrado(){
		setNomeFigura("Quadrado");
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public double calculaArea(){
		return lado*lado;
	}

	@Override
	public double calculaPerimetro(){
		return 4*lado;
	}
}
