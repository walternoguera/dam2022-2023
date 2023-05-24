package caso3;

import java.util.Arrays;

public class JuegosArray {
	private String[] titulo = new String[3];

	public JuegosArray(String[] titulo) {
		super();
		this.titulo = titulo;
	}

	public String[] getTitulo() {
		return titulo;
	}

	public void setTitulo(String[] titulo) {
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		return "JuegosArray [titulo=" + Arrays.toString(titulo) + "]";
	}
}
