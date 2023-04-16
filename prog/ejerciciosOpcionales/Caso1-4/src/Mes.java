import java.util.Scanner;

public class Mes {

	public static void main(String[] args) {
		/*
		 * Caso 3
		 * 
		 * Realizar un programa que pida el mes en forma numérica (1 ..12) y devuelva el
		 * número de días que tiene ese mes.
		 * 
		 * 
		 * Para Febrero devolver 28.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame el mes en forma numerica: ");
		int mes = sc.nextInt();
		switch (mes){
		case 1:
			System.out.println("El mes de Enero tiene: 31 días");
			break;
		case 2:
			System.out.println("El mes de Febrero tiene: 28 días");
			break;
		case 3:
			System.out.println("El mes de Marzo tiene: 31 días");
			break;
		case 4:
			System.out.println("El mes de Abril tiene: 30 días");
			break;
		case 5:
			System.out.println("El mes de Mayo tiene: 31 días");
			break;
		case 6:
			System.out.println("El mes de Junio tiene: 30 días");
			break;
		case 7:
			System.out.println("El mes de Julio tiene: 31 días");
			break;
		case 8:
			System.out.println("El mes de Agosto tiene: 31 días");
			break;
		case 9:
			System.out.println("El mes de Septiembre tiene: 30 días");
			break;
		case 10:
			System.out.println("El mes de Octubre tiene: 31 días");
			break;
		case 11:
			System.out.println("El mes de Noviembre tiene: 30 días");
			break;
		case 12:
			System.out.println("El mes de Diciembre tiene: 31 días");
			break;
		default:
			System.out.println("ERROR");
			break;
		}
	}
}
