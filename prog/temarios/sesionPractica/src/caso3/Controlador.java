package caso3;

public class Controlador {

	public static void main(String[] args) {
		Coleccion misJuegos = new Coleccion("juegos consola");
		misJuegos.addJuego(new Juego("Mario", 10, 45.234f));
		misJuegos.addJuego(new Juego("Mario kart", 16, 31.44f));
		misJuegos.addJuego(new Juego("Mario party", 7, 67));
		misJuegos.addJuego(new Juego("Mario party5", 7, 67));

		misJuegos.datosJuego("Mario kart");
		misJuegos.precioMedio();
		System.out.println(misJuegos.juegoRepetido());
	}
}
