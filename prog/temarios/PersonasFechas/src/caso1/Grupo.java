package caso1;

import java.util.ArrayList;

public class Grupo {
	private String idGrupo;
	private ArrayList<Persona> equipo = new ArrayList<Persona>();

	public Grupo(String idGrupo) {
		super();
		this.idGrupo = idGrupo;
	}

	public String getIdGrupo() {
		return idGrupo;
	}

	public void setIdGrupo(String idGrupo) {
		this.idGrupo = idGrupo;
	}

	public ArrayList<Persona> getEquipo() {
		return equipo;
	}

	public void setEquipo(ArrayList<Persona> equipo) {
		this.equipo = equipo;
	}

	@Override
	public String toString() {
		return "Grupo [idGrupo=" + idGrupo + ", equipo=" + equipo + "]";
	}

	public void addPersonaGrupo(Persona persona) {
		equipo.add(persona);
	}

	public ArrayList<Persona> verMayores(int edad) {
		//Personas mayores de edad
		ArrayList<Persona> resultado = new ArrayList<Persona>();
		
		return resultado;
	}
	
	public ArrayList<Persona> rangoEdades(int edadInicial, int edadFinal) {
		//Personas entre dos edades
		ArrayList<Persona> resultado = new ArrayList<Persona>();
		
		return resultado;
	}
	
	public int numeroPersona() {
		//Número de personas de un grupo
		return equipo.size();
	}
	
	public float verEdadMedia() {
		//Media de edad de un grupo
		int numero = numeroPersona();
		System.out.println(numero);
		return 0;
	}
}
