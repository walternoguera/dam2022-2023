package sesion21;

public class Persona {

	private String nombre;
	private String dni;
	private int edad;
	
	 
	public Persona() {
		super();
	}


	public Persona(String nombre, String dni, int edad) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
	}

	
	//GETTERS Y SETTERS

	public String getNombre() {
		return nombre;
	}


	public void setNombre(Object object) {
		this.nombre = (String) object;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", dni=" + dni + ", edad=" + edad + "]";
	}
	
	

}
