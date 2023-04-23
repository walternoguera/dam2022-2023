
public class Caso7 {
	public static void main(String[] args) {
	/*
	 * Caso 7

	 * Escribir un programa que pida tres valores enteros e imprima por pantalla el
	 * mayor de ellos. Si existen valores iguales se imprimirá cualquiera de ellos.
	 * 
	 * “El número mayor es : <numero_mayor >”
	 */
	
	int[] numeros = new int[3];
	
	for (int i = 0;i <= 3;i++ ) {
		numeros[i] = Utilidades.pedirDatos("Dame 3 valores: ");
	}
}
}