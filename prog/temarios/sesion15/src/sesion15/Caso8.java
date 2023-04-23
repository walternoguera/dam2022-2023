package sesion15;

public class Caso8 {

	public static void main(String[] args) {
		/*
		 * Caso 8 Un almacén realiza un descuento del 40% si se compran más de 100
		 * unidades de un mismo artículo; un 20% si se compran entre 25 y 100 unidades y
		 * un 10% si se compran entre 10 y 24 unidades. Escribir un programa que
		 * pregunte el precio de un artículo y la cantidad comprada y calcule e informe
		 * del total a pagar así como del descuento aplicado.
		 */

		int precio;
		int cantidad;

		cantidad = Utilidades.pedirInt("Dime la cantidad del articulo:");
		precio = Utilidades.pedirInt("Dime el precio por unidad del articulo:");
		calcular(precio, cantidad);
	}

	private static void calcular(int precio, int cantidad) {
		int bruto = precio * cantidad;
		if (cantidad > 100) {
			System.out.println("El descuento es del 40%");
			System.out.println("El precio final es " + (bruto - (bruto * 0.4)));
		} else if (cantidad >= 25 && cantidad <= 100) {
			System.out.println("El descuento es del 20%");
			System.out.println("El precio final es " + (bruto - (bruto * 0.2)));
		} else if (cantidad >= 10 && cantidad <= 24) {
			System.out.println("El descuento es del 10%");
			System.out.println("El precio final es " + (bruto - (bruto * 0.1)));
		} else {
			System.out.println("El descuento es del 0%");
			System.out.println("El precio final es " + (bruto));
		}
	}
}
