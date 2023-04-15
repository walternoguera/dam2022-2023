package sesion5;

public class VerMayorIf {

	public static void main(String[] args) {
		// dados 3 números ver el mayor

		int numero1 = 15;
		int numero2 = 20;
		int numero3 = 14;

		if (numero1 > numero2) {
			if (numero1 > numero3) {
				System.out.println("El mayor es el número 1");
			} else {
				System.out.println("El mayor es el número 3");
			}
		} else {
			if (numero2 > numero3) {
				System.out.println("El mayor es el número 2");
			} else {
				System.out.println("El mayor es el número 3");
			}
		}
	}
}
