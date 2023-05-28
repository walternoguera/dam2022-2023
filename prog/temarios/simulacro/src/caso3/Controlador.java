package caso3;

public class Controlador {

	public static void main(String[] args) {
		
		Coleccion misJuegos = new Coleccion("Juegos consola:");
		
		misJuegos.addJuego(new Juego("Mario", 10, 45.234f));
		misJuegos.addJuego(new Juego("Mario", 11, 31.44f));
		misJuegos.addJuego(new Juego("Mortal Combat", 16, 67));
		
		misJuegos.datosJuego("Mario");
		
		misJuegos.precioMedio();
		
		System.out.println(misJuegos.juegoRepetido());
	}

}
