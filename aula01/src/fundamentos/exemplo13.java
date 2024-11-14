package fundamentos;

import java.util.Scanner;

public class exemplo13 {

	public static void main(String[] args) {
		// Fazer um programa que verifique (usando if e else) 
		//se uma letra digitada é "F" ou "M". Conforme a letra escrever: F-Feminino, M-Masculino.
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite uma palavra: ");
		char genero = entrada.next().charAt(0);
		if (genero == 'f') {
			System.out.println("Feminino!");
		}else {
			System.out.println("Masculino!");
		}
		entrada.close();
	}

}
