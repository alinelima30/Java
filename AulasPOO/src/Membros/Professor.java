package Membros;
public class Professor extends Pessoa{
	public double salario;
public Professor(String nome, String cpf, String telefone, double salario) {
		super(nome, cpf, telefone);
		this.salario=salario;
	}
public void aplicarProva() {
	System.out.printf("O Professor %s, está se divertindo com o seu salário de %.2f." ,this.nome,this.salario);
}
}
