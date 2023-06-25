package oo.composicao;

public class CarroTeste {
	public static void main(String[] args) {
		
		Carro c1 = new Carro();
		
		System.out.println(c1.estaLigado());
		
		c1.ligar();
		System.out.println(c1.estaLigado());
		
		System.out.println(c1.motor.giros() + "a");		
		
		c1.aceletar();
		c1.aceletar();
		c1.aceletar();
		c1.aceletar();
		
		System.out.println(c1.motor.giros());				
		
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		
//		Faltou encapsulamento
//		c1.motor.fatorInjecao = -30;
		
		System.out.println(c1.motor.giros());				
		c1.desligar();
		c1.aceletar();
		c1.aceletar();
		c1.aceletar();
		c1.aceletar();
		
		System.out.println(c1.motor.giros());
		
		c1.ligar();
		System.out.println(c1.motor.giros());
		
		c1.aceletar();
		c1.aceletar();
		c1.aceletar();
		System.out.println(c1.motor.giros());
		
		c1.fecharPortaDoCarro();
		c1.aceletar();
		c1.aceletar();
		c1.aceletar();
		c1.aceletar();
		System.out.println(c1.motor.giros());
	}
}
