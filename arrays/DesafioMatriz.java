package arrays;

import java.util.Scanner;

public class DesafioMatriz {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de alunos da turma: ");
		int alunosTurma = input.nextInt();
		input.nextLine();
		
		System.out.print("Digite a quantidade de notas dos alunos: ");
		int quantNotas = input.nextInt();
		input.nextLine();
		
		double[][] matriz = new double[alunosTurma][quantNotas];
		
		System.out.println("Digite o numero do aluno para editar sua nota, \n caso deseje sair"
				+ " digite sair");
		
		String controler = "";
		double nota = 0;
		for (; !"sair".equalsIgnoreCase(controler); ) {
		    controler = input.nextLine();
		    if(!"sair".equalsIgnoreCase(controler)) {
			    System.out.println("Alterando nota do aluno " + controler);
			    for (int i = 0; i < quantNotas; i++) {
			        System.out.println("Digite a nota " + (i + 1));
			        String notaStr = input.nextLine();
	                nota = Double.parseDouble(notaStr);
			        matriz[Integer.parseInt(controler) - 1][i] = nota;
			        System.out.println("Nota cadastrada!");
		    }
		    System.out.println("Digite o numero do proximo aluno");
		    } else {
		    	System.out.println("Finalizando");
		    }
		    
		}
		
		System.out.println("--------Calculando media da turma----------");
		
		double media = 0;
		
		for (double[] linha : matriz) { 
			
		    for (double elemento : linha) { 
		        media += elemento;
		    }
		}
		
		double resul = media / (quantNotas * alunosTurma);
		System.out.println(resul);
		input.close();

	}
}
