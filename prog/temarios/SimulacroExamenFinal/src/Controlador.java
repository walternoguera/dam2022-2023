import java.util.Arrays;
import java.util.Scanner;
public class Controlador {

	public static void main(String[] args) {
		//int[] numero = new int[5];
		int[] numero = {1, 2, 3, 3, 3, 5, 3, 4, 5, 5, 3};
		Scanner lector = new Scanner(System.in);
		int contador = 0;
		
		
		
		for (int i = 0; i < numero.length; i++) {
			/*System.out.println("dame un numero: ");
			numero[i] = lector.nextInt();
			lector.nextLine();*/
			
			if (numero[i] == 4) {
				contador++;
			}
		}
		System.out.println("el numero 4 aparece: " + contador + " veces");
	}
}
