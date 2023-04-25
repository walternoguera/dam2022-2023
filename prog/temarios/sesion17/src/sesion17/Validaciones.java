package sesion17;

public class Validaciones {

	public static void main(String[] args) {
		String nombre = "pepepepe";
		int posicion;
		
		posicion = nombre.indexOf('e');
		
		System.out.println("pos " + nombre.indexOf('e', posicion +1));
		System.out.println("posicion final " + nombre.lastIndexOf('e'));
	}

}
