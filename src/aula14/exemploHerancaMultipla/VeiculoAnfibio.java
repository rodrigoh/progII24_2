package aula14.exemploHerancaMultipla;

public class VeiculoAnfibio implements VeiculoAquatico, VeiculoTerrestre{
	@Override
	public void navegar() {

	}

	@Override
	public void andar() {

	}

	@Override
	public void embarcar() {

	}

	@Override
	public void desembarcar() {

	}

	@Override
	public boolean ligar() {
		return false;
	}

	@Override
	public int obterVelocidade() {
		return 0;
	}
}
