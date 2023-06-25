package oo.composicao;

public class Carro {
	
	Motor motor = new Motor(this);
	Portas portas = new Portas();
//	Carro () {
//		this.motor = new Motor(this);
//	}
	
	void aceletar() {
		if(motor.ligado) {
			if(!portas.estaAberta) { 
				if (motor.fatorInjecao < 2.5) {
					motor.fatorInjecao += 0.4;			
				}			
			}			
		}
	}
	
	void frear() {
		if(motor.ligado) {
			if(!portas.estaAberta) {
				if(motor.fatorInjecao > 0.5) {
					motor.fatorInjecao -= 0.4;			
				}				
			}
		}
	}
	
	void ligar() {
		motor.ligado = true;
	}
	
	void desligar() {
		motor.ligado = false;
	}
	
	boolean estaLigado() {
		return motor.ligado;
	}
	
	 void fecharPortaDoCarro() {
	       	portas.fecharPorta();
	    }
}
