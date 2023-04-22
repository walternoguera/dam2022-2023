import java.util.Scanner;
public class Caso5 {

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
		
		//Inicialización de variables:
		
		int id;
		Scanner lector = new Scanner(System.in);
		
		// Desarrollo:
		System.out.println("Listado de habitaciones disponibles: ");
		System.out.println("");
		System.out.println("ID| HABITACIÓN| CAMAS| PLANTA");
		System.out.println("-----------------------------");
		System.out.println("1.  AZUL           2  PRIMERA");
		System.out.println("2.  ROJA           1  PRIMERA");
		System.out.println("3.  VERDE          3  SEGUNDA");
		System.out.println("4.  ROSA           2  SEGUNDA");
		System.out.println("5.  GRIS           1  TERCERA");
		System.out.println("");
		System.out.print("Introduzca número de habitación: ");
		id = lector.nextInt();
		lector.nextLine();
		
		switch (id) {
		case 1:
			System.out.println("ID 1, AZUL, 2 CAMAS, PRIMERA PLANTA");
			break;
		case 2:
			System.out.println("ID 2, ROJA, 1 CAMA, PRIMERA PLANTA");
			break;
		case 3:
			System.out.println("ID 3, VERDE, 3 CAMAS, SEGUNDA PLANTA");
			break;
		case 4:
			System.out.println("ID 4, ROSA, 2 CAMAS, SEGUNDA PLANTA");
			break;
		case 5:
			System.out.println("ID 5, GRIS, 1 CAMA, TERCERA PLANTA");
			break;
		default:
			System.out.println("ERROR: " + id + " no está asociado a ninguna habitación.");
			break;
		}
	}
}
