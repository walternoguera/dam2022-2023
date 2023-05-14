package sesion14;

public class BarajaFrancesa extends Baraja{
	
	private boolean comodines;

	public BarajaFrancesa(int numCartas, boolean comodines) {
		super(numCartas);
		this.comodines = comodines;
	}

	public boolean isComodines() {
		return comodines;
	}

	public void setComodines(boolean comodines) {
		this.comodines = comodines;
	}

	@Override
	public String toString() {
		return "BarajaFrancesa [comodines=" + comodines + "]";
	}
	
	
	
}
