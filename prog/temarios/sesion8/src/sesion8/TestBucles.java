package sesion8;

public class TestBucles {

	public static void main(String[] args) {
		// Ejemplos de bucle for.

		/*for (int i = 1; i < 11; i++) {
			System.out.println(i + " : Hola mundo");
		}*/
		
		/*for (int i = 120; i <= 140; i++) {
			System.out.println(i);
		}*/
		
		//Descendente 
		/*for (int i = 140; i >= 120; i--) {
			System.out.println(i);
		}*/
		//Pares
		/*for (int i = 2; i <= 20; i+=5) {
			System.out.println(i);
		}*/
		
		/*
		 * Realizar un programa que muestre por pantalla las secuencias:
		 * 
		 * 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
		 * 
		 * 1 3 5 7 9 11 13 15 17 19
		 * 
		 * 5 10 15 20 25 30 35 40 45 50
		 * 
		 * 100 90 80 70 60 50 40 30 20 10 0
		 * 
		 * 2 4 6 10 12 14 18 20 22 26
		 */
		//Secuencias de numeros
		
		System.out.println("Rango de 1 al 20:");
		for (int i = 1; i <= 20; i++) {
			System.out.println(i);
		}
		System.out.println("De 2 en 2: ");
		for (int i = 1; i <= 20; i+=2) {
			System.out.println(i);
		}
		System.out.println("De 5 en 5: ");
		for (int i = 5; i <= 50; i+=5) {
			System.out.println(i);
		}
		System.out.println("Descendiente: ");
		for (int i = 100; i >= 0; i-=10) {
			System.out.println(i);
		}
		System.out.println("De 2 en 2: ");
		for (int i = 2; i <= 26; i+=2) {
			System.out.println(i);
		}
	}
}
