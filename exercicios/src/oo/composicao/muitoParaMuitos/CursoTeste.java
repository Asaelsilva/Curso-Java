package oo.composicao.muitoParaMuitos;

public class CursoTeste {

	public static void main(String[] args) {

		Aluno aluno1 = new Aluno("Asael");
		Aluno aluno2 = new Aluno("Lais");
		Aluno aluno3 = new Aluno("Bia");
		
		Curso curso1 = new Curso("Java Web");
		Curso curso2 = new Curso("JavaScript");
		Curso curso3 = new Curso("ASP NET");
		
		curso1.adicionarAlunos(aluno1);
		curso1.adicionarAlunos(aluno2);
		
		curso2.adicionarAlunos(aluno1);
		curso2.adicionarAlunos(aluno3);
		
		
		aluno1.adicionarCurso(curso3);
		aluno2.adicionarCurso(curso3);
		aluno3.adicionarCurso(curso3);
		
		for (Aluno aluno : curso1.alunos) {
			System.out.println("Estou matriculado no curso " + curso1.nome);
			System.out.println("E meu nome �  " + aluno.nome);
			System.out.println();
		}
		
		
		System.out.println(aluno1.cursos.get(1).alunos);
		
		Curso cursoEncontrado = aluno1.obterCursoPorNome("Java Web");
		
		if (cursoEncontrado != null) {
			System.out.println(cursoEncontrado.nome);
			System.out.println(cursoEncontrado.alunos);
		}
	}

}
