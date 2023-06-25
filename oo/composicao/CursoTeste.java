package oo.composicao;

public class CursoTeste {
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("Joao");
		Aluno aluno2 = new Aluno("Maria");
		Aluno aluno3 = new Aluno("Davi");
		
		Curso curso1 = new Curso("Java");
		Curso curso2 = new Curso("JavaScript");
		Curso curso3 = new Curso("HTML");
		
		curso1.addAluno(aluno1);
		curso1.addAluno(aluno2);
	
		curso2.addAluno(aluno1);
		curso2.addAluno(aluno3);
		
		aluno1.addCurso(curso3);
		aluno2.addCurso(curso3);
		aluno3.addCurso(curso3);
		
		
		for(Aluno aluno: curso3.alunos) {
			System.out.println(aluno);
		}
		
		System.out.println(aluno1.encontrarCursoPorNome("HTML").alunos);
		
	}
}
