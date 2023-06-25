package oo.heranca.desafio;

public class Carro {
	
	public final int VELOCIDADE_MAXIMA;
	public int velocidadeAtual = 0;
	protected int delta = 5;
	
	public Carro(int velocidadeMaxima) {
		this.VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	public void aceletar() {
		if(velocidadeAtual + delta > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		} else {
			velocidadeAtual += delta;
		}
	}
	
	public void frear() {
		if(velocidadeAtual >= 5) {
			velocidadeAtual -= 5;
		} else {
			velocidadeAtual = 0;
		}
	}
}
