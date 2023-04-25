package sesion16;

import java.util.Scanner;

public class StringPedia {

	public static void main(String[] args) {
		String[] nombre = new String[2];
		String dni ="y8878738748";
		Scanner lector = new Scanner(System.in);
		String numeros = "0123456789";
		int caracterAscii;

		for (int i = 0; i <= 1; i++) {
			System.out.print((i+1) + ". Nombre: ");
			nombre[i] = lector.nextLine();
		}
		
		// convertimos o casteamos un char a un int
		caracterAscii =  (int) dni.charAt(0);
			if (caracterAscii >= 48 && caracterAscii <= 57) {
				System.out.println("es un numero");
			} else {
				System.out.println("no es un numero");
			}
		
		
		// buscamos con indexof comparando con una cadena en la variable `numeros`
			System.out.println(numeros.indexOf(dni.charAt(0)));
			if (numeros.indexOf(dni.charAt(0))!= -1) {
				System.out.println("es otro numero");
			} else if (numeros.indexOf(dni.charAt(0)) == -1) {
				System.out.println("Error");
			}
				
		
		// Número de caracteres.
		System.out.println("\n// Número de caracteres:");
		System.out.println("El nombre `" + nombre[0] + "` tiene " + nombre[0].length() + " caracteres.");
		System.out.println("El nombre `" + nombre[1] + "` tiene " + nombre[1].length() + " caracteres.");
		
		// Contenido de una posición de la cadena, usar charAt solo cuando necesitamos que nos devuelva 1 caracter
		System.out.println("\n// Contenido de una posición de la cadena:");
		System.out.println("El contenido de la primera posición de la cadena `" + nombre[0] + "` es " + "`" + nombre[0].charAt(0) + "` y la ultima posición es `" + nombre[0].charAt(nombre[0].length()-1) + "`");
		System.out.println("El contenido de la primera posición de la cadena `" + nombre[1] + "` es " + "`" + nombre[1].charAt(0) + "` y la ultima posición es `" + nombre[1].charAt(nombre[1].length()-1) + "`");
		
		/* Contenido de varias posiciónes, el metodo `substring` devuelve una cadena de caracter a partir de una posición, 
		con el parametro `1` accedera a la posición 1 del array y devolvera el contenido de la cadena a partir de esa posición
		Agregando 2 parametros `(1, 3)` devuelve el contenido que esten en el rango.*/ 
		System.out.println("\n// Contenido de varias posiciónes.");
		System.out.println("Dame el contenido de la cadena a partir de la pocición `1` de `" + nombre[0] + "` el resultado es:  " + "`" + nombre[0].substring(1) + "`");
		System.out.println("Dame el contenido de la cadena a partir de la pocición `1` de `" + nombre[1] + "` el resultado es:  " + "`" + nombre[1].substring(1) + "`");
		System.out.println("Dame el contenido de la cadena a partir de la pocición `1` y `3` de `" + nombre[0] + "` el resultado es:  " + "`" + nombre[0].substring(1, 3) + "`");
		System.out.println("Dame el contenido de la cadena a partir de la pocición `1` y `3` de `" + nombre[1] + "` el resultado es:  " + "`" + nombre[1].substring(1, 3) + "`");
	}
}
