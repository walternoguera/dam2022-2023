import java.util.Arrays;

public class Caso7 {
	public static void main(String[] args) {
		/*
		 * Caso 7
		 * 
		 * Escribir un programa que pida tres valores enteros e imprima por pantalla el
		 * mayor de ellos. Si existen valores iguales se imprimirá cualquiera de ellos.
		 * 
		 * “El número mayor es : <numero_mayor >”
		 */

		valoresEnteros();
	}

	private static void valoresEnteros() {
		int[] numeros = new int[3];

		for (int i = 0; i <= 2; i++) {
			numeros[i] = Utilidades.pedirDatos((i) + 1 + "- Introduce un número: ");
		}
		Arrays.sort(numeros);
		System.out.println("El número mayor es : " + numeros[2]);
	}
}
