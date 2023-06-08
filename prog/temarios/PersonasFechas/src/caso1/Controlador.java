package caso1;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Controlador {

	public static void main(String[] args) {
		float numero = 0;

		Grupo miEquipo = new Grupo("DAM");
		miEquipo.addPersonaGrupo(new Persona("pepe", LocalDate.of(2000, 2, 23), miEquipo.getIdGrupo()));
		miEquipo.addPersonaGrupo(new Persona("lola", LocalDate.of(2005, 3, 22), miEquipo.getIdGrupo()));
		miEquipo.addPersonaGrupo(new Persona("paula", LocalDate.of(1999, 2, 1), miEquipo.getIdGrupo()));
		miEquipo.addPersonaGrupo(new Persona("miguel", LocalDate.of(1991, 1, 9), miEquipo.getIdGrupo()));
		miEquipo.addPersonaGrupo(new Persona("vanesa", LocalDate.of(2000, 3, 29), miEquipo.getIdGrupo()));
		miEquipo.addPersonaGrupo(new Persona("lalo", LocalDate.of(2000, 3, 29), miEquipo.getIdGrupo()));

		System.out.println(miEquipo.toString());

		// Personas mayores de edad

		// Personas entre dos edades

		// Número de personas de un grupo
		System.out.println("El número de personas dentro del grupo es: " + miEquipo.numeroPersona());
		// Media de edad de un grupo
		numero = miEquipo.verEdadMedia();

	}

}
