package caso2;

import java.util.Arrays;

public class ClaseEstatica {
	public static String[] trozoArray(String[] datos, int posicion) {

		int longitud = datos.length;
		String[] resultado = new String[longitud - posicion];

		try {
			for (int i = 0; i < longitud - posicion; i++) {
				resultado[i] = datos[i + posicion];
			}
		} catch (Exception e) {
			System.out.println("ERROR");
		}
		
		System.out.println(Arrays.toString(resultado));
		return resultado;
	}

	public static int vocales(String palabra) {
		
		int contador = 0;
		int longitud = palabra.length();
		char letra;
		
		try {
			for (int i = 0; i < longitud; i++) {
				letra = palabra.charAt(i);
				if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
					contador ++;
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(contador);
		return contador;
	}
}
