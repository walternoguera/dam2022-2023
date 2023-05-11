package sesion22;

import java.util.Arrays;
import java.util.Scanner;

public class Controlador {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		int[] arrayA = {2, 3, 5, 7};
		int[] arrayB = {4, 8, 9, 6};
		int longA = arrayA.length;
		int longB = arrayB.length;
		int[] arrayResultado = new int[longA + longB];
		int[] arrayRango;
		
		/*arrayB[0] = 1;
		arrayB[1] = 7;
		arrayB[2] = 4;
		arrayB[3] = 6;*/
		
		/*System.out.println(Arrays.toString(arrayA));
		System.out.println(Arrays.toString(arrayB));
		System.out.println(Arrays.toString(arrayResultado));*/
		
		/*Pedimos al usuario el rango del array 3 veces
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Ingresa un rango: ");
			arrayRango = new int[lector.nextInt()];
			System.out.println((i) + 1 + ". Array de " + arrayRango.length + " posiciones.");
			System.out.println(Arrays.toString(arrayRango));
		}*/
		
		/*rellenamos array
		for (int i = 0; i < longA ; i++) {
			arrayResultado[i] = arrayA[i];
			System.out.println(arrayResultado[i]);
		}
			System.out.println("-");
		for (int i = 0; i < longB ; i++) {
			arrayResultado[i+4] = arrayB[i];
			System.out.println(arrayResultado[i]);
		}*/
		
		//ordenar array con la clase Arrays.sort
		
		Arrays.sort(arrayResultado);
		System.out.println(Arrays.toString(arrayResultado));
	}
}
