package fundamentos3;

public class exercicio03 {

	public static void main(String[] args) {
		String texto01 = "Será que são iguais?";
		String texto02 = "Será que são iguais?";
		boolean b1 = texto01.equals("Será que são iguais?");
		boolean b2 = texto01.equals(texto02);
		boolean b3 = texto01.equalsIgnoreCase(texto02);
		boolean b4 = texto01.equalsIgnoreCase("Igual?");
		System.out.println("B1 é: "+b1);
		System.out.println("B2 é: "+b2);
		System.out.println("B3 é: "+b3);
		System.out.println("B4 é: "+b4);
	}
}
