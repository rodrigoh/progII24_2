package aula04.exercicios;

import java.util.Scanner;

/**
 * Faça uma classe Java que leia a altura e o peso de uma pessoa e calcule seu IMC IMC = peso/altura²
 */
public class Exercicio5 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Entre com sua altura em metros: ");
		float altura = ler.nextFloat();
		System.out.print("Qual seu peso em kg: ");
		float peso = ler.nextFloat();
		float imc = peso/(altura*altura);
		System.out.println("Seu IMC é de "+String.format("%.3f",imc));
	}
}
