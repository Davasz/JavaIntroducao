package oo.composicao;

public class CompraTeste {
	public static void main(String[] args) {
		
		Compra c1 = new Compra();
		
		c1.cliente = "João Pedro";
		c1.addItem("Caneta", 20, 7.75);
		c1.addItem("Borracha", 12, 3.89);
		c1.addItem("Caderno", 3, 18.79);
		
		System.out.println(c1.itens.size());
		System.out.println(c1.getPrecoTotal());
	}
}
