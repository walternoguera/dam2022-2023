package ejercicio3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Controlador {

	public static void main(String[] args) {
		char letra = 'k';
		String numero = "12345678";
		Arrays.toString(Cadenas.validarDni(numero, letra));
	}

}
