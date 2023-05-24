package sesion45_Poliformismo;

import java.util.ArrayList;

public class Centro {
	private String nombreCentro;
	private ArrayList<Persona> personas = new ArrayList<Persona>();
	
	
	
	public Centro(String nombreCentro) {
		super();
		this.nombreCentro = nombreCentro;
	}



	public String getNombreCentro() {
		return nombreCentro;
	}



	public void setNombreCentro(String nombreCentro) {
		this.nombreCentro = nombreCentro;
	}



	public ArrayList<Persona> getPersonas() {
		return personas;
	}



	public void setPersonas(ArrayList<Persona> personas) {
		this.personas = personas;
	}



	@Override
	public String toString() {
		return "Centro [nombreCentro=" + nombreCentro + ", personas=" + personas + "]";
	}
	
	
	public void addPersona(Persona persona) {
		personas.add(persona);
	}
}
