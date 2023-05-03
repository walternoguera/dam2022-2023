import java.util.Scanner;

public class Utilidades {
	public static int pedirDatos(String texto) {
		int numero;
		Scanner lector = new Scanner(System.in);
		System.out.println(texto);
		numero = lector.nextInt();
		return numero;
	}
}