package fundamentos;

import java.util.Scanner;

public class exemplo10 {

	public static void main(String[] args) { //Fazer um programa que leia três números, verifique 
		//(usando if e else) e mostre o maior.
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o primeiro valor: ");
		int n1 = entrada.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		int n2 = entrada.nextInt();
		
		System.out.println("Digite o terceiro valor: ");
		int n3 = entrada.nextInt();
		
		if(n1 > n2) {
			if (n1 > n3) {
				System.out.println("o numero maior é: " +n1);
			}else {
				System.out.println("o numero maior é: " +n3);
			}
		}else {
			if(n2 > n3) {
				System.out.println("o numero maior é: " +n2);
	
			}else {
				System.out.println("o numero maior é: " +n3);
			}
			entrada.close();
		}
	}
}
		

