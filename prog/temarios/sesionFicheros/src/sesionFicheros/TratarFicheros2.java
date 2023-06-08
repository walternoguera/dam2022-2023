package sesionFicheros;

import java.util.Arrays;

public class TratarFicheros2 {

	public static void main(String[] args) {
		String lineaFijas = "pepe      32 madrid              ";
		String lineaSeparador = "pepe;32;madrid";
		String[] trozos = lineaSeparador.split(";");
		String nombre;
		int edad;
		String localidad;
		
		
		//Extraemos datos de lineas fijas
		nombre = lineaFijas.substring(0, 10).trim();// `trim`es un metodo de la clase String para eliminar espacios en blancos
		System.out.println(nombre);
		edad = Integer.parseInt(lineaFijas.substring(10, 13).trim());
		System.out.println(edad);
		localidad = lineaFijas.substring(13).trim();
		System.out.println(localidad);
		
		/*----------------------------------------------------------------*/
		//Extraemos datos de lineas con separadores con `Split`
		
		System.out.println(Arrays.toString(trozos));
		
		nombre = trozos[0];
		System.out.println(nombre);
		edad = Integer.parseInt(trozos[1]);
		System.out.println(edad);
		localidad = trozos[2];
		System.out.println(localidad);
	}
}
