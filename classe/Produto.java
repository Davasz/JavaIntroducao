package classe;

public class Produto {
	
	String nome;
	double preco;
	static double desconto = 25;
	
	Produto(String nomeDoProduto) {
		nome = nomeDoProduto;
	}
	
	double produtoDesconto() {
		double porcentagem = preco * (desconto / 100);
		return preco - porcentagem; 
	}
}
