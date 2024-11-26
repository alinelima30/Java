package fundamentos2; // Escrever um programa que pergunte ao usuário quantos alunos tem na sala
//dele. Em seguida, através de um laço while, pede ao usuário para que digite as notas de todos
//os alunos da sala, um por vez. Por fim, o programa mostra a média, aritmética, da turma.
import java.util.Scanner;
public class exemplo16 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int qtdAlunos,cont=0;
		double notas=0,media;
		System.out.println("Quantos Alunos tem na Sala: ");
		qtdAlunos = entrada.nextInt();
		
		while (cont < qtdAlunos) {
			System.out.println("Informe a nota do Aluno: ");
			notas = entrada.nextDouble();
			cont++;		
		}
		media=notas/qtdAlunos;
		System.out.println("A média da sala é: "+media);
		entrada.close();
	}
}
