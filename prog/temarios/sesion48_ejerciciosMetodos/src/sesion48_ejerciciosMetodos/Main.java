package sesion48_ejerciciosMetodos;

public class Main {

	public static void main(String[] args) {
		//String resultado = cambiarVocales("pepe");
		String resultado = "";
		String[] reemplazo = {"a", "e", "i", "o", "u"};
		resultado = cambiarVocales("paaaeeeiiiooouuu", reemplazo);
		
		System.out.println(resultado);

	}
	
	private static String cambiarVocales(String nombre, String[] vocales) {
		//El array String vocales lo pasamos como parametro, para que a parte de devolver un nombre, tambien devuelva un array en el programa principal
		
		int longitud = vocales.length;
		
		/*for (int i = 0; i < longitud; i++) {
			nombre = nombre.replace(vocales[i], "*");
		}*/
		return nombre;
	}
	
/*------------------------------------------------------------------------------*/
	
	/*private static String cambiarVocales(String nombre) { 
		
		String[] vocales = {"a", "e", "i", "o", "u"}; //creamos un array tipo String para que el programa lo recorra y cambie todas las vocales
		int longitud = vocales.length;
		
		for (int i = 0; i < longitud; i++) {
			nombre = nombre.replace(vocales[i], "*");
		}
		return nombre;
	}*/
}
