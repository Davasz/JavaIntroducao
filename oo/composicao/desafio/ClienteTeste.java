package oo.composicao.desafio;

public class ClienteTeste {
	public static void main(String[] args) {
		Cliente c1 = new Cliente(new Compra(new Item
				(new Produto("Note", 1000), 2)));
	
		System.out.println(c1.obterValorTotal());
		
	}
}
