package sesion13;

public class Alumno extends Persona {
	private int numMatricula;

	public Alumno(String nombre, int edad, int numMatricula) {
		super(nombre, edad);
		this.numMatricula = numMatricula;
	}

	public int getNumMatricula() {
		return numMatricula;
	}

	public void setNumMatricula(int numMatricula) {
		this.numMatricula = numMatricula;
	}

	@Override
	public String toString() {
		return "Alumno [numMatricula=" + numMatricula + "]";
	}
}
