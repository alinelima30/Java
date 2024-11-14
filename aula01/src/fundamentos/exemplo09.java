package fundamentos;

import java.util.Scanner;

public class exemplo09 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int num = entrada.nextInt();//Fazer um programa que peça um valor e mostre 
		//na tela se o valor é positivo ou negativo.
		if(num > 0)
			System.out.println("Positivo!");
		if(num < 0)
			System.out.println("Negativo!");
		if(num == 0)
			System.out.println("Nulo");
		entrada.close();
	}

}
