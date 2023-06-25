package classe;

public class PrimeiroTrauma {
	int a = 3; // não pode mexer aqui!
	static int b = 4;
	public static void main(String[] args) {
		PrimeiroTrauma puxarNumero = new PrimeiroTrauma();
		System.out.println(puxarNumero.a);
		System.out.println(b);
	}
}
