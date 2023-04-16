package sesion8;
import java.util.Scanner;

public class NotaMedia {

	public static void main(String[] args) {
		// Declaracion de variables
		
		int suma = 0;
		int media = 0;
		int nota = 0;
		Scanner lector = new Scanner(System.in);
		
		for (int i = 1; i <= 4; i++) {
			System.out.println("Introduce una nota: ");
			nota = lector.nextInt();
			lector.nextLine();
			suma = suma + nota;	
		}
		media = suma/4;
		System.out.println("La media es " + media);
		lector.close();
	} 
}
