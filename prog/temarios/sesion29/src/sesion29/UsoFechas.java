package sesion29;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class UsoFechas {

	public static void main(String[] args) {
		LocalDate ahora = LocalDate.now();

		System.out.println(ahora);

		LocalDateTime ahorita = LocalDateTime.now();

		System.out.println(ahorita);

		LocalDateTime miAhorita = LocalDateTime.of(2024, 2, 15, 10, 30, 45);

		System.out.println(miAhorita);

		System.out.println(ahorita.getDayOfMonth());

		System.out.println(ahorita.getMonth());

		System.out.println(ahorita.getYear());

		System.out.println(ahorita.getHour());

		System.out.println(ahorita.getMinute());

		System.out.println(ahorita.getSecond());

		System.out.println(ahorita.getDayOfYear());

		// diferencia de fechas en días

		// diferencia de horas

		// segundos que transcurren antes y después de ejecutar un método

	}

}
