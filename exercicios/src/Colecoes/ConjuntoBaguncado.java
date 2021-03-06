package Colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		HashSet conjunto = new HashSet();
		
		//Adicionando itens ao conjunto
		conjunto.add(1.2); //double -> Double
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add("A");
		
		
		System.out.println("O tamanho � " + conjunto.size());
		
		conjunto.add("Teste");
		System.out.println("O tamanho � " + conjunto.size());
		
		//removendo
		System.out.println(conjunto.remove("A"));
		System.out.println(conjunto.remove(2));
		System.out.println("O tamanho � " + conjunto.size());
		
		// verificando item: o elemento "A" esta contido no conjunto? True
		System.out.println(conjunto.contains("A"));
		
		Set nums = new HashSet();
				
		nums.add(3);
		nums.add(2);
		nums.add(1);
		
		System.out.println(nums);
		
		for (Object num : nums) {
			System.out.println(num);
		}
		System.out.println(conjunto);
		
		// uni�o de conjuntos
//		conjunto.addAll(nums);
//		System.out.println(conjunto);
		
		conjunto.retainAll(nums);
		System.out.println(conjunto);
		
		
 	}

}
