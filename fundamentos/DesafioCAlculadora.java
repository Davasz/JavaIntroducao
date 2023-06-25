package fundamentos;

import java.util.Scanner;

public class DesafioCAlculadora {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero");
		int num1 = entrada.nextInt();
		
		System.out.println("Digite o segundo numero");
		int num2 = entrada.nextInt();
		
		System.out.println("Digite a operacao");
		String operacao = entrada.next();
		
		int resul = operacao.equals("+") ? num1 + num2 : 0;
		resul = operacao.equals("-") ? num1 - num2 : resul;
		resul = operacao.equals("/") ? num1 / num2 : resul;
		resul = operacao.equals("*") ? num1 * num2 : resul;
		System.out.println(resul);
		entrada.close();
	}
}
