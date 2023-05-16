import java.util.Arrays;
import java.util.Scanner;

public class Avanzados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner lector = new Scanner(System.in);
		int[] arrayA = {2, 3, 5 ,7};
		int[] arrayB = new int[4];
		int longA = arrayA.length;
		int longB = arrayB.length;
		int[] arrayResultado = new int[arrayA.length + arrayB.length];
		int[] rango;
		
		arrayB[0] = 1;
		arrayB[1] = 7;
		arrayB[2] = 4;
		arrayB[3] = 6;
		
		System.out.println(Arrays.toString(arrayA));
		System.out.println(Arrays.toString(arrayB));
		System.out.println(Arrays.toString(arrayResultado));
		
		/*System.out.println("dame un rango: ");
		rango = new int[lector.nextInt()];
		lector.nextLine();
		
		System.out.println("el array que indicaste es de " + rango.length + " posiciones, solo miralo\n" + Arrays.toString(rango));*/
		
		
		for (int i = 0; i < longA; i++) {
			arrayResultado[i] = arrayA[i];
		}
		for (int i = 0; i < longB; i++) {
			arrayResultado[i+4] = arrayB[i];
		}
		System.out.println(Arrays.toString(arrayResultado));
		Arrays.sort(arrayResultado);
		System.out.println(Arrays.toString(arrayResultado));
		
		
	}
	
	
	/*-----------------------------------------------------------------------------*/
	
}
