package practicasVarias;

public class Personas {
	private String nombres;
	private int edad;
	private int anio;
	
	public Personas(String nombres, int edad, int anio) {
		super();
		this.nombres = nombres;
		this.edad = edad;
		this.anio = anio;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	@Override
	public String toString() {
		return "Personas [nombres=" + nombres + ", edad=" + edad + ", anio=" + anio + "]";
	}
}
