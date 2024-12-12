package Poli;
public class somar {
	public static void main(String[] args) {
		operacoes op = new operacoes();
		op.soma(10, 7);
		System.out.printf("O resultado de n1 + n2 = " + op.soma(10, 7));
		System.out.println();
		op.soma(5.7, 8);
		System.out.printf("O resultado de double n1 + int n2 = " + op.soma(5.7, 8));
		System.out.println();
		op.soma(4.5, 8.6, 9.4);
		
	}
}
