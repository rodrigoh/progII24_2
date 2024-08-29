package aula04.exemploIf;

import java.util.Scanner;

public class Exemplo2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String usuarioValido = "admin";
		String senhaValida = "1234";
		System.out.print("Informe o usuário: ");
		String usuario = ler.next();
		System.out.print("informe a senha: ");
		String senha = ler.next();
		if(usuario.equals(usuarioValido) && senha.equals(senhaValida)){
			System.out.println("Bem-vindo, "+usuario);
		}
		else{
			System.out.println("Usuário ou senha inválido!");
		}
	}
}
