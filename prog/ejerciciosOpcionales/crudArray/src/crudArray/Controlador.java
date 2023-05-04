package crudArray;
import java.util.Scanner;

public class Controlador {

	public static void main(String[] args) {
		
		/*
		 * Se trata de realizar un CRUD con Arrays.
		 * Elige un tema que te interese y guarda al menos 3 datos relacionados en 3
		 * arrays en paralelo. Por ejemplo, cine, en un array guardamos los títulos, en
		 * otro los géneros y en otro el año de creación...
		 * Se deben guardar un máximo de 20 películas.
		 * Si el array está lleno se debe informar al usuario.
		 * Igualmente si no tiene contenido no se permitirá modificar o eliminar en esa
		 * posición. Debe aparecer un menú que pida al usuario la acción a realizar (añadir,
		 * modificar, borrar el contenido de la posición del array, buscar por
		 * cualquiera de los datos guardados y finalmente salir). El programa repetirá
		 * el menú hasta que se decida terminar.
		 */
		
		String[] titulos = new String[3];
		String[] generos = new String[3];
		int[] anio = new int[3];
		int opciones;
		String numeros = "0123456789";
		char reset = 0;
		String msg = "";
		Scanner lector = new Scanner(System.in);
		//int contador = 0;
		//String msg = "";
		
		System.out.println("══════════ MENU ══════════\n1. Añadir\n2. Modificar\n3. Borrar\n══════════════════════════");
		opciones = Utilidades.pedirDatos("Elige una de las opciones: ");
		
		
		
		
		while (opciones < 3){
			switch (opciones) {
			case 1:
				Menu.añadir(titulos, generos, anio);
				break;
			case 2:
				System.out.println("elegiste modificar");
				break;
			case 3:
				System.out.println("elegiste borrar");
				break;
			default:
				
				break;
			}
		}
		Utilidades.warning(msg); // salta un warning en caso de que la condicion de while no se cumpla
				
	}
}
