package caso2;

import java.util.Arrays;

public class ClaseEstatica {
	public static String[] trozoArray(String[] dato, int posicion) {
		int longitud = dato.length;
		int rango = longitud - posicion;
		String[] resultado = new String[longitud - posicion];

		for (int i = 0; i < rango; i++) {
			resultado[i] = dato[i + posicion];
		}
		System.out.println(Arrays.toString(resultado));
		return resultado;
	}

	public static int vocales(String palabra) {

		int longitud = palabra.length();
		int contador = 0;
		char letra;

		try {
			for (int i = 0; i < longitud; i++) {
				letra = palabra.charAt(i);
				// System.out.println(letra);+
				if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
					contador++;
				}
			}
		} catch (Exception e) {
			System.out.println("ERROR");
		}
		System.out.println(contador);
		return contador;
	}
}
