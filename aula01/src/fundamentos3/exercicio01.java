package fundamentos3;//Faça um programa que a partir do texto abaixo,
//"texto para retirar espaços no início e fim", e imprimir o texto
//removendo os espaços no inicio e fim do texto.
public class exercicio01 {
	public static void main(String[] args) {
		String sos = " Alguém me ajude pelo amor de Deus! ";
		String resultado = sos.trim(); 
		System.out.println(resultado);
	}
}
