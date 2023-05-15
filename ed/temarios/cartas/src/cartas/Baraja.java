package cartas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Baraja {
	private String nombre;
	private ArrayList<Carta> mazo;
	
	
	public Baraja(String nombre, ArrayList<Carta> mazo) {
		super();
		this.nombre = nombre;
		this.mazo = mazo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public ArrayList<Carta> getMazo() {
		return mazo;
	}


	public void setMazo(ArrayList<Carta> mazo) {
		this.mazo = mazo;
	}


	@Override
	public String toString() {
		return "Baraja [nombre=" + nombre + ", mazo=" + mazo + "]";
	}
	
	public void addCarta(Carta elemento) {
		mazo.add(elemento);
	}
	
	public void barajar() {
		Collections.shuffle(mazo);
	}
	
	public Carta sacarCarta() {
		return mazo.get(0);
	}
}

