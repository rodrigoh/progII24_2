package aula04.exercicios;

import java.util.Scanner;

/**
 * Um motorista de táxi deseja calcular o rendimento de seu carro na praça.
 * Sabendo-se que o preço do combustível é de R$ 6,15, escreva um programa para
 * ler: a marcação do odômetro (Km) no início do dia, a marcação (Km) no final
 * do dia, o número de litros de combustível gasto e o valor total (R$) recebido
 * dos passageiros. Calcular e escrever: a média do consumo em Km/L e o lucro
 * (líquido) do dia.
 */
public class Exercicio11 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe:");
		System.out.print("km inicial: ");
		int kmInicial = ler.nextInt();
		System.out.print("km final: ");
		int kmFinal = ler.nextInt();
		System.out.print("Litros de combustível usados: ");
		float nLitros = ler.nextFloat();
		System.out.print("Valor recebido R$");
		float valorRecebido = ler.nextFloat();
		float distancia = kmFinal-kmInicial;
		float autonomia = distancia/nLitros;
		float lucro = valorRecebido-nLitros*(float)6.15;
		System.out.printf("Seu lucro é de R$%.2f\n",lucro);
		System.out.printf("A autonomia do carro é de %.3f\n",autonomia);
	}
}
