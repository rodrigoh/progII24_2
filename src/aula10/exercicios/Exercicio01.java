package aula10.exercicios;

import java.util.Scanner;

public class Exercicio01 {

	public static double calculaDelta(double a, double b, double c){
		return b*b-4*a*c;
	}

	public static double calculaX(double a, double b, double d, char opc){
		if(opc=='+'){
			double x = (-b+Math.sqrt(d))/(2*a);
			return x;
		}
		else{
			double x = (-b-Math.sqrt(d))/(2*a);
			return x;
		}

	}
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Dada a equação ax² + bx + c = 0, informe: ");
		System.out.print("a = ");
		double a = ler.nextDouble();
		System.out.print("b = ");
		double b = ler.nextDouble();
		System.out.print("c = ");
		double c = ler.nextDouble();
		double delta = calculaDelta(a,b,c);
		if(delta>=0){
			double x1 = calculaX(a,b,delta,'+');
			double x2 = calculaX(a,b,delta,'-');
			System.out.println("A equação possui raízes");
			System.out.println("x' = "+String.format("%.3f",x1));
			System.out.println("x'' = "+String.format("%.3f",x2));
		}
		else{
			System.out.println("A equação não possui raízes no conjunto dos reais");
		}

	}
}
