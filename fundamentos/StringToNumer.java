package fundamentos;

import javax.swing.JOptionPane;

public class StringToNumer {
	public static void main(String[] args) {
		String num1 = JOptionPane.showInputDialog(
				"Digite o primeiro numero:");
		String num2 = JOptionPane.showInputDialog(
				"Digite o segundo numero:");
		
		System.out.println(num1 + num2);
		
		double num11 = Double.parseDouble(num1);
		double num22 = Double.parseDouble(num2);
		
		System.out.println(num11 + num22);
		System.out.println("Media " + (num11 + num22) / 2 );
	}
}
