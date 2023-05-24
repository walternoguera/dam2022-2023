package examenEntorno;

public class Compra {
	// atributos
	private String identificador;
	private ArrayList<Producto> listaProductos = new ArrayList<Producto>();

	public Compra(String identificador) {
		super();
		this.identificador = identificador;
	}

	public void eliminarProducto(String nombre, int posicion) {

		if (posicion > -1) {
			listaProductos.remove(posicion);
		} else {
			System.out.println("Producto no encontrado:" + nombre);
		}

	}

}
