package sesion45_Poliformismo;

public class Alumno extends Persona { // hereda de la clase Persona con extends
	private String curso;

	public Alumno(String nombre, int edad, String curso) {
		super(nombre, edad);
		this.curso = curso;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Alumno [curso=" + curso + "]";
	}
}
