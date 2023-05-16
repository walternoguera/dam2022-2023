package sesion29;

import java.time.LocalDate;
import java.lang.Exception;
import java.util.Scanner;

public class Controlador {

	public static void main(String[] args) {
		
		Scanner lector = new Scanner(System.in);
		String nombre;
		String dni;
		int anio;
		int mes;
		int dia;
		
		System.out.println("Dime tu nombre: ");
		nombre = lector.nextLine();
		System.out.println("Dime tu dni: ");
		dni = lector.nextLine();
		System.out.println("Año de nacimiento: ");
		anio = lector.nextInt();
		lector.nextLine();
		System.out.println("Mes de nacimiento: ");
		mes = lector.nextInt();
		lector.nextLine();
		System.out.println("Dia de nacimiento: ");
		dia = lector.nextInt();
		lector.nextLine();
		
		try {
			Persona alumno = new Persona(dni, nombre, LocalDate.of(anio, mes, dia));
			System.out.println(alumno.toString());
			
		} catch(java.time.DateTimeException e) {
			System.out.println("error en la fecha");
		} catch(Exception e) {
			System.out.println("Error");
			e.printStackTrace();
		}
	}
}
