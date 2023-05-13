package sesion23;

import java.util.Arrays;

public class ArrayPedia {

	public static void main(String[] args) {
		// CREAR
		int[] numeros = new int[4]; // 4 posiciones, desde 0 hasta 3
		int[] numeros3 = { 1, 2, 3 }; // 3 posiciones, desde 0 hasta 2
		char[] letras = { 'a', 's', 'd' };
		String[] palabras = { "hola", "mundo" };
		String[] nombres = { "pepe", "lola", "luisa", "javier" };
		int[] edades; // declaramos un array sin especificar la posicion
		int longitud = 0;
		int dato = numeros[0];
		int ultimo = numeros[3];
		int ultimoConEstilo;
		int ultimoError;
		int total = 0;
		int posicion = -1; // lo iniciamos como `-1` porque en el caso de que no encuentre ninguna
							// coincidencia te puede devolver un 0 y puede que el string que buscas este en
							// esa posicion
		String[] cadenas = new String[3];

		edades = new int[10]; // definimos longitud del array

		// Mostrar

		ultimoConEstilo = numeros[numeros.length - 1];

		// ultimoError = numeros[4]; //es un error porque la posicion 4 no existe -
		// ArrayIndexOutOfBoundException

		// Mostrar todo el array
		System.out.println(Arrays.toString(numeros3)); // muestra tal cual el contenido del array

		for (int i = 0; i < numeros3.length; i++) { // recorremos el array mostrando el contenido uno por uno
			System.out.print(numeros3[i] + " \n");
		}

		// for each
		for (int i : numeros3) {
			System.out.print(i + ", ");
			System.out.println("\n");
		}

		// MODIFICAR UN ARRAY EN UN METODO
		System.out.println(Arrays.toString(cadenas));
		addCadena(cadenas, 2);// añadimos el string en la posicion 2
		System.out.println(Arrays.toString(cadenas));

		// BUSCAR EN TODO EL ARRAY

		buscarTodo(nombres, "javier"); // busca todas las personas que se llamen `javier`
		total = buscarNumeroNombre(nombres, "pepe");
		System.out.println(total);

		posicion = buscarPosicionNombres(nombres, "pausfl"); // busca la primera ocurrencia de un dato
		System.out.println(posicion);
	}

	/*----------------------------------------------------------------------------------------------------------------------*/
	private static int buscarPosicionNombres(String[] lista, String nombre) { // creamos un metodo privado que devuelve
																				// la posicion de un nombre.
		int longitud = lista.length;
		//int contador = 0;
		int i = 0;
		int posicion = -1;
		boolean encontrado = false;

		if (longitud > 0) {
			do {
				if (lista[i].equals(nombre)) {
					posicion = i;
					encontrado = true;
				}
				i++;
			} while (i < longitud && !encontrado); // hacer esto `encontrado == false`esta mal
		}
		return posicion;
	}

	private static void addCadena(String[] cadenas, int posicion) { // creamos un metodo privado para añadir en array
		// cadenas[0] = "hola mundo";
		cadenas[posicion] = "hola mundo";
	}

	private static void buscarTodo(String[] lista, String nombre) { // creamos un metodo privado para buscar
		int longitud = lista.length;

		for (int i = 0; i < longitud; i++) {
			if (lista[i].equals(nombre)) {
				System.out.println("Hay un " + nombre + " en la posición " + i);
			} else {
				System.out.println("ERROR: No se encontraron coincidencias.");
			}
		}
	}

	private static int buscarNumeroNombre(String[] lista, String nombre) { // creamos un metodo privado que devuelve el
																			// numero de coincidencias encontradas.
		int longitud = lista.length;
		int contador = 0;

		for (int i = 0; i < longitud; i++) {
			if (lista[i].equals(nombre)) {
				contador++;
			}
		}
		return contador;
	}
}
