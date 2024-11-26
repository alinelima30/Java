package fundamentos2; //Escreva um algorismo para imprimir os números
//de 1 até 10 em ordem inversa.

public class exemplo22 {

	public static void main(String[] args) {
		for (int i = 10; i > 0; i--) {
			if (i %2 != 0) {
				System.out.println(i+ " ");
			}
		}

	}

}
