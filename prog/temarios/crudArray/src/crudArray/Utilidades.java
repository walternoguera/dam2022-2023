package crudArray;

import java.util.Arrays;

public class Utilidades {
	
	public static void inicializarArray(String[] lista, int longitud, String relleno) {
		lista = new String[longitud];
		
		for (int i = 0; i < longitud; i++) {
			lista[i] = relleno;
		}
	}
	
	public static void inicializarArray(int[] lista, int longitud, int relleno) {
		lista = new int[longitud];
		
		for (int i = 0; i < longitud; i++) {
			lista[i] = relleno;
		}
	}
	
	public static void mostrarArray(int[] lista, String texto) {
		System.out.println(texto);
		System.out.println(Arrays.toString(lista));
	}
	public static void mostrarArray(String[] lista, String texto) {
		System.out.println(texto);
		System.out.println(Arrays.toString(lista));
	}
}
