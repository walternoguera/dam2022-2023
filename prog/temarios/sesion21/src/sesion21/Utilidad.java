package sesion21;
import java.util.Scanner;
public class Utilidad {

	
	public static void pedirString(String cadena) {
		
		Scanner lector = new Scanner(System.in);
		System.out.println("Ingresa una cadena: ");
		cadena = lector.next();
	}
	
}
