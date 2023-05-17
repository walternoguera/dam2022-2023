package practicasVarias;

import java.util.Arrays;

public class Controlador {

	public static void main(String[] args) {
		String[] nombre = Uti.arrayString();
		int[] numeros = Uti.arrayInt();
	
		System.out.println(Arrays.toString(nombre));
		System.out.println(Arrays.toString(numeros));
	}
}
