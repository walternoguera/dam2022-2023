package sesion25;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Controlador {

	public static void main(String[] args) {
		int[] numeros = new int[3];
		Scanner lector = new Scanner(System.in);
		int numero;
		
		try {
			numero = lector.nextInt();
			numeros[0] = 14;
			numeros[3] = 0;
		} catch (InputMismatchException e) {
			System.out.println(e.getStackTrace());
			System.out.println("Datos incorrectos");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Acceso fuera del array");
		} catch (Exception e) {
			System.out.println("Hay un error");
		} finally {
			System.out.println("final del try");
		}
	}

}
