package fundamentos; //Fazer um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
//Telefonou para vítima?; Esteve no local do crime?; Mora perto da vítima?; Devia para a vítima?; Já trabalhou
//com a vítima?; obs.: O programa deve no final emitir uma classificação sobre a participação da pessoa no crime.
// Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como
//"Cúmplice" e 5 como "Assassino". Caso contrário, ele será classificado como "Inocente".

import java.util.Scanner;
public class exemplo14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int respostasPositivas = 0;

        System.out.println("Responda as seguintes perguntas com 'sim' ou 'não':");
        
        System.out.print("Telefonou para a vítima? ");
        String resposta1 = entrada.nextLine().toLowerCase();
        if (resposta1.equals("sim")) {
            respostasPositivas++;
        }

        System.out.print("Esteve no local do crime? ");
        String resposta2 = entrada.nextLine().toLowerCase(); //Ler a entrada do usuário (uma linha de texto completa).
//Converter essa entrada para minúsculas para facilitar a comparação (evitar problemas de capitalização).
//Armazenar a string resultante na variável resposta2.
        if (resposta2.equals("sim")) {
            respostasPositivas++; //equals("sim") compara o conteúdo da variável resposta1 com a string "sim".
//Se a resposta for "sim", o valor da variável respostasPositivas é incrementado.
//Isso ajuda a contar quantas respostas "sim" o usuário deu para as perguntas, o que será usado para determinar
//a classificação (Suspeito, Cúmplice, etc.) no final do programa.
        }

        System.out.print("Mora perto da vítima? ");
        String resposta3 = entrada.nextLine().toLowerCase();
        if (resposta3.equals("sim")) {
            respostasPositivas++;
        }

        System.out.print("Devia para a vítima? ");
        String resposta4 = entrada.nextLine().toLowerCase();
        if (resposta4.equals("sim")) {
            respostasPositivas++;
        }

        System.out.print("Já trabalhou com a vítima? ");
        String resposta5 = entrada.nextLine().toLowerCase();
        if (resposta5.equals("sim")) {
            respostasPositivas++;
        }

        String classificacao;
        if (respostasPositivas == 2) {
            classificacao = "Suspeita";
        } else if (respostasPositivas >= 3 && respostasPositivas <= 4) {
            classificacao = "Cúmplice";
        } else if (respostasPositivas == 5) {
            classificacao = "Assassino";
        } else {
            classificacao = "Inocente";
        }
        entrada.close();
        System.out.println("Classificação: " + classificacao);
    }
}
