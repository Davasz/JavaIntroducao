package oo.polimorfismo;

public class Pessoa {
	
	private double peso;
	
	Pessoa(double peso) {
		this.peso = peso;
	}
	
	void comer(Comida comida) {
		this.peso += comida.getPeso();
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
}
