

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Controlador {

	public static void main(String[] args) {
		int[] arrayInt = new int[3];
		ArrayList<Integer> lista = new ArrayList<Integer>();
		ArrayList<String> palabras = new ArrayList<String>();
		ArrayList<Float> numeros = new ArrayList<Float>();

		try {
			// CRUD
			// create
			arrayInt[0] = 12;
			lista.add(12);
			lista.add(2);
			lista.add(44);
			lista.add(23);
			lista.add(12);
			lista.add(1);
			lista.add(26);
			lista.add(30);
			lista.add(5);
			lista.add(7);
			palabras.add("paula");
		

			// mostrar contenido
			System.out.println(Arrays.toString(arrayInt));
			System.out.println(lista.toString());
		

			// modificar
			arrayInt[0] = 99;
			lista.set(1, 44);
			System.out.println(Arrays.toString(arrayInt) + lista.toString());

			// borrar
			// arrayInt[0] = 99; en array no se puede borrar
			lista.remove(1);
			System.out.println(Arrays.toString(arrayInt) + lista.toString());
			
			//metodos utiles
			
			//con collections.sort ordenamos de menor a mayir
			Collections.sort(lista);
			System.out.println(lista.toString());
			
			//con collections.reverse ordenamos de mayor a menor
			Collections.reverse(lista);
			System.out.println(lista.toString());
			
			//con collections.shuffle ordenamos de forma random
			Collections.shuffle(lista);
			System.out.println(lista.toString());
		} catch (IndexOutOfBoundsException e) {
			System.out.println("ERROR");
		}
		
		
		
	}
}
