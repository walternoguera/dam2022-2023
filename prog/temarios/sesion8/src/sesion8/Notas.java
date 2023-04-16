package sesion8;
import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		
		int nota;
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Introduce una nota: ");
		nota = lector.nextInt();
		lector.nextLine(); // Vaciamos el intro del scanner.
		
		if (nota < 0 || nota > 10) {
			System.out.println("Error");
		} else {
			if (nota < 5) {
				System.out.println("Suspenso");
			} else if (nota >= 5 && nota < 7) {
				System.out.println("Aprobado");
			} else if (nota >= 7 && nota < 9) {
				System.out.println("Notable");
			} else {
				System.out.println("Sobresaliente");
			}
		}
		lector.close();
	}

}
