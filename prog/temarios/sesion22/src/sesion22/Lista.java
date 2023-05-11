package sesion22;

import java.util.Scanner;

public class Lista {

	public static void main(String[] args) {
		
		String prodUser;
		int contador = 0;
		int longitud;
		String[] productos = {"pan", "leche", "galletas"};
		int[] precios = {1, 5, 3};
		boolean encontrado = false;
		Scanner lector = new Scanner(System.in);
		
		longitud = productos.length;
		
		System.out.println("Dime el producto: ");
		prodUser = lector.nextLine();
		
		//for (int i = 0;i < longitud;i++)
		
		
		//bucle de busqueda en array
		do {
			if (productos[contador] .equals(prodUser)) {
				 System.out.println("El precio es: " + precios[contador]);
				 encontrado = true;
			}
			contador ++;
		} while (contador < longitud && !encontrado); // esta mal si lo hacemos asi --> `encontrado == false`, usar `!encontrado`.
	}
}
