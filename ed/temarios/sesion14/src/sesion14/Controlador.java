package sesion14;

public class Controlador {

	public static void main(String[] args) {
		
		BarajaFrancesa miBaraja = new BarajaFrancesa(52, true);
		
		miBaraja.getNumCartas();
		miBaraja.setComodines(false);
		miBaraja.agregarTipo("Corazones");
		miBaraja.agregarTipo("Rombos");
		miBaraja.agregarTipo("Picas");
		miBaraja.agregarTipo("Tréboles");
		
		System.out.println(miBaraja.getTipos());
	}
}
