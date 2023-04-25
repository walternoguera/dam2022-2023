package sesion16;

import java.util.Scanner;

public class StringArray {

	public static void main(String[] args) {
		String[] nombre = new String[2];
		Scanner lector = new Scanner(System.in);

		for (int i = 0; i <= 1; i++) {
			System.out.println("Dame el nombre " + (i+1) + " :");
			nombre[i] = lector.nextLine();
		}

		if (nombre[0].length() > nombre[1].length()) {
			System.out.println("el mayor es: `" + nombre[0] + "` con " + nombre[0].length() + " caracteres");
			System.out.println("En cambio `" + nombre[1] + "` solo tiene " + nombre[1].length() + " caracteres");
		} else if (nombre[1].length() > nombre[0].length()) {
			System.out.println("el mayor es: `" + nombre[1] + "` con " + nombre[1].length() + " caracteres");
			System.out.println("En cambio `" + nombre[0] + "` solo tiene " + nombre[0].length() + " caracteres");
		} else {
			Utilidades.warning(null);
		}
	}
}
