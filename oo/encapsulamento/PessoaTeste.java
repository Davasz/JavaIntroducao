package oo.encapsulamento;

public class PessoaTeste {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa(23);
		p1.setIdade(33);
		System.out.println(p1.getIdade());
	}
}
