package caso2;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayPedia {
	public static String[] cadenaArray(String[] texto, int posicion) {
		
		//Scanner lector = new Scanner(System.in);
		texto = new String[posicion];
		
		/*System.out.println("posicion: ");
		posicion = lector.nextInt();
		lector.nextLine();*/
		
		System.out.println(Arrays.toString(texto));	
		return texto;
	}
	
	@SuppressWarnings("unlikely-arg-type")
	public static int contarVocales(String cadena, int resultado) {
		String[] vocales = {"a", "e", "i", "o", "u"};
		cadena = "pepe";
		int rango = vocales.length;
		resultado = 0;
		
		for (int i = 0; i < rango; i++) {
			if (cadena .equals(vocales)) {
				resultado = i++;
			}
		}
		
		//System.out.println(resultado);
		return resultado;
	}
}
