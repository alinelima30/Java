package fundamentos3;//Dado o Array a seguir, {"a", "vida", "é", "bela"}
//faça um programa que crie um string com o texto retirado do Array e imprima.
//no seguinte formato: A VIDA É BELA.

public class exercicio05 {
	public static void main(String[] args) {
		String texto[] = {"a", "vida", "é", "bela!"};
		for(int i=0; i<texto.length; i++) {
			System.out.print(texto[i].toUpperCase()+ " ");
		}
	}
}
