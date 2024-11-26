package fundamentos2; //Escrever um aplicativo em Java que mostre todos os números ímpares de
//1 até x, usando a definição de números impares.
import java.util.Scanner;
public class exemplo17 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int i=1,valor=0;
		System.out.println("Digite um Valor: ");
		valor = entrada.nextInt();
		while(i<=valor) {
			if (i%2!=0) {
			System.out.println(i);
			
			}
			i++;
			entrada.close();
		}
			
	}

}
