package sesionFicheros;

import java.util.Arrays;

public class GestionFicheros {

	public static void main(String[] args) {

		String lineaSeparador = "pepe;32;madrid";
		String[] trozos = lineaSeparador.split(";");
		String nombre;
		int edad;
		String localidad;

		Grupo miGrupo = new Grupo("primero");

		System.out.println(Arrays.toString(trozos));

		nombre = trozos[0];
		System.out.println(nombre);
		edad = Integer.parseInt(trozos[1]);
		System.out.println(edad);
		localidad = trozos[2];
		System.out.println(localidad);

		if (Validaciones.validarPersona(nombre, edad, localidad)) {
			// Persona p1 = new Persona(nombre, edad, localidad);
			miGrupo.addPersona(new Persona(nombre, edad, localidad));
			System.out.println(miGrupo.toString());
		}
	}
}
