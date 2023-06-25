package classe;

import java.util.Scanner;

public class DataTeste {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Digite o dia, mes e ano");
		Data dataEscolhida = new Data(input.next(), input.next(), input.next());

		Data dataPadrao = new Data();

		if (dataEscolhida.dia.equals("0") || dataEscolhida.mes.equals("0") || dataEscolhida.ano.equals("0")) {
			System.out.println("Data invalida! Utilizando a padrao");
			System.out.println(dataPadrao.dataFormatada());
		} else {
			System.out.println(dataEscolhida.dataFormatada());
		}

		input.close();
	}
}
