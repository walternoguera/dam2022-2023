package ejercicio2;

import java.util.Arrays;

public class Controlador {

	public static void main(String[] args) {
		int[] notas = { 1, 2, 6, 5, 6, 6, 0 };
		notas = Estatica.notaMayor(notas);
		
		/*-------------------------------------*/
		Objetos nuevoAlumno = new Objetos("prog", 5, "pepe", "DAM");
		System.out.println(nuevoAlumno);
		nuevoAlumno.addNotas(6);
		System.out.println(nuevoAlumno);
		
		
		
		
	

	}

}
