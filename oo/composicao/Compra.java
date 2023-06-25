package oo.composicao;

import java.util.ArrayList;

public class Compra {
	String cliente;
	ArrayList<Item> itens = new ArrayList<>(); 
	
	void addItem(String nome, int quantidade, double preco) {
		addItem(new Item(nome, quantidade, preco));
	}
	
	void addItem(Item item) {
		itens.add(item);
		item.compra = this;
	}
	
	double getPrecoTotal() {
		double total = 0;
		for (Item item: itens) {
			total += item.quantidade * item.preco;
		}
		return total;
	}
}
