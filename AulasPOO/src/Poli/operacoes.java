package Poli;
public class operacoes {
public int soma(int n1, int n2) {
		return n1 + n2;
	}
	public double soma(double n1, int n2) {
		return n1 + n2;
	}
	public void soma(double n1, double n2, double n3) {
		double soma = n1 + n2 + n3;
		System.out.printf("O resultado de n1+n2+n3 = " +soma + "(double)");
	}	
}
