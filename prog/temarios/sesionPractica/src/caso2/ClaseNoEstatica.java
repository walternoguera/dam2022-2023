package caso2;

import java.time.LocalDate;

public class ClaseNoEstatica {
	public int mayor(int num1, int num2) {
		
		return Math.max(num1, num2);
	}
	
	public boolean fechaAnterior(LocalDate fecha) {
		//true es anterior
		return fecha.isBefore(LocalDate.now());
	}
}