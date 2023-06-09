package ejercicio2;

import java.util.ArrayList;

public class Objetos {
	private String asignatura;
	private int nota;
	private String nombre;
	private String grupo;
	private ArrayList<Integer> calificaciones = new ArrayList<Integer>();
	public Objetos(String asignatura, int nota, String nombre, String grupo) {
		super();
		this.asignatura = asignatura;
		this.nota = nota;
		this.nombre = nombre;
		this.grupo = grupo;
	}
	public String getAsignatura() {
		return asignatura;
	}
	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}
	public int getNota() {
		return nota;
	}
	public void setNota(int nota) {
		this.nota = nota;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getGrupo() {
		return grupo;
	}
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	public ArrayList<Integer> getCalificaciones() {
		return calificaciones;
	}
	public void setCalificaciones(ArrayList<Integer> calificaciones) {
		this.calificaciones = calificaciones;
	}
	@Override
	public String toString() {
		return "Objetos [asignatura=" + asignatura + ", nota=" + nota + ", nombre=" + nombre + ", grupo=" + grupo
				+ ", calificaciones=" + calificaciones + "]";
	}
	
	public void addGrupo(String nombreGrupo) {
		
	}
	public void addNotas(int notas) {
		calificaciones.add(notas);
	}
	
	

}
