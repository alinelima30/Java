package fundamentos3;//Refaça o exercicio anterior, usando a maneira como 
//o mestre yoda falaria... (BELA É VIDA A)

public class exercicio06 {

	public static void main(String[] args) {
		String texto[] = {"a", "vida", "é", "bela!"};
		for(int i=texto.length-1; i>=0; i--) {
			System.out.print(texto[i].toUpperCase()+ " ");
		}
	}

}
