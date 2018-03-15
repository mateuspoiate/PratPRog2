package Paises;

public class MainTestando {

	public static void main(String[] args) {	
		
		Pais brasil = new Pais(99999, "Test", 32354, 767.54);
		
		String [] vet = brasil.vetorPaises();
		
		for(int i = 0; i<vet.length;i++) {
			System.out.println(vet[i]);
		}

	}

}