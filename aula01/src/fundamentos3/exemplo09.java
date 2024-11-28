package fundamentos3;

public class exemplo09 {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "HELLO";
		boolean b1 = s1.equals("Hello");
		boolean b2 = s1.equals(s2);
		boolean b3 = s1.equalsIgnoreCase(s2);
		boolean b4 = s1.equalsIgnoreCase("Azul");
		System.out.println("B1 é: "+b1);
		System.out.println("B2 é: "+b2);
		System.out.println("B3 é: "+b3);
		System.out.println("B4 é: "+b4);
	}
}
