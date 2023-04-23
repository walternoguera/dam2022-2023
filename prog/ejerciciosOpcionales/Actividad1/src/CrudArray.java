import java.util.Scanner;
public class CrudArray {

	public static void main(String[] args) {
		/*
		 * Se trata de realizar un CRUD con Arrays.
		 * 
		 * Elige un tema que te interese y guarda al menos 3 datos relacionados en 3
		 * arrays en paralelo. Por ejemplo, cine, en un array guardamos los títulos, en
		 * otro los géneros y en otro el año de creación...
		 * 
		 * Se deben guardar un máximo de 20 películas.
		 * 
		 * Si el array está lleno se debe informar al usuario.
		 * 
		 * Igualmente si no tiene contenido no se permitirá modificar o eliminar en esa
		 * posición.
		 * Debe aparecer un menú que pida al usuario la acción a realizar (añadir,
		 * modificar, borrar el contenido de la posición del array, buscar por
		 * cualquiera de los datos guardados y finalmente salir). El programa repetirá
		 * el menú hasta que se decida terminar.
		 */
		
		// Inicialización de variables
		
		String[] peliculas = new String[20];
		String[] actor = new String[20];
		int[] año = new int[20];
		//int longitud;
		Scanner lector = new Scanner(System.in);
		
		for (int i = 1; i <= 20; i++) {
			System.out.println((i) + ".");
			System.out.print("Título de la pelicula: ");
			peliculas[i] = lector.next();
			System.out.print("Actor: ");
			actor[i] = lector.next();
			lector.nextLine();
			System.out.print("Año: ");
			año[i] = lector.nextInt();
			Utilidades.menu(null);
		}
		
		
		/*longitud = peliculas.length;
		System.out.println(longitud);*/
		Utilidades.menu(null);
		
	}

}
