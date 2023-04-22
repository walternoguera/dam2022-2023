package sesion12;

import java.util.Arrays;

public class ArrayPedia {

	public static void main(String[] args) {
		//Arrays
		int numero = 6;
		int mes;
		int longitud;
		int[] numeros = new int[4]; // Declaramos un array de 4 pocisiones
		int[] numeros1 = { 1, 2, 3, 4 }; // Decalaramos un array y le pasamos los datos.
		int[] numeros2; // Declaramos un array vacio.
		int[] arrayDesordenada = { 23, 4, 56, 21, 3 };
		String[] meses = { "ene", "feb", "mar", "abr", "may"};
		
		
		// Inicialización posterior a la declaración.
		numeros2 = new int[numero];
		
		// CRUD --> 'Create Read Update Delete'
		// READ
		System.out.print(numeros1[0]);
		System.out.print(numeros1[1]);
		System.out.print(numeros1[2]);
		System.out.print(numeros1[3]);
		
		// UPDATE
		numeros[0] = 12;
		System.out.println(numeros[0]);
		
		// DELETE
		// MOSTRAR
		longitud = numeros1.length;
		for (int i = 0;i < longitud;i++) {
			System.out.println(numeros1[i] + "-");
		}
		System.out.println(Arrays.toString(numeros1));
		
		// SORT
		Arrays.sort(arrayDesordenada);
		System.out.println(Arrays.toString(arrayDesordenada));
		
		// pedimos numero de mes
		mes = 2;
		System.out.println(meses[mes-1]);
	}
}
