package ejemploJunit;

import java.util.ArrayList;
import java.util.Arrays;

public class Controlador {
	private static ArrayList<String> listaArrayList = new ArrayList<String>(); //declaramos una lista
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numeros = {1, 2, 3};
		String cadena = Controlador.stringArray(numeros);
		System.out.println(cadena);
	}
	
	public static String stringArray(int[] numeros) {
			// devuelve un string con los elementos del array		
		return Arrays.toString(numeros);
	}
	
	public static void addLista(String item) {
		listaArrayList.add(item);
	}
}
