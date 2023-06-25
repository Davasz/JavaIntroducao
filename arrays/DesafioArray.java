package arrays;

import java.util.Scanner;

public class DesafioArray {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Digite a quantidade de notas do aluno");
		int quantidadeNotas = input.nextInt();
		
		double[] notas = new double[quantidadeNotas];
		
		for(int i = 0; i < quantidadeNotas; i++) {
			System.out.println("Digite a nota");
			notas[i] = input.nextDouble();
			System.out.printf("Nota %.1f cadastrada! \n", notas[i]);
		}
		
		System.out.println("----------Calculando Media-----------");
		
		double media = 0;
		for(double nota: notas) {
			media += nota;
		}
		
		System.out.println("\n\n A média do aluno e: " + media / notas.length);
		
		input.close();
	}
}
