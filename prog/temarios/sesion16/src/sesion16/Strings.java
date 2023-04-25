package sesion16;
import java.util.Scanner;

public class Strings {

	public static void main(String[] args) {
			
		String nombre;
		String nombre1;
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Dame el primer nombre: ");
		nombre = lector.nextLine();
		
		System.out.println("Dame el segundo nombre: ");
		nombre1 = lector.nextLine();
		
		if (nombre.length() > nombre1.length()) {
			System.out.println("el mayor es: `" + nombre + "` con " + nombre.length() + " caracteres");
			System.out.println("En cambio `" + nombre1 + "` solo tiene " + nombre1.length() + " caracteres");
		} else if (nombre1.length() > nombre.length()) {
			System.out.println("el mayor es: `" + nombre1 + "` con " + nombre1.length() + " caracteres");
			System.out.println("En cambio `" + nombre + "` solo tiene " + nombre.length() + " caracteres");
		} else {
			Utilidades.warning(null);
		}
	}
}
