package sesion11;

import java.util.Random;
import java.util.Scanner;

public class PiedraPapelTijera {

	public static void main(String[] args) {
		char reset;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Dame tu nota: ");
			int nota = sc.nextInt();
			if (nota < 0 || nota > 10) {
				System.out.println("Error");
			} else {
				if (nota < 5) {
					System.out.println("Suspenso");
				} else if (nota >= 5 && nota < 7) {
					System.out.println("Aprobado");
				} else if (nota >= 7 && nota < 9) {
					System.out.println("Notable");
				} else {
					System.out.println("Sobresaliente");
				}
			}
			System.out.println("¿Quieres empezar de nuevo? s/n: ");
			reset = sc.next().charAt(0);
		} while (reset == 's' || reset == 'S');
		sc.close();
		System.out.println("Hasta luego!");
	}
}
