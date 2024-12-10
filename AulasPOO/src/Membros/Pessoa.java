package Membros;

public abstract class Pessoa {
	public String nome;
	public String cpf;
	public String telefone;
	public Pessoa(String nome, String cpf, String telefone) {
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
}
public void acordar() {
	System.out.println("Acordar!");
}
public void dormir() {
	System.out.println("Dormir!");
}
public void trabalhar() {
	System.out.println("Trabalhar!");
}
}