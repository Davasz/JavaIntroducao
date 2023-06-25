package fundamentos;

import java.util.Scanner;

public class DesafioConversão {
	public static void main(String[] args) {
		// inicia o scanner
		Scanner input = new Scanner(System.in);

		// Conversão primeiro salario
		System.out.println("Digite o seu primeiro salario");
		String S_sal1 = input.nextLine().replace(",", ".");
		double sal1 = Double.parseDouble(S_sal1);

		// Conversão segundo salario
		System.out.println("Digite o seu segundo salario");
		String S_sal2 = input.nextLine().replace(",", ".");;
		double sal2 = Double.parseDouble(S_sal2);

		// Conversão terceiro salario
		System.out.println("Digite o seu terceiro salario");
		String S_sal3 = input.nextLine().replace(",", ".");;
		double sal3 = Double.parseDouble(S_sal3);

		// Média 
		double media = (sal1 + sal2 + sal3) / 3;
		System.out.println("Sua media salarial e de: " + media);
		
		input.close();
	}
}
