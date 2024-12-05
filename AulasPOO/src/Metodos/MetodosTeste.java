package Metodos;

public class MetodosTeste {

	public static void main(String[] args) {
		JavaMetodos j1 = new JavaMetodos();
		int anos = j1.idade();
		double nota = j1.peso();
		String cliente = j1.nome();
		boolean situacao = j1.estado();
		System.out.printf("O cliente %s, tem %d anos e seu peso é "+j1.peso(), j1.nome(), j1.idade(), j1.estado());

	}

}
