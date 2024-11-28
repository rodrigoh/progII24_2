package aula15.classeLista;

/**
 * Classe para representar uma lista genérica
 */
public class Lista<T> {
	//Armazena os elementos da lista
	private T[] elementos;
	//Gerenciar a ocupação da lista
	private int tamanho;

	/**
	 * Instancia uma nova lista com 10 elementos
	 */
	public Lista(){
		elementos = (T[]) new Object[10];
		tamanho = 0;
	}

	/**
	 * Instancia uma lista com capacidade elementos
	 * @param capacidade capacidade inicial da lista
	 */
	public Lista(int capacidade){
		elementos = (T[]) new Object[capacidade];
		tamanho = 0;
	}

	/**
	 * Método que adiciona um elemento no final da lista
	 * @param elemento que será adicionado
	 */
	public void adiciona(T elemento){
		aumentaCapacidade();
		elementos[tamanho] = elemento;
		tamanho++;
	}

	/**
	 * Adiciona um elemento em qualquer posição da lista
	 * @param posicao onde o elemento será adicionado
	 * @param elemento que será adicionado
	 */
	public void adiciona(int posicao, T elemento){
		if(posicao<0 || posicao>=tamanho)
			throw new IllegalArgumentException(posicao+" não é válida");
		aumentaCapacidade();
		for(int i=tamanho-1;i>=posicao;i--){
			elementos[i+1] = elementos[i];
		}
		elementos[posicao] = elemento;
		tamanho++;
	}

	public boolean contem(T elemento){
		for(int i=0;i<tamanho;i++)
			if(elementos[i].equals(elemento))
				return true;
		return false;
	}

	/**
	 * Retorna a posição de determinado elemento na lista
	 * @param elemento pesquisado
	 * @return posição de elemento ou -1 se ele existir
	 */
	public int posicaoDe(T elemento){
		for(int i=0;i<tamanho;i++){
			if(elementos[i].equals(elemento))
				return i;
		}
		return -1;
	}

	/**
	 * Retorna a última ocorrência de elemento na lista
	 * @param elemento
	 * @return
	 */
	public int ultimaPosicaoDe(T elemento){
		int posicao = -1;
		for(int i=0;i<tamanho;i++)
			if(elementos[i].equals(elemento))
				posicao = i;
		return posicao;
	}

	/**
	 * Método que apaga todos os elementos da lista
	 */
	public void limpar(){
		tamanho = 0;
	}

	public int tamanho(){
		return tamanho;
	}

	public boolean estaVazia(){
		return tamanho==0;
	}

	public T remove(int posicao){
		if(posicao<0 || posicao>=tamanho)
			throw new IllegalArgumentException(posicao+" não é válida");
		T copia = elementos[posicao];
		for(int i=posicao;i<tamanho-1;i++)
			elementos[i] = elementos[i+1];
		tamanho--;
		return copia;
	}

	public boolean remove(T elemento){
		int posicao = posicaoDe(elemento);
		if(posicao>=0){
			remove(posicao);
			return true;
		}
		return false;
	}

	private void aumentaCapacidade(){
		if(tamanho==elementos.length){
			T[] aux = (T[]) new Object[tamanho*2];
			//System.arraycopy(elementos,0,aux,0,tamanho);
			for(int i=0;i<elementos.length;i++){
				aux[i] = elementos[i];
			}
			elementos = aux;
		}
	}

	public T obterElemento(int posicao){
		if(posicao<0 || posicao>=tamanho)
			throw new IllegalArgumentException(posicao+" não é válida");
		return elementos[posicao];
	}

	@Override
	public String toString(){
		String resultado = "[";
		if(tamanho>0){
			for(int i=0;i<tamanho-1;i++){
				resultado+=elementos[i]+", ";
			}
			resultado+=elementos[tamanho-1];
		}
		return resultado+"]";
	}


}
