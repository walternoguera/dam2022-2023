package sesionLog;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Fichero {
	private String url;

	public Fichero(String url) {
		this.url = url;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "Fichero{" + "url='" + url + '\'' + '}';
	}

	public void mostrarLog() {
		String datos = "";

		FileReader fichero = null;
		BufferedReader lector = null;

		try {
			fichero = new FileReader(url);
			lector = new BufferedReader(fichero);

			while ((datos = lector.readLine()) != null) {
				// procesar datos
				procesarDato(datos);

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (lector != null) {
				try {
					lector.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			if (fichero != null) {
				try {
					fichero.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

	public void guardarLog(Log datos) {

		FileWriter fichero = null;

		try {

			fichero = new FileWriter(url, true);

			fichero.write(datos.getUsuario());
			fichero.write(";");
			fichero.write(datos.getTiempo().toString());
			fichero.write(";");
			fichero.write(datos.getAccion());
			fichero.write((char) 13);

			fichero.close();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (fichero != null) {
				try {
					fichero.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}

	}

	private void procesarDato(String log) {
		// pepe;2023-03-21T18:32:26.671766200;entrar
		String[] datos = log.split(";");
		System.out.println("USUARIO: " + datos[0]);
		System.out.println("FECHA: " + datos[1]);
		/*
		 * Mediante métodos de String año: mes: dia: hora: minutos: segundos:
		 */
		/*
		 * Mediante métodos LocalDateTime año: mes: dia: hora: minutos: segundos:
		 */
		System.out.println("ACCIÓN: " + datos[2]);
		System.out.println("----------------------------------------");

	}
}
