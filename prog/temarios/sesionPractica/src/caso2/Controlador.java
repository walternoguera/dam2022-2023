package caso2;

import java.time.LocalDate;
import java.util.Arrays;

public class Controlador {

	public static void main(String[] args) {
		String[] palabrasEstatica = {"Hola", "mundo", "pepe", "lola"};
		String[] solucionEstatica;
		int numVocales = 0;
		int mayor;
		LocalDate fecha1 = LocalDate.of(2023, 6, 6);
		LocalDate fecha2 = LocalDate.now();
		boolean anterior;
		ClaseNoEstatica objetoNoEstatico = new ClaseNoEstatica(); //cuando una clase no es estática, necesitas crear un objeto de esa clase para poder utilizar sus métodos y propiedades
		
		
		/*--------------------------------------------------------------*/
		solucionEstatica = ClaseEstatica.trozoArray(palabrasEstatica, 6);
		numVocales = ClaseEstatica.vocales("pepe");
		mayor = objetoNoEstatico.mayor(50, 10);
		System.out.println(mayor);
		anterior = objetoNoEstatico.fechaAnterior(fecha1);
		System.out.println(anterior);
		
		
		
	}
}
