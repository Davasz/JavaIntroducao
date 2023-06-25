package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	
	List<Item> itens = new ArrayList<>();
	
	double obterValorCompra() {
		double total = 0;
		for(Item item: itens) {
			total += item.quantidade * item.produto.valor;
		}
		return total;
	}
	
	Compra(Item item) {
		this.itens.add(item);
	}
}
