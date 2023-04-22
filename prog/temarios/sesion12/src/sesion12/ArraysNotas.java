package sesion12;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysNotas {

	public static void main(String[] args) {
		
		int[] notas;
		int numeroAlumnos;
		Scanner lector = new Scanner(System.in);
		
		System.out.print("Dime el número de alumnos: ");
		numeroAlumnos = lector.nextInt();
		lector.nextLine();
		
		notas = new int[numeroAlumnos];
		
		for (int i = 0; i < numeroAlumnos; i++) {
			System.out.print("Dime la nota del alumno " + (i+1) + ": ");
			notas[i] = lector.nextInt();
			lector.nextLine();
		}
		Arrays.sort(notas);
		System.out.println(Arrays.toString(notas));
		System.out.println("------------------");
		System.out.println("La nota mas baja es: " + notas[0]);
		System.out.println("La nota mas alta es: " + notas[numeroAlumnos-1]);
		lector.close();
	}
}
