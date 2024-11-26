package fundamentos2; //Escreva um programa que solicite a quantidade
//de alunos de uma sala e depois solicite uma nota para cada aluno, imprimindo
//no final a média da sala.

import java.util.Scanner;
public class exemplo24 {
public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			
	        // Solicita a quantidade de alunos
	        System.out.print("Digite a quantidade de alunos na sala: ");
	        int quantidadeAlunos = entrada.nextInt();

	        // Inicializa uma variável para somar as notas
	        double somaNotas = 0;

	        // Loop para solicitar a nota de cada aluno
	        for (int i = 1; i <= quantidadeAlunos; i++) {
	            System.out.print("Digite a nota do aluno " + i + ": ");
	            double nota = entrada.nextDouble();
	            somaNotas += nota;
	        }

	        // Calcula a média
	        double media = somaNotas / quantidadeAlunos;

	        // Imprime a média da sala
	        System.out.printf("A média da sala é: %.2f\n", media);

	        // Fecha o scanner
	        entrada.close();
	}
}
