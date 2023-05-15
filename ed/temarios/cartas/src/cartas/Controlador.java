package cartas;

import java.util.ArrayList;

public class Controlador {

	public static void main(String[] args) {

		Baraja poker = new Baraja("Francesa", new ArrayList<Carta>());
		
		inicializar(poker);
		
		/*poker.addCarta(new Carta("Corazones", "As", 1));
		poker.addCarta(new Carta("Corazones", "Dos", 2));
		poker.addCarta(new Carta("Trébol", "As", 1));
		poker.addCarta(new Carta("Trébol", "Dos", 2));
		poker.addCarta(new Carta("Picas", "As", 1));
		poker.addCarta(new Carta("Picas", "Dos", 2));*/
		
		System.out.println(poker.toString());
		poker.barajar();
		System.out.println(poker.toString());
		System.out.println(poker.sacarCarta().toString());
	}
	
	private static void inicializar(Baraja mazo) {
		String[] palos = {"corazones", "picas", "diamantes", "tréboles"};
		String[] nombres = {"as", "dos", "J", "Q", "K"};
		int[] valores = {11, 2, 10, 10, 10};
		
		for (String palo: palos) {
			for (int i = 0; i < nombres.length; i++) {
				mazo.addCarta(new Carta(palo, nombres[i], valores[i]));
			}
		}
	}
}
