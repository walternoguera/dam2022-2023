import java.util.Scanner;

public class Caso2 {
	
	public static void main(String[] args) {
		/*
		 * Caso 2
		 * 
		 * Realizar un programa que pida un número entero entre 1 y 10, ambos incluidos.
		 * Debe seguir pidiéndose mientras el número no esté en dicho intervalo.
		 * 
		 * 
		 * Después se debe mostrar por pantalla el número introducido, pero en formato
		 * texto.
		 * 
		 * 
		 * Si el número introducido es 1 → La salida será: uno Si el número introducido
		 * es 2 → La salida será: dos ......
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame un número en un intervalo de 1 a 10: ");
		int numero = sc.nextInt();
		if (numero > 1) {
			if (numero <= 10) {
				switch (numero) {
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
				}
			} else {
				System.out.println("Error");
			}
		} else {
			System.out.println("Error");
		}
	}
}
