package caso3;

import java.util.ArrayList;

public class Coleccion {
	private String nombreColeccion;
	private ArrayList<Juego> listadoJuegos = new ArrayList<Juego>();

	// generamos constructor de `nombreColeccion`
	public Coleccion(String nombreColeccion) {
		super();
		this.nombreColeccion = nombreColeccion;
	}

	// getter y setter
	public String getNombreColeccion() {
		return nombreColeccion;
	}

	public void setNombreColeccion(String nombreColeccion) {
		this.nombreColeccion = nombreColeccion;
	}

	public ArrayList<Juego> getListadoJuegos() {
		return listadoJuegos;
	}

	public void setListadoJuegos(ArrayList<Juego> listadoJuegos) {
		this.listadoJuegos = listadoJuegos;
	}

	@Override
	public String toString() {
		return "Coleccion [nombreColeccion=" + nombreColeccion + ", listadoJuegos=" + listadoJuegos + "]";
	}

	public void addJuego(Juego item) {
		listadoJuegos.add(item);
	}

	/*-------------------------------------------------------------------*/

	public void datosJuego(String juego) {

		boolean encontrado = false;
		int contador = 0;
		int longitud = listadoJuegos.size();

		try {
			while (contador < longitud && !encontrado) {
				if (listadoJuegos.get(contador).getNombreJuego().equals(juego)) {
					encontrado = true;
					System.out.println(listadoJuegos.get(contador).getEdadMinima());
					System.out.println(listadoJuegos.get(contador).getPrecio());
				}
				contador++;
			}
		} catch (Exception e) {
			System.out.println("ERROR");
		}
	}

	public void precioMedio() {

		int longitud = listadoJuegos.size();
		float sumaPrecios = 0;
		float precioMedio = 0;

		for (Juego item : listadoJuegos) {
			sumaPrecios += item.getPrecio();
		}

		precioMedio = Math.round((sumaPrecios / (float) longitud) * 100f) / 100f;
		System.out.println("Precio medio: " + precioMedio);
	}

	public boolean juegoRepetido() {
		boolean encontrado = false;
		int contador = 0;
		int longitud = listadoJuegos.size();
		int primera = 0;
		int ultima = 0;

		ArrayList<String> nombres = new ArrayList<String>();

		for (Juego item : listadoJuegos) {
			nombres.add(item.getNombreJuego());
		}

		while (contador < longitud && !encontrado) {
			primera = nombres.indexOf(listadoJuegos.get(contador).getNombreJuego());
			ultima = nombres.lastIndexOf(listadoJuegos.get(contador).getNombreJuego());

			if (primera != ultima) {
				encontrado = true;
			}

			contador++;
		}
		return encontrado;
	}
}
