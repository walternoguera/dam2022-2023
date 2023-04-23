package sesion14;

import java.util.Arrays;

public class Caso7 {

	public static void main(String[] args) {
		/*
		 * Caso 7
		 * Escribir un programa que pida tres valores enteros e imprima por pantalla el
		 * mayor de ellos. Si existen valores iguales se imprimirá cualquiera de ellos.
		 * “El número mayor es : <numero_mayor >”
		 */
		
			//solucionClasica();
			solucionArrays();
		}
	
	private static void solucionArrays() {
		
		int[] numeros = new int [3];
		
		for (int i = 0; i<=2; i++) {
			numeros[i] = Utilidades.pedirInt("Introduce un número: ");
		}
		Arrays.sort(numeros);
		System.out.println("El número mayor es: " + numeros[2]);
	}
	
	private static void solucionClasica() {
		int numero;
		int mayor = Integer.MIN_VALUE;
		
		for (int i = 1; i <= 3; i++) {
			numero = Utilidades.pedirInt("Introduce un número:");
			if (numero >= mayor) {
				mayor = numero;
			}
		}
		System.out.println("El numero mayor es :" + mayor);
	}
}
