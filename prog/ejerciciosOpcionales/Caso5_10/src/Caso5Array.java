import java.util.Scanner;

public class Caso5Array {

	public static void main(String[] args) {
		/*
		 * Caso 5 
		En la siguiente tabla se muestra el número de camas de las habitaciones de una casa rural,
		además de la planta donde está ubicada cada una de ellas:  
		
		HABITACIÓN		CAMAS		PLANTA
		1. AZUL			2			PRIMERA
		2. ROJA			1			PRIMERA
		3. VERDE		3			SEGUNDA
		4. ROSA			2			SEGUNDA
		5. GRIS			1			TERCERA
		
		Escribir un programa, en lenguaje Java, que:  

		1) Muestre el listado de las habitaciones de la casa rural.  

		2) Pida por teclado el número (dato entero) asociado a una habitación.  

		3) Muestre por pantalla la planta y el número de camas de la habitación seleccionada.  

		Nota: Si el número introducido por el usuario, no está asociado a ninguna habitación, se mostrará el mensaje: "ERROR: <número> no está asociado a ninguna habitación.".  

		Ejemplo de ejecución:  

		Listado de habitaciones: 1. Azul2. Roja3. Verde4. Rosa5. Gris 

		Introduzca número de habitación: 3
			
		La Verde tiene 3 cama/s y está en la segunda planta. 
		*/
		
			int[] id = { 1, 2, 3, 4, 5 };
			int numeroId;
			String[] habitaciones = { "AZUL", "ROJA", "VERDE", "ROSA", "GRIS" };
			int[] camas = { 2, 1, 3, 2, 1 };
			String[] plantas = { "PRIMERA", "PRIMERA", "SEGUNDA", "SEGUNDA", "TERCERA" };
			String[] mensajes = { "Listado de habitaciones disponibles: ", "ID| HABITACIÓN| CAMAS| PLANTA", "-----------------------------", "Introduzca número de habitación: ", "ERROR: ", " no está asociado a ninguna habitación."  };
			Scanner lector = new Scanner(System.in);
			
			System.out.println(mensajes[0]);
			System.out.println("");
			System.out.println(mensajes[1]);
			System.out.println(mensajes[2]);
			System.out.println(id[0] + "." + "  " + habitaciones[0] + "          " + camas[0] + "    " + plantas[0]);
			System.out.println(id[1] + "." + "  " + habitaciones[1] + "          " + camas[1] + "    " + plantas[1]);
			System.out.println(id[2] + "." + "  " + habitaciones[2] + "         " + camas[2] + "    " + plantas[2]);
			System.out.println(id[3] + "." + "  " + habitaciones[3] + "          " + camas[3] + "    " + plantas[3]);
			System.out.println(id[4] + "." + "  " + habitaciones[4] + "          " + camas[4] + "    " + plantas[4]);
			System.out.println("");
			
			for ( int i = 0; i <= 5; i++ ) {
				System.out.print(mensajes[3]);
				numeroId = lector.nextInt();
				lector.nextLine();
				if (numeroId <= 5) {
					System.out.println(habitaciones[numeroId-1] + " " + camas[numeroId-1] + " " + plantas[numeroId-1]);
				} else {
					System.out.println(mensajes[4] + numeroId + mensajes[5]);
				}
			} lector.close();
	}
}
