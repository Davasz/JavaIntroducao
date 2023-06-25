package operadores;

public class Ternario {
	public static void main(String[] args) {
		double media = 5.6;
		
		String resultadoRepuracao = media >= 5.0 ? "recuperacao" 
			: "reprovado";
		String resultado = media >= 7.0 ? "aprovado" : resultadoRepuracao;
		
		System.out.println(resultado);
	}
}
