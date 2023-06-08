package caso1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class UtilidadesFecha {
    public static int verEdad(LocalDate fecha){
        LocalDate ahora = LocalDate.now();

        return (int) ChronoUnit.YEARS.between(fecha, ahora);

    }
}
