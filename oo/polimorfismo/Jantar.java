package oo.polimorfismo;

public class Jantar {
	public static void main(String[] args) {
		Pessoa convidado = new Pessoa(90);
		Comida arroz = new Arroz(0.3);
		Comida feijao = new Feijao(0.2);
		Comida sorvete = new Sorvete(1);
		
		System.out.println(convidado.getPeso());
		
		convidado.comer(arroz);
		convidado.comer(feijao);
		convidado.comer(sorvete);
		
		System.out.println(convidado.getPeso());
	}
}
