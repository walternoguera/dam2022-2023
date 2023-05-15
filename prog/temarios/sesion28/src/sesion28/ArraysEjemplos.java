package sesion28;

import java.util.Arrays;
import java.util.Scanner;
public class ArraysEjemplos {

	public static void main(String[] args) {
		String[] datos = new String[10];
		String[] datos1 = new String[8];
		String[] datos2 = new String[7];	
		
		try {
		inicializar(datos, "x");
		inicializar(datos1, "x");
		inicializar(datos2, "x");
		System.out.println(Arrays.toString(datos));
		System.out.println(Arrays.toString(datos1));
		System.out.println(Arrays.toString(datos2));
		System.out.println(buscar(datos, "x"));
		} catch (Exception e) {
			System.out.println("Error");
			e.printStackTrace();
		}
	}
	
	private static void inicializar(String[] lista, String dato) {
		int longitud = lista.length;
		for (int i = 0; i < longitud; i++) {
			lista[i] = dato;
		}
	}
	
	private static int buscar(String[] lista, String dato) {
		int posicion = -1;
		int longitud = lista.length;
		boolean encontrado = false;
		int contador = 0;
		
		while (contador < longitud && !encontrado) {
			if (lista[contador] .equals(dato)) {
				encontrado = true;
				posicion = contador;
			}
		}
		return posicion;
	}
}
