package aula14.exemploInterface;

/**
 * Classe que representa uma lista de Strings
 * @author Rodrigo Henrich
 * @version 1.0
 * @since beta 1
 */
public class Vetor implements Lista{
	private String[] elementos;
	private int tamanho;

	public Vetor(){
		elementos = new String[20];
		tamanho=0;
	}

	/**
	 * Método que adiciona um elemento na lista
	 * @param elemento objeto que será adicionado
	 * @since 1.0
	 */
	@Override
	public void adiciona(String elemento) {
		elementos[tamanho] = elemento;
		tamanho++;
	}

	/**
	 * Apaga um elemento da lista
	 * @return retorna o elemento removido da lista
	 */
	@Override
	public String remove() {
		String copia = elementos[tamanho-1];
		tamanho--;
		return copia;
	}

	/**
	 * Devolve o tamanho atual da lista
	 * @return inteiro com a quantidade de elementos
	 */
	@Override
	public int tamanho() {
		return tamanho;
	}
	//[A, B, D, J]
	public String obterLista(){
		String retorno = "[";
		if(tamanho>0){
			for(int i=0;i<tamanho-1;i++){
				retorno+=elementos[i]+", ";
			}
			retorno+=elementos[tamanho-1];
		}
		return retorno+"]";
	}


}
