package Metodos;

public class Carro {
public String cor;
public String modelo;
public double preco;
public Carro() {
}
public Carro(String modelo, double preco) {
this.cor = "PRETA";
this.modelo = "modelo";
this.preco = preco;
}
public Carro(String cor, String modelo, double preco) {
this.cor = cor;
this.modelo = modelo;
this.preco = preco;
}
public void ligarCarro() {
	System.out.println("Carro ligado!");
}
public void desligarCarro() {
	System.out.println("Carro desligado!");
}
}
