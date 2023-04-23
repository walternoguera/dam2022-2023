package sesion14;
import java.util.Scanner;
public class Utilidades {

	public static void main(String[] args) {
		
	}
	public static int pedirInt(String texto) {
		// Pide y devuelve un int
		
		int numero;
		Scanner lector = new Scanner(System.in);
		
		System.out.println(texto);
		numero = lector.nextInt();
		lector.close();
		
		return numero;
	}
	public static String pedirString(String texto) {
		// pide y devuelve un String
		
		String palabra;
		Scanner lector = new Scanner(System.in);
		
		System.out.println(texto);
		palabra = lector.nextLine();
		lector.close();
		
		return palabra;
	}
}

