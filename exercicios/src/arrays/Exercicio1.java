package arrays;

import java.util.Arrays;

public class Exercicio1 {

	
	public static void main(String[] args) {
		
		double[] notasAlunoA = new double[3];
		double media = 0;
		
		notasAlunoA[0] = 8.0;
		notasAlunoA[1] = 5.5;
		notasAlunoA[2] = 7.2;
		
				
		System.out.println(Arrays.toString(notasAlunoA));
		
		
		for (int i = 0; i < notasAlunoA.length; i++) {			
			System.out.println(notasAlunoA[i]);
			media += notasAlunoA[i];
		}
		
		System.out.printf("A media do aluno A � %.2f", media / notasAlunoA.length);
		
		double[] notasAlunoB = {5.5, 7,7, 7.9, 9.1};
		
		media = 0;
		for (int i = 0; i < notasAlunoB.length; i++) {
			
			System.out.println(notasAlunoB[i]);
			media += notasAlunoB[i];
		}
		
		System.out.printf("A media do aluno B � %.2f", media / notasAlunoB.length);
	}
}
