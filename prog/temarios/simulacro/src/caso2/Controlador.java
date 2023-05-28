package caso2;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.Arrays;

public class Controlador {

	public static void main(String[] args) {
		//Declaramos las variables para la clase estatica
		String[] palabras = {"Hola", " ", "mundo"};
		String[] solucionMetodo1;
		int numeroVocales = 0;
		/*---------------------------------------------*/
		//Declaramos las variables para la clase estatica
		ClaseNoEstatica objetoNoEstatico = new ClaseNoEstatica();
		int mayor;
		boolean anterior;
		LocalDate fecha1 = LocalDate.of(2023,5,23);
		LocalDate fecha2 = LocalDate.now();
		
		
		solucionMetodo1 = ClaseEstatica.trozoArray(palabras, 0);
		
		numeroVocales = ClaseEstatica.vocales("pepeiulola");
		
		mayor = objetoNoEstatico.mayor(30,10);
		System.out.println(mayor);
		
		anterior = objetoNoEstatico.fechaAnterior(fecha2);
		System.out.println(anterior);
	}
}
