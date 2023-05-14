package sesion26;

import java.util.ArrayList;

public class GestionAlumnos {

	public static void main(String[] args) {

		try {

			ArrayList<String> listaAlumnos = new ArrayList<String>();

			mostrar(listaAlumnos);

			agregarAlumno(listaAlumnos, "pepe");

			mostrar(listaAlumnos);

			modificarAlumno(listaAlumnos, "lola", 0);

			mostrar(listaAlumnos);

		} catch (IndexOutOfBoundsException e) {

			// TODO: handle exception

			System.out.println("La posición no existe");

		} catch (Exception e) {

			// TODO: handle exception

			System.out.println("Hay un error");

		}
	}

	public static void modificarAlumno(ArrayList<String> datos, String nombre, int posicion) {

		datos.set(posicion, nombre);

	}

	private static void agregarAlumno(ArrayList<String> datos, String nombre) {

		datos.add(nombre);

	}

	private static void mostrar(ArrayList<String> datos) {

		System.out.println(datos.toString());

	}
}
