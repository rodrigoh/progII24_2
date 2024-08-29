package aula01;

public class Exemplo2 {
	public static void main(String[] args) {
		int n = 10;
		//Neste caso ele imprime o valor de n e depois increment1
		//System.out.printf("O valor de n é %d\n",n++);
		//Neste caso ele incrementa o valor de n e depois imprime
		System.out.printf("O valor de n é %d\n",++n);
		System.out.printf("O novo valor de n é %d\n",n);
	}
}
