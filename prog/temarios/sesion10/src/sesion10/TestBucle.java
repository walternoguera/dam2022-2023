package sesion10;
import java.util.Scanner;

public class TestBucle {

	public static void main(String[] args) {
		
		int edad = 0;
		boolean valido = true;
		Scanner lector = new Scanner(System.in);
		
		do {
			System.out.println("Introduce tu edad: ");
			edad = lector.nextInt();
			lector.nextLine();
			
			if (edad < 18 || edad > 120) {
				System.out.println("ERROR");
			} 
		} while (edad < 18 || edad > 120);
		
		do {
			System.out.println("Introduce tu edad otra vez: ");
			edad = lector.nextInt();
			lector.nextLine();
			if (edad < 18 || edad > 120) {
				System.out.println("ERROR");
				valido = false;
			} else {
				valido = true;
			}
		} while (!valido); lector.close();
	}
}
