package Metodos;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite um valor para A: ");
		int A = sc.nextInt();
		System.out.println("Digite um valor para B: ");
		int B = sc.nextInt();
		System.out.println("Digite um valor para C: ");
		int C = sc.nextInt();
		Calcularmetodos c1 = new Calcularmetodos();
		int soma = c1.somar(A, B);
		System.out.printf("A soma de A + B = " +soma);
		System.out.println();
		
		int soma2 = c1.somar(A, B, C);
		System.out.printf("A soma entre A + B + C = " +soma2);
		System.out.println();
		
		int multiplicar = c1.multiplicar(A, B);
		System.out.printf("A Multiplicação de A * B = " +multiplicar);
		System.out.println();
		
		int multiplicar2 = c1.multiplicar(A, B, C);
		System.out.printf("A Multiplicação entre A * B * C = " +multiplicar2);
		System.out.println();
		
		int subtrair = c1.subtrair(A, B);
		System.out.printf("A subtração de A - B = " +subtrair);
		System.out.println();
		
		int subtrair2 = c1.subtrair(A, B, C);
		System.out.printf("A Subtração entre A - B - C = " +subtrair2);
		System.out.println();
		
		int dividir = c1.dividir(A, B);
		System.out.printf("A Divisão de A / B = " +dividir);
		System.out.println();
		
		int dividir2 = c1.dividir(A, B, C);
		System.out.printf("A Divisão entre A / B / C = " +dividir2);
	}
}

