
public class MetodosPedia {

	/*
	 * Crear un método que devuelva la suma de dos float -- hecho
	 * 
	 * Crear un método que devuelva en formato String ese número float
	 * 
	 * Crear un método que devuelva el número float con 1 único decimal.
	 * 
	 * Crear un método que redondee el número float en el segundo decimal.
	 * 
	 * Crear un método que devuelva la parte entera de un float.
	 * 
	 * Crear un método que devuelva la parate decimal de un float.
	 */
	
	

	public static float resultFloat(float numero1, float numero2) {

		return numero1 + numero2;
	}
	
	public static String mostrarString(float numero1, float numero2) {
		float result = resultFloat(numero1, numero2);
		
		return String.valueOf(result);
	}
	
	public static float floatDecimal(float numero) {
		
		//numero = 1.4f;
		System.out.println(Math.round(numero));
		return numero;
	}
}
