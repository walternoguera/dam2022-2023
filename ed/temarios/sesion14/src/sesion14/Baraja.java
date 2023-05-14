package sesion14;

import java.util.ArrayList;

public class Baraja {
	private int numCartas;
	private ArrayList<String> tipos = new ArrayList<String>();
	
	
	public Baraja(int numCartas) {
		super();
		this.numCartas = numCartas;
	}


	public int getNumCartas() {
		return numCartas;
	}


	public void setNumCartas(int numCartas) {
		this.numCartas = numCartas;
	}


	public ArrayList<String> getTipos() {
		return tipos;
	}


	public void setTipos(ArrayList<String> tipos) {
		this.tipos = tipos;
	}


	@Override
	public String toString() {
		return "Baraja [numCartas=" + numCartas + ", tipos=" + tipos + "]";
	}
	
	public void agregarTipo(String tipo) {
		tipos.add(tipo);
	}
}
