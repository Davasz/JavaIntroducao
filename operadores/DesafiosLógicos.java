package operadores;

public class DesafiosLógicos {
	public static void main(String[] args) {
		// Trabalho na terça (V ou F)
		// Trabalho na quinta (V ou F)
		
		boolean trabalhoT = false;
		boolean trabalhoQ = false;
		
		boolean tv50 = trabalhoT && trabalhoQ;
		boolean tv32 = trabalhoT ^ trabalhoQ;
		
		boolean sorvete = trabalhoQ || trabalhoT;
		
		System.out.println("Comprou TV 50? " + tv50);
		System.out.println("Comprou TV 32? " + tv32);
		System.out.println("Comprou sorvete? " + sorvete);
		System.out.println("Mais saudável? " + !sorvete);
		
	}
}
