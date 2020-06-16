package streams;

public class Aluno {

	String nome;
	double nota;
	double altura;
	boolean bomComportamento;

	public Aluno(String nome, double nota) {
		this(nome, nota, true);
	}

	public Aluno(String nome, double nota, boolean bomComportamento) {

		this.nome = nome;
		this.nota = nota;
		this.bomComportamento = bomComportamento;
	}

	public Aluno(String nome, double nota, double altura) {

		this.nome = nome;
		this.nota = nota;
		this.altura = altura;
	}
}
