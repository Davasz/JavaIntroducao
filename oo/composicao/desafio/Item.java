package oo.composicao.desafio;

public class Item {
	
	int quantidade;
	Produto produto;
	
	Item(Produto produto, int quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;
	}
}
