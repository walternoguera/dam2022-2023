package caso3;

public class Juegos {
	private String titulo;
	private int edadMin;
	private int precio;
	
	
	public Juegos(String titulo, int edadMin, int precio) {
		super();
		this.titulo = titulo;
		this.edadMin = edadMin;
		this.precio = precio;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public int getEdadMin() {
		return edadMin;
	}


	public void setEdadMin(int edadMin) {
		this.edadMin = edadMin;
	}


	public int getPrecio() {
		return precio;
	}


	public void setPrecio(int precio) {
		this.precio = precio;
	}


	@Override
	public String toString() {
		return "Juegos [titulo=" + titulo + ", edadMin=" + edadMin + ", precio=" + precio + "]";
	}
}
