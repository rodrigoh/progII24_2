package aula05.exercicios;

import java.util.Scanner;

public class Exercicio14 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Selecione uma opção");
		System.out.println("1 para ordem crescente");
		System.out.println("2 para ordem decrescente");
		System.out.print("3 para saber o dobro dos números: ");
		int i = ler.nextInt();
		System.out.print("a = ");
		int a = ler.nextInt();
		System.out.print("b = ");
		int b = ler.nextInt();
		System.out.print("c = ");
		int c = ler.nextInt();
		switch (i){
			case 1->{
				//Ordem crescente
				//a b c
				//a c b
				//b a c
				//b c a
				//c a b
				//c b a
				if(a<b && b<c)
					System.out.printf("%d, %d, %d\n",a,b,c);
				else if(a<c && c<b)
					System.out.printf("%d, %d, %d\n",a,c,b);
				else if(b<a && a<c)
					System.out.printf("%d, %d, %d\n",b,a,c);
				else if(b<c && c<a)
					System.out.printf("%d, %d, %d\n",b,c,a);
				else if(c<a && a<b)
					System.out.printf("%d, %d, %d\n",c,a,b);
				else if(c<b && b<a)
					System.out.printf("%d, %d, %d\n",c,b,a);
				else
					System.out.println("Tem números iguais, não sei ordenar");
			}
			case 2->{
				//Ordem decrescente
				if(a>b && b>c)
					System.out.printf("%d, %d, %d\n",a,b,c);
				else if(a>c && c>b)
					System.out.printf("%d, %d, %d\n",a,c,b);
				else if(b>a && a>c)
					System.out.printf("%d, %d, %d\n",b,a,c);
				else if(b>c && c>a)
					System.out.printf("%d, %d, %d\n",b,c,a);
				else if(c>a && a>b)
					System.out.printf("%d, %d, %d\n",c,a,b);
				else if(c>b && b>a)
					System.out.printf("%d, %d, %d\n",c,b,a);
				else
					System.out.println("Tem números iguais, não sei ordenar");
			}
			case 3->{
				//dobro
				System.out.println(a+" * 2 = "+a*2);
				System.out.println(b+" * 2 = "+b*2);
				System.out.println(c+" * 2 = "+c*2);
			}
		}
	}
}
