package Colecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapa {

	public static void main(String[] args) {

		Map<Integer, String> usuario = new HashMap<>();
	
		usuario.put(1, "Roberto");
		usuario.put(2, "Asael");
		usuario.put(3, "Bia");
		usuario.put(4, "Rafaela");
		usuario.put(5, "Paula");
		
		
		System.out.println(usuario.size());
	
		System.out.println(usuario.isEmpty());
		System.out.println(usuario.keySet());
		System.out.println(usuario.values());
		System.out.println(usuario.entrySet());
	
		System.out.println(usuario.containsKey(5));
		System.out.println(usuario.containsValue("Asael"));
		
		System.out.println(usuario.get(3));
		
		
		for(int chave : usuario.keySet()) {
			System.out.println(chave);
		}
	
	}

}
