package sesion21;

public class Controlador {

	public static void main(String[] args) {
		/*
		Persona nombre = new Persona("Maria", "4543452p", 20);
		System.out.println(nombre.getDni());
		System.out.println(nombre.getEdad());
		System.out.println(nombre.getNombre());
		// cambiamos los valores con `set`
		nombre.setNombre("Paula");
		System.out.println(nombre.getNombre());*/
		
		/*Persona alumno = new Persona(); //creamos un objeto vacio.
		
		alumno.setNombre("Maria Paula");
		alumno.setEdad(22);
		alumno.setDni("7726365p");
		
		System.out.println(alumno.toString());*/
		
		
		Pelicula p1 = new Pelicula("Nobody", "Accion", 90, 7);
		Pelicula p2 = new Pelicula("Corre", "Drama", 100, 10);
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		
		if (p1.getDuracion() > p2.getDuracion()) {
			System.err.println("La pelicula " + p1.getTitulo() + " es mayor que " + p2.getTitulo());
		} else {
			System.out.println("La pelicula " + p2.getTitulo() + " es mayor que " + p1.getTitulo());
		}
	}
}
