package Metodos;

public class Honda extends Carro{
public String motor;
public Honda() { //construtor padrão.
	}
	public Honda(String motor, String modelo, double preco) { //com parâmetros.
	super(modelo, preco);
	this.motor = motor;
	}
}
