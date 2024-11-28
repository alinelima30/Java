package fundamentos3;//Faça um programa que receba de um usuário, um texto e exiba

import java.util.Scanner;
//esse texto em letras maiúsculas.
public class exercicio04 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite sua mensagem: ");
		String aba = entrada.nextLine();
		String resultado = aba.toUpperCase();
		System.out.printf("Frase em maiúsculo: "+resultado);
	}
}
