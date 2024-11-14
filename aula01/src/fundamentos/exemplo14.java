package fundamentos; //Fazer um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
//Telefonou para vítima?; Esteve no local do crime?; Mora perto da vítima?; Devia para a vítima?; Já trabalhou
//com a vítima?; obs.: O programa deve no final emitir uma classificação sobre a participação da pessoa no crime.
// Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como
//"Cúmplice" e 5 como "Assassino". Caso contrário, ele será classificado como "Inocente".

import java.util.Scanner;

public class exemplo14 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("1-Telefonou para vítima?\n 2-Esteve no local do crime?\n "
				+ "3-Mora perto da vítima?\n 4-Devia para vítima?\n 5-Já trabalhou com a vítima?");
		int pergunta = entrada.nextIn();

	}

}
