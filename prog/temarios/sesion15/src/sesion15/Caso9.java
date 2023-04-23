package sesion15;

public class Caso9 {

	public static void main(String[] args) {

		/*
		 * Caso 9 
		 * Escribir un programa que pida un número entero, cuyo valor esté entre 0 y 9999.
		 * El programa debe informar de la cantidad de dígitos que tiene o dar un
		 * mensaje de error si el número introducido no está en el intervalo deseado.
		 */

		int numero = 99999;
		String cadena = Integer.toString(numero);
		int longitud;

		longitud = cadena.length();

		System.out.println("el numero tiene: " + longitud);
	}

}
