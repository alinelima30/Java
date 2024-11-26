package fundamentos2; //Escreva um aplicativo em java que mostra os números pares e ímpares
//(separados por linha), de 1 até 100.
public class exemplo18 {
	public static void main(String[] args) {
		int i=1;
		while(i<=100) {
			if(i%2 == 0) {
		System.out.print(i+ " ");
		}
		i++;
		}
		System.out.println();
		i=1;
		while(i<=100) {
			if(i%2 != 0) {
		System.out.print(i+ " ");
		}
		i++;
		}
	}

}
