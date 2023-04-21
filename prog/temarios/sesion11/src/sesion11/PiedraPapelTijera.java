package sesion11;

import java.util.Scanner;
import java.util.Random;

public class PiedraPapelTijera {

	public static void main(String[] args) {
		// Inicializamos variables
		Random azar = new Random();
		Scanner lector = new Scanner(System.in);
		int maquina;
		int jugador = 0;
		int contMaquina = 0;
		int contJugador = 0;
		int contEmpates = 0;
		int rondas;

		// Con una estructura 'do while' le preguntamos al usuario cuantas rondas quiere
		// jugar

		do {
			System.out.print("[sesion11@java ~]$ ¿Cúantas rondas quieres jugar?:  ");
			rondas = lector.nextInt();
			lector.nextLine();
		} while (rondas < 1 || rondas > 10);

		/*------------------------------------------------------------------------------------*/
		for (int i = 1; i <= rondas; i++) {
			System.out.println("===========================================");
			System.out.println("[sesion11@java ~]$ RONDA: " + i);

			// maq: azar p,p,t

			maquina = azar.nextInt(3);// 0.1.2

			// jugador p,p,t

			do {
				System.out.print("[sesion11@java ~]$ Decide: \n 0-Papel, 1-Piedra, 2-Tijeras: ");
				jugador = lector.nextInt();
				lector.nextLine();
			} while (jugador < 0 || jugador > 2);

			// comparar

			switch (maquina) {
			case 0:
				switch (jugador) {
				case 0:
					contEmpates++;
					break;
				case 1:
					contMaquina++;
					break;
				default:
					contJugador++;
				}
				break;
			case 1:
				switch (jugador) {
				case 0:
					contJugador++;
					break;
				case 1:
					contEmpates++;
					break;
				default:
					contMaquina++;
				}
				break;
			case 2:
				switch (jugador) {
				case 0:
					contMaquina++;
					break;
				case 1:
					contJugador++;
					break;
				default:
					contEmpates++;
				}
				break;
			}
			System.out.println("Empates:" + contEmpates);
			System.out.println("Jugador:" + contJugador);
			System.out.println("Máquina:" + contMaquina);
		}
	}
}
