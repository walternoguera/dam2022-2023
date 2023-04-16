package sesion7;
import java.util.Scanner;
public class TiposDatos {

	public static void main(String[] args) {
		
		byte numByte;
		short numShort;
		int numInt;
		long numLong;
		float numFloat;
		double numDouble;
		char letra;
		String palabra;
		
		Scanner lector = new Scanner(System.in);
		
		System.out.println("dame un numero byte: ");
		numByte = lector.nextByte();
		lector.nextLine(); //vaciar intro del Scanner
		
		System.out.println("introduce una palabra: ");
		palabra = lector.nextLine();
		lector.nextLine(); //vaciar intro del Scanner
		
		System.out.println("dame un caracter: ");
		letra = lector.next().charAt(0);
		lector.nextLine(); //vaciar intro del Scanner
		
		System.out.println("dame un numero short: ");
		numShort = lector.nextShort();
		lector.nextLine(); //vaciar intro del Scanner
		
		System.out.println("dame un numero int: ");
		numInt = lector.nextInt();
		lector.nextLine(); //vaciar intro del Scanner
		
		System.out.println("dame un numero long: ");
		numLong = lector.nextLong();
		lector.nextLine(); //vaciar intro del Scanner
		
		System.out.println("dame un numero float: ");
		numFloat = lector.nextFloat();
		lector.nextLine(); //vaciar intro del Scanner
		System.out.println(numFloat);
		
		System.out.println("dame un numero double: ");
		numDouble = lector.nextDouble();
		lector.nextLine(); //vaciar intro del Scanner
		System.out.println(numDouble);
		
		lector.close();
	}
}
