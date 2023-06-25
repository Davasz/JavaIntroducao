package oo.polimorfismo;

public abstract class Comida {
	private double peso;

	Comida(double peso) {
		this.peso = peso;
	}
	
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
}
