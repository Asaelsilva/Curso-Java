package classe;

public class Equals {

	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		u1.nome =  "Natalia bach";
		u1.email = "natalia@gmail.com";
		

		Usuario u2 = new Usuario();
		u2.nome =  "Natalia bach";
		u2.email = "natalia@gmail.com";
		
		System.out.println(u1 == u2);
		System.out.println(u1.nome == u2.nome);
		
		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(u1));
		
	}
	
}
