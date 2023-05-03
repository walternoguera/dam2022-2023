
public class Caso11 {

	public static void main(String[] args) {
		/*
		 * Caso 11
		 * Realizar un programa que lea una secuencia de números, se terminará de
		 * recoger números cuando el usuario introduzca un 0.
		 * Mostrar por pantalla su suma, su producto y su media.
		 * Deberás tener cuidado si el primer número introducido es un 0, no se habrá
		 * introducido ningún número y al calcular la media, recuerda que la división
		 * por cero no existe.
		 */
		
		int numero;
		
		do {
			numero = Utilidades.pedirDatos("Introduce un número: ");
			
		} while (numero != 0);
		System.out.println("error");
	}

}
