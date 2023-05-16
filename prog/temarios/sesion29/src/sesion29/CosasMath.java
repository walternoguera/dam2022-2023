package sesion29;
import java.lang.Math;
import java.util.Arrays;
public class CosasMath {

	public static void main(String[] args) {
		
		float numero = 1.4f;
		float decimales = 1.1234123412f;
		int[] numeros = {20, 3, 5, 32, 35, 5};
		
		try {
			
			System.out.println(Math.ceil(numero)); //redondea a unidad superior
			System.out.println(Math.floor(numero)); //redondea a la unidad mas baja
			System.out.println(Math.round(numero)); //redondeo clasico
			
			System.out.println(Math.max(20, 10));
			System.out.println(Arrays.toString(numeros));
			
			//truncado
			//System.out.println(Math.floorDiv(decimales, 0));
			//formateo
			
		} catch(Exception e) {
			
		}

	}

}
