package crudArray;
import java.util.Scanner;

public class Utilidades {
	public static int pedirDatos(String texto) {
		int numero;
		Scanner lector = new Scanner(System.in);
		System.out.println(texto);
		numero = lector.nextInt();
		return numero;
	}
	
	public static String warning(String texto) {
		// devuelve un texto
		System.out.println("WARNING: Ambos nombres coinciden con la longitud de caracteres.");
		return texto;
	}
	
	public static String pedirString(String cadena) {
		Scanner lector = new Scanner(System.in);
		System.out.println(cadena);
		cadena = lector.nextLine();
		return cadena;
	}
}