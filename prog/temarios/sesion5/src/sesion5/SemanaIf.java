package sesion5;

public class SemanaIf {

	public static void main(String[] args) {
		// Muestra los dias de la semana en función de un número, entre 1 y 7
		
		// Declaración e inicialización de variables.
		int dia = 2;
		
		if (dia == 1) {
			System.out.println("Lunes");
		} else {
			if (dia == 2) {
				System.out.println("Martes");
			} else {
				if (dia == 3) {
					System.out.println("Miercoles");
				} else {
					if (dia == 4) {
						System.out.println("Jueves");
					} else {
						if (dia == 5) {
							System.out.println("Viernes");
						} else {
							if (dia == 6) {
								System.out.println("Sabado");
							} else {
								if (dia == 7) {
									System.out.println("Domingo");
								}
							}
						}
					}
				}
			}
		}
	}

}
