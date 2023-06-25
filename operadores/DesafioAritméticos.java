package operadores;

public class DesafioAritméticos {
	public static void main(String[] args) {
		//calcular a primeira parte
		int colchetes = 6 * (3 + 2);
		int firstBlockBottom = 3 * 2;
		int fistBlockTop =  (int) Math.pow(colchetes, 2);
		double fistBlock = fistBlockTop /  firstBlockBottom;
		
		//calcular segunda parte
		int secondBlockTop = (1 - 5) * (2 - 7);
		double secondBlockDiv = secondBlockTop / 2;
		double secondBlock = Math.pow(secondBlockDiv, 2);
		
		//continuação
		double blockSub = fistBlock - secondBlock;
		double blockPow = Math.pow(blockSub, 3);
		double divPow = Math.pow(10, 3);
		int blockResul =  (int) (blockPow / divPow);
		
		System.out.println(blockResul);
	}
}
