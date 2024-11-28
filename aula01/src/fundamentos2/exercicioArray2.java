package fundamentos2;// Escreva um código que receba uma nota de 5 alunos, guarde todas num array notas. Depois calcule a média da turma.

import java.util.Scanner;

public class exercicioArray2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double arrayNotas[] = new double[5], soma = 0, media = 0;
		
		for(int i = 0; i <arrayNotas.length; i++) {
			System.out.printf("Digite a %dº nota: ", i+1);
			arrayNotas[i] = entrada.nextDouble();
		}
		for(double x : arrayNotas) {
			soma+=x;
		}
		media = soma/arrayNotas.length;
		System.out.println(media);
		entrada.close();
	}
}
