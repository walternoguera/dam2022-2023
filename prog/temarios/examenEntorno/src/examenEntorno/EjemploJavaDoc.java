package examenEntorno;
/*@author Nombre: Walter Morel*/

/*@version 1.0: Inicial*/

/*@see `EjemploJavaDoc`: Una clase que devuelve un String*/
public class EjemploJavaDoc {
	/* @param int item: Se agrega una variable entera */
	/*
	 * @param String nombre: Se agrega una variable String que va recibir un nombre,
	 * para posteriormente saber la posicion de un `item`
	 */
	public static String metodoCadena(int item, String nombre) {
		/*
		 * @param `posicion`: por medio del metodo `substring` se determina la posicion
		 * de un item
		 */
		String posicion = nombre.substring(item);
		/* @param retorna el valor de posicion */
		return posicion;
	}
	/* @see `metodoArray`: metodo int con un parametro Array */
	/* @param tiene como parametro un array int de datos */
	public static int metodoArray(int[] datos) {
		/* @return retorna la longitud del array `datos` */
		return datos.length;
	}
}
