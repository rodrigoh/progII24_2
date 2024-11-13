package aula14.exemploAbtrato;

public abstract class Figura {
	private String nomeFigura;

	public String getNomeFigura() {
		return nomeFigura;
	}

	public void setNomeFigura(String nomeFigura) {
		this.nomeFigura = nomeFigura;
	}

	public abstract double calculaArea();

	public abstract double calculaPerimetro();

	public String obterDados(){
		return "Nome: "+nomeFigura+" área = "+calculaArea()+
						" perímetro = "+calculaPerimetro();
	}

}
