package practicasVarias;

import java.util.Arrays;

public class Controlador {

	public static void main(String[] args) {
		/*String[] nombre = Uti.arrayString();
		int[] numeros = Uti.arrayInt();*/
		
		Personas alumno = new Personas("paula", 22, 2001);
		Personas alumno1 = new Personas("lola", 23, 2000);
		System.out.println(alumno);
		alumno.setNombres("pausfl");

		System.out.println(alumno);
		System.out.println(alumno1);
		/*System.out.println(Arrays.toString(nombre));
		System.out.println(Arrays.toString(numeros));*/
	}
}
