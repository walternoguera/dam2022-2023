package estructuraControl;

public class IncrementoDecremento {

	public static void main(String[] args) {
	
		int numero = 0;

		numero = numero + 1;
		if (numero < 0) {
			System.out.println("El numero " + numero + " es negativo");
		} else {
			System.out.println("El numero " + numero + " es positivo");
		}
	}
}
