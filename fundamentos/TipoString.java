package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Ola pessoas".charAt(2));
		
		String s = "boa tarde";
		System.out.println(s.concat("!!!"));
		
		String nome = "Pedro";
		String sobrenome = "Santos";
		int idade = 38;
		double salario = 12345.678;
		
		System.out.printf("O senhor %s %s tem %d e"
				+ "recebe R$ %.3f", nome, sobrenome, idade, salario);
	

	}
}
