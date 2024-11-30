package Metodos;

public class LojaCarro {

	public static void main(String[] args) {
		Carro c1 = new Carro();
		Carro c2 = new Carro("PRETA", 189.00);
		Carro c3 = new Carro("Azul", "BYD", 200.00);
		String c = c3.cor;
		String m = c3.modelo;
		double p = c2.preco;
		System.out.printf("O carro %s custa %f ",c3.modelo,c3.preco);
	}
	
	
}






