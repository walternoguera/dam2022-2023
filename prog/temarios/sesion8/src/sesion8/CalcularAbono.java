package sesion8;
import java.util.Scanner;

public class CalcularAbono {

	public static void main(String[] args) {
		// Declaracion de las variables
		
		int edad = 0;
		char zona = 0;
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Ingresa tu edad: ");
		edad = lector.nextInt();
		lector.nextLine(); // Limpiamos el intro del scanner
		
		System.out.println("Ingresa la zona: ");
		zona = lector.next().charAt(0);
		lector.nextLine();
		
			switch (zona) {
			case 'A':
				if (edad >= 4 && edad <= 26 && zona == 'A') {
					System.out.println("El Abono joven para la zona A es de: 7,20€.");
				} else if (edad > 26 && zona == 'A') {
					System.out.println("El Abono joven para mayores de 26 años es de: 13,20 €.");
				} break;
			case 'B':
				if (edad >= 4 && edad <= 26 && zona == 'B') {
					System.out.println("El Abono joven para la zona B es de: 13,20€.");
				} else if (edad > 26 && zona == 'B') {
					System.out.println("El Abono joven para mayores de 26 años en la zona B es de: 24,20 €.");
				} break;
			case 'C':
				if (edad >= 4 && edad <= 26 && zona == 'C') {
					System.out.println("El Abono joven para la zona C es de: 20,00€.");
				} else if (edad > 26 && zona == 'C') {
					System.out.println("El Abono joven para mayores de 26 años en la zona C es de: 35,50 €.");
				} break;
			default:
				break;
		}			
		lector.close();
	}
}
