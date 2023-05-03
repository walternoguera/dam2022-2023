package sesion17;

public class ValidarDatos {

	public static void main(String[] args) {

		String fecha = "15/12/2022";
		String cadenaNumeros;
		int dia, mes, ano;

		// tiene que tener 10 caracteres
		if (fecha.length() == 10) {
			// mirar las barras, las barras tienen que estar en la posición 2 y en la 5
			if (fecha.charAt(2) == '/' && fecha.charAt(5) == '/') {
				// mirar si son numeros
				cadenaNumeros = fecha.substring(0, 2) + fecha.substring(3, 5) + fecha.substring(6);
				if (sonNumeros(cadenaNumeros)) {
					System.out.println("son numeros");
					dia = Integer.parseInt(fecha.substring(0, 2));
					mes = Integer.parseInt(fecha.substring(3, 5));
					ano = Integer.parseInt(fecha.substring(6));
					// semantica, hay que mirar los dias, mes y año, por ej: dias de 1 a 31, mes de
					// 1 a 12 y año 2000 a 2022
					System.out.println(dia);
					System.out.println(mes);
					System.out.println(ano);
				} else {
					System.out.println("error no son numeros");
				}
			} else {
				System.out.println("Error las barra no estan bien");
			}

		} else {
			System.out.println("ERROR de longitud");
		}
	}

	// comprobamos si son números por medio de un metodo
	private static boolean sonNumeros(String cadena) {

		boolean valido = true;
		int longitud = cadena.length();
		int contador = 0;
		String numeros = "0123456789";

		// La manera correcta de buscar un valor dentro de un array o una cadena.
		while (contador < longitud && valido) {
			if (numeros.indexOf(cadena.charAt(contador)) == -1) {
				valido = false;
			} else {
				contador++;
			}
		}
		return valido;
	}
}
