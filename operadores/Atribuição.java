package operadores;

public class Atribuição {
	public static void main(String[] args) {
		
		int a = 3;
		int b = a;
		int c = b + a;
		
		c += a;
		c -= b;
		c *= a;
		c /= b;
		
		c++;
		c--;
		
		System.out.println(c);
		
		c %=2;
		System.out.println(c);

	}
}
