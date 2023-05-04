package crudArray;

public class Menu {
	public static void añadir(String[] titulos, String[] generos, int[] anio) {
		for (int i = 0; i< 3;i++) {
			titulos[i] = Utilidades.pedirString("▓▓▓▓▓Titulo: ");
			generos[i] = Utilidades.pedirString("Genero: ");
			anio[i] = Utilidades.pedirDatos("Año: ");
		}
	}
}
