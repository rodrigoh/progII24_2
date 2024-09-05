package aula05.exemplosFor;

public class Exemplo3 {
	public static void main(String[] args) {
		System.out.println("For com passo 2");
		for(int i=0;i<20;i+=2)
			System.out.print(i+" ");
		//Usando o for sem inicialização
		int cont=5;
		System.out.println("\nFor sem inicialização");
		for(;cont<50;cont+=5)
			System.out.print(cont+" ");
		//Usando o for sem passo
		System.out.println("\nUsando o for sem declarar o passo");
		for(int i=0;i<20;) {
			if (i % 2 == 0)
				System.out.print(i + " ");
			i++;
		}
		//For sem inicialização e sem passo
		System.out.println("\nFor sem inicialização e sem passo");
		int t = 0;
		for(;t<10;)
			System.out.print(t++ +" ");
	}
}