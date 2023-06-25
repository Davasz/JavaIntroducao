package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		
		// offer e add -> adicionam elementos na fila
		
		// != qnd a fila ta cheia
		
		fila.add("Ana"); // lança um erro
		fila.offer("Bia"); // retorna false
		fila.add("Carolos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		// peek e element -> obter o proximo elemento (sem remover)
		// != comportamento qnd a fila ta vazia
		
		System.out.println(fila.peek()); //retorna false
		System.out.println(fila.peek()); 
		System.out.println(fila.element());// lança um erro
		System.out.println(fila.element());
		
		// poll e remove -> obtem o proximo elmento da fila e
		// remove
		
		// != qnd a fila ta vazia
		
		System.out.println("\n\n" + fila.poll()); // retorna false
		System.out.println(fila.remove()); // lança um erro
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		
		
		
	}
}
