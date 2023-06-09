package ejercicio2;

import java.util.Arrays;

public class Estatica {
	public static int[] notaMayor(int notas[]) {
		
		
		int rango = notas.length;
		int contador = 0;

			for (int i = 0; i < rango; i++) {
				if (notas[i] > 5) {
					contador ++;
				}
			}
			System.out.println(contador);

		return notas;
	}
}
