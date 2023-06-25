package classe;

public class Jantar {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		
		Comida c1 = new Comida();
		Comida c2 = new Comida();
		
		p1.nome = "Joao";
		p1.peso = 60;
		p2.nome = "Cleitom";
		p2.peso = 70;
		
		c1.nome = "Arroz";
		c1.peso = 1.5;
		c2.nome = "Feijao";
		c2.peso = 2.5;
		
		double pesoAntesP1 = p1.peso;
		double pesoAntesP2 = p2.peso;
		
		p1.comeu(c1.peso);
		p2.comeu(c2.peso);
		
		System.out.printf("%s:\n Antes: %.2f \n Depois: %.2f", p1.nome, pesoAntesP1, p1.peso);
		System.out.printf("\n\n%s:\n Antes: %.2f \n Depois: %.2f", p2.nome, pesoAntesP2, p2.peso);
	}
	
}
