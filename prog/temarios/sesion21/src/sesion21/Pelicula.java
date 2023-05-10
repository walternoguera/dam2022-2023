package sesion21;

public class Pelicula {

	private String titulo;
	private String genero;
	private int duracion;
	private int valoracion;
	
	
	public Pelicula() {
		super();
	}


	public Pelicula(String titulo, String genero, int duracion, int valoracion) {
		super();
		this.titulo = titulo;
		this.genero = genero;
		this.duracion = duracion;
		this.valoracion = valoracion;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public int getDuracion() {
		return duracion;
	}


	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}


	public int getValoracion() {
		return valoracion;
	}


	public void setValoracion(int valoracion) {
		this.valoracion = valoracion;
	}


	@Override
	public String toString() {
		return "Pelicula [titulo=" + titulo + ", genero=" + genero + ", duracion=" + duracion + ", valoracion="
				+ valoracion + "]";
	}

}
