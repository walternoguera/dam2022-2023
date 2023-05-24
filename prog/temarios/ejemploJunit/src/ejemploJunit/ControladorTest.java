package ejemploJunit;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import junit.framework.Assert;

public class ControladorTest {
	
	private static ArrayList<String> listaArrayList = new ArrayList<String>(); //declaramos una lista
	
	@Test
	public void testStringArray() {
		//fail("Not yet implemented");
		
		int[] numeros = {1, 2, 3};
		String cadena = Controlador.stringArray(numeros);
		String resultado = "{1, 2, 3}";
		
		assertTrue(cadena.equals(resultado));
	}
	@Test
	public static void testAddLista(String item) {
		String dato = "hola mundo";
		Controlador.addLista(dato);
		
		assertTrue(listaArrayList.size() > 0);
	}
}
