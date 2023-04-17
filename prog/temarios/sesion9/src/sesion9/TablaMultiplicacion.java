package sesion9;
import java.util.Scanner;

public class TablaMultiplicacion {

	public static void main(String[] args) {
		// Tabla de multiplicación.
		// le pido al usuario  un numero:3
		//3*1 = 3
		//3*2 = 6
		//..
		
		//le pido al usuario un numero 3 y otro 6
		//3*1 = 3
		//...
		//4*1 =4 hasta 6
		
		int numero1 = 0;
		int numero2 = 0;
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Dame un numero: ");
		numero1 = lector.nextInt();
		lector.nextLine();
		
		System.out.println("Tabla del " + numero1 + ":");
		for (int i = 1; i <= 10; i++ ) {
			System.out.println(numero1 + "X" + i + "=" + (numero1 * i));
		}
		System.out.print("Dame dos numeros: ");
		numero1 = lector.nextInt();
		numero2 = lector.nextInt();
		lector.nextLine();
		lector.close();
		for (int i = numero1; i <= 10; i++) {
			
		}
		//System.out.print("elegiste el: " + numero1 + ", " + numero2);
	}
}
