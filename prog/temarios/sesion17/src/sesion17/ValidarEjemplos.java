package sesion17;

public class ValidarEjemplos {

	public static void main(String[] args) {
		String nombre1 = "ana";

		String nombre2 = "maria";

		String numeros = "0123456789";

		int caracterAscii;

		String dni = "t87456321R";

		int posicion;

		int longitud;

		/*
		 * System.out.println(numeros.indexOf(dni.charAt(0)));
		 * 
		 * 
		 * 
		 * if(numeros.indexOf(dni.charAt(0))!=-1) {
		 * 
		 * System.out.println("Es un número");
		 * 
		 * }else {
		 * 
		 * System.out.println("No es un número");
		 * 
		 * }
		 */

		// convierto el caracter a código ascii

		caracterAscii = (int) dni.charAt(0);

		if (caracterAscii >= 48 && caracterAscii <= 57) {

			System.out.println("Es un número");

		} else {

			System.out.println("No es número");

		}

		// número caracteres

		System.out.println(nombre1.length());

		// contenido de una posición de la cadena

		System.out.println(nombre1.charAt(0));

		System.out.println(nombre1.charAt(3));

		System.out.println(nombre2.charAt(nombre2.length() - 1));

		// contenido de varias posiciones

		System.out.println(nombre1.substring(1));

		System.out.println(nombre1.substring(1, 3));

		// contiene una subcadena

		System.out.println(nombre1.indexOf('a'));

		System.out.println(nombre1.indexOf("pe"));

		nombre1 = "pepepepepe";

		posicion = nombre1.indexOf('e');

		posicion = nombre1.indexOf('e', posicion + 1);

		System.out.println("pos " + nombre1.indexOf('e', posicion + 1));

		System.out.println(nombre1.lastIndexOf('e'));

		longitud = nombre1.length();

		// LA MANERA CORRECTA DE RECORRER COMPLETAMENTE UN ARRAY O UN STRING

		for (int i = 0; i < longitud; i++) {

			if (nombre1.charAt(i) == 'e') {

				System.out.println("Hay una e en: " + i);

			}

		}

	}

}
