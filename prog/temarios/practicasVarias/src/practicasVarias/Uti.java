package practicasVarias;
import java.util.Arrays;
import java.util.Scanner;
public class Uti {
	
	public static String pedirString(String texto) {
		Scanner lector = new Scanner(System.in);
		System.out.println(texto);
		texto = lector.nextLine();
		return texto;
	}
	public static void mostrarString(String texto) {
		System.out.println(texto);
	}
	/*---------------------------------------------------*/
	public static  String[] arrayString() {
		String[] cadena = new String[3];
		int longitud = cadena.length;
		Scanner lector = new Scanner(System.in);
		
		
		for (int i = 0; i < longitud; i++) {
			System.out.println("nombres: ");
			cadena[i] = lector.nextLine();
		}
		return cadena;
	}
	/*---------------------------------------------------*/
	public static int[] arrayInt() {
		int[] numeros = new int[3];
		int longitud = numeros.length;
		Scanner lector = new Scanner(System.in);
		
		for (int i = 0; i < longitud; i++) {
			System.out.println("numeros: ");
			numeros[i] = lector.nextInt();
			lector.nextLine();
		}
		return numeros;
	}
	/*---------------------------------------------------*/
	public static boolean[] arrayBoolean() {
		boolean[] contador = new boolean[3];
		System.out.println(contador);
		return contador;
	}
	
	
}
