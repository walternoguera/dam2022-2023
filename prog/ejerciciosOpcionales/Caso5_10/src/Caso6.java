
public class Caso6 {

	public static void main(String[] args) {
		/*
		 * Caso 6
		 * 
		 * Escribir un programa que pida un número entero y escriba por pantalla
		 * dependiendo del valor del número:
		 * 
		 * “El número introducido es < valor_numero >”, en el caso de que sea positivo.
		 * “El número introducido es NEGATIVO”, en el caso de que sea negativo.
		 */
		
		int numero = 0;

		
		numero = Utilidades.pedirDatos("Dime un numero: ");
		
		if (numero > 0 ) {
			System.out.println("El número introducido es " + numero);
		} else if ( numero < 0) {
			System.out.println("El número introducido es NEGATIVO");
		}
	} 

}
