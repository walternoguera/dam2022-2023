package sesionFicheros;

import java.util.ArrayList;

public class Grupo {
	private String nombre;
	private ArrayList<Persona> listaPersona = new ArrayList<Persona>();

	public Grupo(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Persona> getListaPersona() {
		return listaPersona;
	}

	public void setListaPersona(ArrayList<Persona> listaPersona) {
		this.listaPersona = listaPersona;
	}

	@Override
	public String toString() {
		return "Grupo [nombre=" + nombre + ", listaPersona=" + listaPersona + "]";
	}

	public void addPersona(Persona persona) {
		listaPersona.add(persona);
	}
}
