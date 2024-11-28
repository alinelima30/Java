package fundamentos2;// Para cada conjunto de valores abaixo, escreva o código Java, usando laço(s), que preencha um array com os valores:
//a)10,9,8,7,6,5,4,3,2,1; b)1,4,9,16,25,36,49,64,81,100; c)1,2,3,4,5,10,20,30,40,50; d)3,4,7,12,19,28,39,52,67,84.
import java.util.Scanner;
public class exercicioArray {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); 
		int arrayA[] = new int[4];
		int arrayB[] = new int[4];
		int arrayC[] = new int[4];
		int arrayD[] = new int[4];
		
		for(int i = 0; i < arrayA.length; i++) {
			System.out.printf("Digite o %dº número para arrayA: ", i+1);//Nesta linha e a de baixo, podem ser duplicadas detro do mesmo FOR,
			//ao invés de 4 FOR.
			arrayA[i] = entrada.nextInt();
		}
		for(int i=0; i < arrayA.length; i++) {
			System.out.printf("Digite o %dº número para arrayB: ", i+1);
			arrayB[i] = entrada.nextInt();
		}
		for(int i=0; i < arrayB.length; i++) {
			System.out.printf("Digite o %dº número para arrayC: ", i+1);
			arrayC[i] = entrada.nextInt();
		}	
		for(int i=0; i < arrayC.length; i++) {
		System.out.printf("Digite o %dº número para arrayD: ", i+1);
		arrayD[i] = entrada.nextInt();
		}
		for(int i : arrayA) {
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i : arrayB) {
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i : arrayC) {
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i : arrayD) {
			System.out.print(i+" ");
			entrada.close();
		}
	}
}