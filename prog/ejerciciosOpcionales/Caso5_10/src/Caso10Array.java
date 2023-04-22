import java.util.Arrays;
import java.util.Scanner;

public class Caso10Array {

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
		
		int[] numero = new int[4];
		int suma = 0;
		int producto = 1;
		Scanner lector = new Scanner(System.in);
		
		for (int i = 0; i <= 3;i++) {
			do {
				System.out.println("Intriduce un número: " + i);
				numero[i] = lector.nextInt();
				lector.nextLine();
			} while (numero[i] < 0);
			suma = suma + numero[i];
			producto = producto * numero[i];
		}
		//Mostrar por pantalla su suma y su producto.
		System.out.println(Arrays.toString(numero));
		System.out.println("La suma es: " + suma);
		System.out.println("El producto es: " + producto);
		lector.close();
	}
}
