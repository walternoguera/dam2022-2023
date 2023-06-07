package caso3;

public class Juego {
	private String nombreJuego;
	private int edadMinima;
	private float precio;
	public Juego(String nombreJuego, int edadMinima, float precio) {
		super();
		this.nombreJuego = nombreJuego;
		this.edadMinima = edadMinima;
		this.precio = precio;
		
	}
	public String getNombreJuego() {
		return nombreJuego;
	}
	public void setNombreJuego(String nombreJuego) {
		this.nombreJuego = nombreJuego;
	}
	public int getEdadMinima() {
		return edadMinima;
	}
	public void setEdadMinima(int edadMinima) {
		this.edadMinima = edadMinima;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Juego [nombreJuego=" + nombreJuego + ", edadMinima=" + edadMinima + ", precio=" + precio + "]";
	}
	
}
