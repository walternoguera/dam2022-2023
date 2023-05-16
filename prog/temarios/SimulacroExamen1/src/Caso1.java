import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Caso1 {

	public static void main(String[] args) {
		/*
		 * Crear un array de 3 posiciones vacío. Usar varios tipos de datos en varios
		 * array.
		 * 
		 * Crear un array de 3 posiciones lleno. Usar varios tipos de datos en varios
		 * array.
		 * 
		 * Crear un array de float con las posiciones que diga el usuario con scanner.
		 * 
		 * Mostrar todos los arrays.
		 */

		String[] arrayString = new String[3];
		char[] arrayChar = new char[3];
		int[] arrayInt = new int[3];
		String[] arrayCadena = {"paula", "pepe", "lola"};
		char[] vocales = {'a', 'e', 'i'};
		int[] numeros = {1, 2, 3};
		int rango;
		
		Scanner lector = new Scanner(System.in);
		System.out.println("dime un rango: ");
		rango = lector.nextInt();
		lector.nextLine();
		float[] arrayFloat = new float[rango];
		
		
		for(int i = 0; i < arrayFloat.length;i++ ) {
			arrayFloat[i] = 2 + i;
		}
		
		System.out.println("Crear un array de 3 posiciones vacío. Usar varios tipos de datos en varios array: \n" + Arrays.toString(arrayString) + Arrays.toString(arrayChar) + Arrays.toString(arrayInt));
		System.out.println("Crear un array de 3 posiciones lleno. Usar varios tipos de datos en varios array: \n" + Arrays.toString(arrayCadena) + Arrays.toString(vocales) + Arrays.toString(numeros));
		System.out.println("Crear un array de float con las posiciones que diga el usuario con scanner: \nArray de " + rango + " posiciones " + Arrays.toString(arrayFloat));
	}
}
