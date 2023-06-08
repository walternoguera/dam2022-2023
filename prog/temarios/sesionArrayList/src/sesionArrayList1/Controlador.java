package sesionArrayList1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Controlador {

	public static void main(String[] args) {
		int[] arrayInt = new int[3];
		String[] arrayPalabra = {"hola", "mundo"};
		float[] arrayFloat = new float[10];
		
		
		ArrayList<Integer> listaInt = new ArrayList<Integer>();
		ArrayList<String> listaPalabra = new ArrayList<String>();
		ArrayList<Float> listaFloat = new ArrayList<Float>();
		
		
		//CRUD
		
		//Create
		arrayInt[0] = 12;
		
		listaInt.add(12);
		listaInt.add(30);
		listaInt.add(99);
		
		//mostrar
		System.out.println(Arrays.toString(arrayInt));
		System.out.println(listaInt.toString());
		
		//modificar
		arrayInt[0] = 99;
		listaInt.set(1, 44);
		System.out.println(Arrays.toString(arrayInt));
		System.out.println(listaInt.toString());
		
		//borrar
		//en el array no se puede borrar directamente un elemento
		listaInt.remove(1);
		//System.out.println(Arrays.toString(arrayInt));
		System.out.println(listaInt.toString());
		
		
		//metodos utiles
		Collections.shuffle(listaInt);
		System.out.println(listaInt.toString());
		
	}

}
