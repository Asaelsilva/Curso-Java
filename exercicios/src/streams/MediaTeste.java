package streams;

public class MediaTeste {
	
	public static void main(String[] args) {
		
		Media media = new Media().adicionar(8.5).adicionar(6.5);
		Media media1 = new Media().adicionar(6.5).adicionar(7.8);
		
		
		
		System.out.println(media.getValor());
		System.out.println(media1.getValor());
		
		System.out.println(Media.combinar(media, media1).getValor());
		
		
	}
	
	

}
