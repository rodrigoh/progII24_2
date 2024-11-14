package aula14.exemploAbtrato;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Triangulo extends Figura{
	private double base;
	private double altura;

	public Triangulo(){
		setNomeFigura("Triângulo");
	}

	@Override
	public double calculaArea() {
		return (base*altura)/2;
	}

	@Override
	public double calculaPerimetro() {
		//a² = b²+c²
		double a = Math.sqrt(base*base+altura*altura);
		return a+base+altura;
	}
}
