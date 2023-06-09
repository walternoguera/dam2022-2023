package sesionLog;

import java.time.LocalDateTime;

public class Controlador {

	public static void main(String[] args) {
		Fichero miLog = new Fichero("logs/log.txt");
		Log entrada = new Log("pepe", LocalDateTime.now(), "entrar");

		miLog.guardarLog(entrada);

		miLog.mostrarLog();

	}

}
