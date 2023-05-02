
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

		precio = Utilidades.pedirDatos("Dime el precio: ");
		cantidad = Utilidades.pedirDatos("Dime la cantidad: ");
		
		System.out.println(calcular(precio, cantidad));
	}
	
	private static String calcular(int precio, int cantidad) {
		int bruto;
		String msg = "";
		
		bruto = precio * cantidad;
		
		if (cantidad > 100) {
			msg = "Según la cantidad de artículo," + cantidad + " el descuento del 40%.\nTotal a pagar: " + (bruto -(bruto * 0.4));
		} else if (cantidad >= 25 && cantidad <= 100) {
			msg = "Según la cantidad de artículo," + cantidad + " el descuento del 20%.\nTotal a pagar: " + (bruto -(bruto * 0.2));
		} else if (cantidad >= 10 && cantidad <= 24) {
			msg = "Según la cantidad de artículo," + cantidad + " el descuento del 10%.\nTotal a pagar: " + (bruto -(bruto * 0.1));
		} else {
			msg = "Según la cantidad de artículo," + cantidad + " el descuento del 0%.\nTotal a pagar: " + (bruto);
		}
		return msg;
	} 
}
