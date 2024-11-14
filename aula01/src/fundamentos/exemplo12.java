package fundamentos;

import java.util.Scanner;

public class exemplo12 {

	public static void main(String[] args) {
		// Fazer um programa que solicite 2 notas de um aluno e calcule a média dele e mostre na tela.
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a primeira nota: ");
		double nota1 = entrada.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		double nota2 = entrada.nextDouble();
		
		double soma = nota1 + nota2;
		double media = soma / 2;
		entrada.close();
		System.out.println(media);
	}

}
