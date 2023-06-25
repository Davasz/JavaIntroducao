package classe;

import java.util.Scanner;

public class ProdutoTeste {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Digite o nome do produto");
		Produto p1 = new Produto(input.nextLine());

		System.out.println("Digite o preco do produto");
		p1.preco = input.nextDouble();
		input.nextLine(); // consumir o caractere de quebra de linha
		
		
		System.out.println("Estamos em epoca especial (s, n)");
		String descontoEspecial = input.nextLine();
		
		if("s".equalsIgnoreCase(descontoEspecial)) {
			System.out.println("Digite o novo desconto");
			Produto.desconto = input.nextDouble();
			input.nextLine();
		}
		
		System.out.println("Produto cadastrado com sucesso!");

		double resultado = p1.produtoDesconto();

		System.out.println("Deseja visualizar o produto? (s ou n)");
		String resposta = input.nextLine();

		if ("s".equalsIgnoreCase(resposta)) {
			System.out.printf("\n\nProduto %s criado!\nValor inicial: %.2f\n" + "Desconto: %.2f\nValor final: %.2f",
					p1.nome, p1.preco, Produto.desconto, resultado);
		} else {
			System.out.println("Programa finalizado!");
		}

		input.close();

	}
}
