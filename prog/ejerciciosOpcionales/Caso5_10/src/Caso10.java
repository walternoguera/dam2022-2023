import java.util.Scanner;

public class Caso10 {

	public static void main(String[] args) {
		/*
		 * Caso 10
		 * 
		 * Realizar un programa en Java que lea una secuencia de números positivos.
		 * 
		 * Mostrar por pantalla su suma y su producto.
		 * 
		 * Se terminará de procesar números cuando el usuario introduzca un número
		 * negativo.
		 */
		
		int numero = 0;
		int suma = 0;
		int producto = 1;
		Scanner lector = new Scanner(System.in);
		
		do {
			//Realizar un programa en Java que lea una secuencia de números positivos.
			System.out.println("Introduce un numero: ");
			numero = lector.nextInt();
			lector.nextLine();
			if (numero >= 0) {
				suma = suma + numero;
				producto = producto * numero;
			}
		} while (numero >=0);
		//Mostrar por pantalla su suma y su producto.
		System.out.println("La suma es: " + suma);
		System.out.println("El producto es: " + producto);
		lector.close();
	}
}
