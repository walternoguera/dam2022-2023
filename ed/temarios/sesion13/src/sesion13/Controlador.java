package sesion13;

public class Controlador {

	public static void main(String[] args) {
		
		/*//creando un objeto en un array para luego manipularlo
		Persona[] lista = new Persona[3];
		lista[0] = new Persona("pepe", 32);
		lista[1] = new Persona("lola", 32);*/
		
		Persona pepe = new Persona("pepe", 32);
		Alumno lola = new Alumno("lola", 33, 1000);
		
		System.out.println("Alumna: " + lola.getNombre() + "\nEdad: " + lola.getEdad() + "\nMatricula: " + lola.getNumMatricula());
		System.out.println("________________________________");
		
		//cambiamos valores con SET
		
		lola.setNombre("Paula");
		System.out.println("Alumna: " + lola.getNombre() + "\nEdad: " + lola.getEdad() + "\nMatricula: " + lola.getNumMatricula());
	}
}
