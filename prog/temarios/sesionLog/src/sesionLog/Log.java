package sesionLog;

import java.time.LocalDateTime;

public class Log {
	private String usuario;
	private LocalDateTime tiempo;
	private String accion;

	public Log(String usuario, LocalDateTime tiempo, String accion) {
		this.usuario = usuario;
		this.tiempo = tiempo;
		this.accion = accion;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public LocalDateTime getTiempo() {
		return tiempo;
	}

	public void setTiempo(LocalDateTime tiempo) {
		this.tiempo = tiempo;
	}

	public String getAccion() {
		return accion;
	}

	public void setAccion(String accion) {
		this.accion = accion;
	}

	@Override
	public String toString() {
		return "Log{" + "usuario='" + usuario + '\'' + ", tiempo=" + tiempo + ", accion='" + accion + '\'' + '}';
	}
}
