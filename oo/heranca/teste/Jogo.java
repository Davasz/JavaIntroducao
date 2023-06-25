package oo.heranca.teste;

import oo.heranca.Heroi;
import oo.heranca.Monstro;

public class Jogo {
	public static void main(String[] args) {
		Monstro monstro = new Monstro();
		monstro.x = 10;
		monstro.y = 10;
		
		Heroi heroi = new Heroi(10, 11);

		
		monstro.atacar(heroi);
		
		System.out.println("Heroi tem => " + heroi.vida);
		System.out.println("Monstro tem => " + monstro.vida);
		
		heroi.atacar(monstro);
		
		System.out.println("Heroi tem => " + heroi.vida);
		System.out.println("Monstro tem => " + monstro.vida);
		
		
//		j1.andar(Direcao.NORTE);
//		j1.andar(Direcao.LESTE);
//		j1.andar(Direcao.NORTE);
//		j1.andar(Direcao.LESTE);
//		
//		System.out.println(j1.x);
//		System.out.println(j1.y);
	}
}
