package excecao;

public class Causa {

	public static void main(String[] args) {

		try {
			MetodoA(null);
		} catch (IllegalArgumentException e) {
			if (e.getCause() != null) {
				System.out.println(e.getCause().getMessage());
			}
		}
		MetodoA(null);

	}

	static void MetodoA(Aluno aluno) {
		try {
			MetodoB(aluno);
		} catch (Exception cause) {
			throw new IllegalArgumentException(cause);
		}
	}

	static void MetodoB(Aluno aluno) {
		if (aluno == null) {
			throw new NullPointerException("ALUNO ESTA NULLO!!!");
		}
		System.out.println(aluno.nome);
	}

}
