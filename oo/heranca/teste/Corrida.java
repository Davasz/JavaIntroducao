package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class Corrida {
	public static void main(String[] args) {
		Carro civic = new Civic();
		Carro ferrari = new Ferrari();
		
		System.out.println("Civic => " + civic.velocidadeAtual);
		civic.frear();
		civic.frear();
		civic.frear();
		System.out.println("Civic => " + civic.velocidadeAtual);
		
		civic.aceletar();
		civic.aceletar();
		civic.aceletar();
		System.out.println("Civic => " + civic.velocidadeAtual);
		civic.frear();
		System.out.println("Civic => " + civic.velocidadeAtual);

		System.out.println("Ferrari =>" + ferrari.velocidadeAtual);
		ferrari.frear();
		ferrari.frear();
		ferrari.frear();
		System.out.println("Ferrari =>" + ferrari.velocidadeAtual);
		
		ferrari.aceletar();
		ferrari.aceletar();
		ferrari.aceletar();
		System.out.println("Ferrari =>" + ferrari.velocidadeAtual);
		ferrari.frear();
		System.out.println("Ferrari =>" + ferrari.velocidadeAtual);
	}
}
