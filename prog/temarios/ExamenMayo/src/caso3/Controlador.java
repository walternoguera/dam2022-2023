package caso3;

import java.util.Scanner;

public class Controlador {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		String nombre = "";
		int edad = 0;
		int precio = 0;
		Juegos juego = new Juegos(nombre, edad, precio); // creamos un objeto `juego` de la clase `Juegos`

		try {

			System.out.println("title: ");
			nombre = lector.nextLine();
			juego.setTitulo(nombre);

			System.out.println("edad_Min: ");
			edad = lector.nextInt();
			lector.nextLine();
			juego.setEdadMin(edad);

			System.out.println("Price: ");
			precio = lector.nextInt();
			lector.nextLine();
			juego.setPrecio(precio);

			System.out.println(juego);

		} catch (Exception e) {
			System.out.println("ERROR");
		}
	}
}
