package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	String nome;
	Compra compra;
	List<Compra> compras = new ArrayList<>();
	
	Cliente(Compra compra) {
		this.compras.add(compra);
	}
	
	double obterValorTotal() {
		double total = 0;
		for(Compra compra : compras) {
			total += compra.obterValorCompra();
		}
		return total;
	}
}
