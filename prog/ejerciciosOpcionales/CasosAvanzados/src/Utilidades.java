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
		return numero;
	}
	
	public static int pedirIntRango(String texto, int inicio, int fin) {
		int numero;
		Scanner lector = new Scanner(System.in);

		do {
			System.out.println(texto);
			numero = lector.nextInt();
		} while (numero < inicio || numero > fin);
		return numero;
	} 
	
	public static String pedirString(String texto) {
		Scanner lector = new Scanner(System.in);
		System.out.println(texto);
		texto = lector.nextLine();
		return texto;
	}

}
