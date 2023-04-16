import java.util.Scanner;

public class Dados {

	public static void main(String[] args) {
		/*
		 * Escribir un programa, en lenguaje Java, que:
		 * 
		 * 1o) Pida por teclado el resultado (dato entero) obtenido al lanzar un dado de
		 * seis caras.
		 * 
		 * 2o) Muestre por pantalla el número en letras (dato String) de la cara opuesta
		 * al resultado obtenido. Nota 1: En las caras opuestas de un dado de seis caras
		 * están los números: 1-6, 2-5 y 3-4.
		 * 
		 * 
		 * Nota 2: Si el número del dado introducido es menor que 1 ó mayor que 6, se
		 * mostrará el mensaje: "ERROR: Número incorrecto.".
		 * 
		 * 
		 * Ejemplo de ejecución:
		 * 
		 * Introduzca número del dado: 5En la cara opuesta está el "dos". Introduzca
		 * número del dado: 8 ERROR: Número incorrecto.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca número del dado: ");
		int dado = sc.nextInt();
		
		if (dado >= 1) {
			if (dado <= 6) {
				switch (dado) {
				case 1:
					System.out.println("En la cara opuesta esta el 'Seis'");
					break;
				case 2:
					System.out.println("En la cara opuesta esta el 'Cinco'");
					break;
				case 3:
					System.out.println("En la cara opuesta esta el 'Cuatro'");
					break;
				case 4:
					System.out.println("En la cara opuesta esta el 'Tres'");
					break;
				case 5:
					System.out.println("En la cara opuesta esta el 'Dos'");
					break;
				case 6:
					System.out.println("En la cara opuesta esta el 'Uno'");
					break;
				}
			} else {
				System.out.println("ERROR: Número incorrecto");
			}
		} else {
			System.out.println("ERROR: Número incorrecto");
		}
	}
}
