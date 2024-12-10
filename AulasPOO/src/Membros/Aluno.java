package Membros;
public class Aluno extends Pessoa {
	public double nota;
public Aluno(String nome, String cpf, String telefone, double nota) {
		super(nome, cpf, telefone);
		this.nota=nota;
	}
public void sofrer() {
	System.out.printf("O Aluno %s, está sofrendo com a nota %.2f que tirou.\n" ,this.nome,this.nota);
}
}
