package sesion29;

import java.time.LocalDate;

public class Persona implements TratarFecha {
	
	private String dni;
	private String nombre;
	private LocalDate fechaNac;
	
	
	public Persona(String dni, String nombre, LocalDate fechaNac) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNac = fechaNac;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public LocalDate getFechaNac() {
		return fechaNac;
	}


	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}


	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", fechaNac=" + fechaNac + "]";
	}

	//implementar metodos
	@Override
	public int verEdad() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int verDiferenciaEdad() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int verMayor(LocalDate fecha) {
		// TODO Auto-generated method stub
		return 0;
	}	
}
