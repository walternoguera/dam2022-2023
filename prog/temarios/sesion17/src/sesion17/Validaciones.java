package sesion17;
import java.util.Scanner;
public class Validaciones {

	public static void main(String[] args) {
		String[] cadena = new String [2];
		String buscar;
		Scanner lector = new Scanner(System.in);
		int posicion = -1;
		
		
		for (int i = 0; i <= 1; i++) {
			System.out.print((i +1) + ". Añade un nombre: ");
			cadena[i] = lector.nextLine();
		}
		
		
		// buscador
		System.out.println("=============================");
		System.out.println("Que nombre quieres buscar?: ");
		buscar = lector.nextLine();
		
		for (int i = 0; i <= cadena.length; i++) {
			if (cadena[i].indexOf(buscar) >= 0) {
				posicion = i;
				break;
			}
		}
		
		if (posicion >= 0) {
            System.out.println("El nombre " + buscar + " está en la posición " + posicion);
        } else {
            System.out.println("El nombre " + buscar + " no se encuentra en el array");
        }
		
		/*
		posicion = nombre.indexOf('e');
		
		System.out.println("pos " + nombre.indexOf('e', posicion +1));
		System.out.println("posicion final " + nombre.lastIndexOf('e'));
		System.out.println("pos" + nombre.indexOf('e', 4));*/
	}

}
