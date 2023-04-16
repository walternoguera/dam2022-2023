import java.util.Scanner;

public class DecirNumero {

	public static void main(String[] args) {
		/*
		 * Caso 1
		 * 
		 * Realizar un programa que pida un número entero entre 1 y 10, ambos incluidos.
		 * 
		 * 
		 * Después se debe mostrar por pantalla el número introducido, pero en formato
		 * texto.
		 * 
		 * 
		 * Si el número introducido es 1 → La salida será: uno
		 * 
		 * Si el número introducido es 2 → La salida será: dos
		 * 
		 * ......
		 * 
		 * Si el número introducido es 10 → La salida será: diez
		 * 
		 * Si el número introducido no está entre 1 y 10 → La salida será: número no
		 * válido
		 */
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Dame un número entre 1 y 10: ");
		int decir = scanner.nextInt();
		switch (decir) {
		case 1:
			System.out.println("Uno");
			break;
		case 2:
			System.out.println("Dos");
			break;
		case 3:
			System.out.println("Tres");
			break;
		case 4:
			System.out.println("Cuatro");
			break;
		case 5:
			System.out.println("Cinco");
			break;
		case 6:
			System.out.println("Seis");
			break;
		case 7:
			System.out.println("Siete");
			break;
		case 8:
			System.out.println("Ocho");
			break;
		case 9:
			System.out.println("Nueve");
			break;
		case 10:
			System.out.println("Diez");
			break;
		default:
			System.out.println("número no válido");
			break;
		}
	}
}
