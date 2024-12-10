package Poli;
public class Cavalo extends Mamifero{
public Cavalo(String nome) {
	super(nome);	
	}
public void locomover() {
	System.out.println("Só no trotinho!");
}
public void comer(String comida) {
	System.out.printf("O cavalo %s, está comendo %s no pasto!\n",this.nome,comida);
}
}
