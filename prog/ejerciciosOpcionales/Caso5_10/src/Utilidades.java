import java.util.Scanner;
public class Utilidades {

	public static void main(String[] args) {
		
	}
		// Pedir datos
		public static int pedirDatos(String texto) {
			int numero;
			Scanner lector = new Scanner(System.in);
			System.out.println(texto);
			numero = lector.nextInt();
			lector.close();
			return numero;
		}
}