package oo.composicao.muitoParaMuitos;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	
	
	final String nome;
	
	final List<Curso> cursos = new ArrayList<Curso>();
	
	
	public Aluno(String nome) {
		this.nome = nome;
	}
	
	
	Curso obterCursoPorNome(String nome) {
		for (Curso curso : this.cursos) {
			if (curso.nome.equalsIgnoreCase(nome)) {
				return curso;
			}
		}
		return null;
	}
	
	
	public String toString(){
		
		return nome;
	}
	
	void adicionarCurso(Curso curso) {
		this.cursos.add(curso);
		curso.alunos.add(this);
	}
	

}
