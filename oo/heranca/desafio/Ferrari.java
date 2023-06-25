package oo.heranca.desafio;

public class Ferrari extends Carro {
	
	public Ferrari() {
		this(423);
	}
	
	Ferrari(int velocidadeMaxima) {
		super(velocidadeMaxima);
		delta = 15;
	}
	
//	void aceletar() {
//		super.aceletar();
//		super.aceletar();
//		super.aceletar();
//	}
	
}
