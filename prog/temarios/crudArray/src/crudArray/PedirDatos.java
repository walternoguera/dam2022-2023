package crudArray;

public class PedirDatos {
	
	public static int pedirNumero(String texto, int inicio, int fin) {
		String dato;
		
		System.out.println(texto);
		
		do {
			dato="1";
			
			
		} while(!Validar.validarNumero(dato, inicio, fin));
		return 0;
	}
}
