import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.Date;
public class Main {

    public static void main(String[] args) {
          // Crea un objecte que representi la data d'avui i mostra'l per pantalla.
    IO.println(LocalDate.now());
    // Crea un objecte que representi l'hora actual i mostra'l per pantalla.
    IO.println(LocalTime.now());
    // Crea un objecte que representi la data i hora actual i mostra'l per pantalla.
    IO.println(LocalDateTime.now());
    // Crea un objecte que representi la data del 6 de gener del 2034 i mostra'l per pantalla.
    LocalDate dataFutura = LocalDate.of(2034, 1, 6); 
        IO.println(dataFutura);
    // Crea un objecte que representi l'hora d'acabar  la classe  i mostra'l per pantalla.
   LocalTime horaFiClasse = LocalTime.of(14, 10); 
        IO.println(horaFiClasse);
    // Crea un objecte que representi l'instant actual i suma-li 12 minuts. 
    LocalDateTime araMateix = LocalDateTime.now().plusMinutes(12);
        IO.println(araMateix);

    // Utilitza ChronoUnit per a calcular els dies que has viscut.

    LocalDate dataNaixement = LocalDate.of(2003, Month.MAY, 17); 
        LocalDate avui = LocalDate.now();
     
        long diesViscuts = ChronoUnit.DAYS.between(dataNaixement, avui);
        
        IO.println("Dies viscuts: " + diesViscuts);
  
    }


}
