package crudArray;

public class Practica1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcion;
		String[] titulos = null;
		String[] generos = null;
		int[] anios = null;

		do {
			// mostrar menu
			MostrarDatos.mostrarMenu();
			opcion = PedirDatos.pedirNumero("Introduce una opcion del menu", 1, 3);

			switch (opcion) {
			case 1:
				inicializar(titulos, generos, anios);
				mostrar(titulos, generos, anios);
				break;
			case 2:

				break;
			}
		} while (opcion != 3);
	}
	
	private static void inicializar(String[] titulos, String[] generos, int[] anios) {
		Utilidades.inicializarArray(titulos, 20, "-");
		Utilidades.inicializarArray(generos, 20, "-");
		Utilidades.inicializarArray(anios, 20, 1900);
	}
	
	private static void mostrar(String[] titulos, String[] generos, int[] anios) {
		Utilidades.mostrarArray(titulos, "Los titulos son:");
		Utilidades.mostrarArray(generos, "Los generos son:");
		Utilidades.mostrarArray(anios, "Los añoss son:");
	}
}
