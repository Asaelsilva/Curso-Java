package fundamentos;



public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		
		double a = 1; // implicita
		System.out.println(a);
		
		float b = (float)1.123456788888; // explicita (CAST)
		System.out.println(b);
		
		int c = 100;
		byte d = (byte)c;
		
		System.out.println(d);
		
		double e = 1.99999;
		int f = (int) e;
		System.out.println(f);
		
		
	}

}
