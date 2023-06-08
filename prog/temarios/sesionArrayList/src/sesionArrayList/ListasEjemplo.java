package sesionArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ListasEjemplo {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> listaInteger = new ArrayList<Integer>();
		//ArrayList<String> listaPalabra = new ArrayList<String>();
		ArrayList<String> palabra = new ArrayList<String>();
		ArrayList<Float> listaFloat = new ArrayList<Float>();
		ArrayList<Character> listaChar = new ArrayList<Character>();
		int contador = 2;
		String texto;
		Scanner lector = new Scanner(System.in);
		int posicion;
		String palabraBuscada;
		String nuevoValor;
		
		for (int i = 0; i < contador; i++) {
			System.out.println("texto: ");
			texto = lector.next();
			palabra.add(texto);
		}
		System.out.println(palabra);
		
		//buscar
		System.out.println("Que nombre quieres buscar?: ");
		palabraBuscada = lector.next();
		palabra.indexOf(palabraBuscada);
		posicion = palabra.indexOf(palabraBuscada);
		System.out.println(posicion);
		
		//modificar
		System.out.println("Que nombre quieres modificar?: ");
		palabraBuscada = lector.next();
		palabra.indexOf(palabraBuscada);
		posicion = palabra.indexOf(palabraBuscada);
		
		System.out.println("Nuevo valor: ");
		nuevoValor = lector.next();
		palabra.set(posicion, nuevoValor);
		System.out.println(palabra);
		
		//borrar
		System.out.println("Que nombre quieres borrar?: ");
		palabraBuscada = lector.next();
		palabra.indexOf(palabraBuscada);
		posicion = palabra.indexOf(palabraBuscada);
		palabra.remove(posicion);
		
		System.out.println(palabra);
	}
}
