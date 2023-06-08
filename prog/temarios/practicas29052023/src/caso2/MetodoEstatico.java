package caso2;

public class MetodoEstatico {
	public static String[] trozoArray(int posicion) {
		
		return new String[3];
	}
	
	
	
	
	
	public static int vocales(String palabra) {
		
		int longitud = palabra.length();
		int contador = 0;
		char letra;
		
		for (int i = 0; i < longitud; i++) {
			letra = palabra.charAt(i);
			if (letra == 'a' ||letra == 'e' ||letra == 'i' ||letra == 'o' ||letra == 'u') {
				contador ++;
			}
		}
		System.out.println(contador);
		return contador;
	}
}
