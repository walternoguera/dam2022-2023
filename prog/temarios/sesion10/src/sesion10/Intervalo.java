package sesion10;
import java.util.Arrays;
import java.util.Scanner;

public class Intervalo extends TestBucle {

	public static void main(String[] args) {
		/*
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
		int numero = 0;
		//char reset = 0;
		Scanner lector = new Scanner(System.in);
		
		do {
			System.out.println("Dame un numero que este en un intervalo de 1 y 10: ");
			numero = lector.nextInt();
			lector.nextLine();
		
			if (numero == 1) {
				System.out.println("Uno.");
			} else if (numero == 2) {
				System.out.println("Dos.");
			} else if (numero == 3) {
				System.out.println("Tres.");
			} else if (numero == 4) {
				System.out.println("Cuatro.");
			} else if (numero == 5) {
				System.out.println("Cinco.");
			} else if (numero == 6) {
				System.out.println("Seis.");
			} else if (numero == 7) {
				System.out.println("Siete.");
			} else if (numero == 8) {
				System.out.println("Ocho.");
			} else if (numero == 9) {
				System.out.println("Nueve.");
			} else if (numero == 10) {
				System.out.println("Diez.");
			} else {
				System.out.println("ERROR");
				//reset = lector.next().charAt(0);
				//lector.nextLine();
			}
		} while (numero <= 1 || numero >= 10); lector.close();
		
		String [] datos = new String [3];
		System.out.println(Arrays.toString(datos));
	}
}
