package cat.paucasesnoves.executable;
import cat.paucasesnoves.utilitats.*;
import java.time.Duration;
public class Main {

    public static void main(String[] args) {

        
        
        int longitud = UtilitatsConsola.llegirSencer("Dime la longitud de tu Array: ");

        int[] array = new int[longitud];


        for (int i = 0; i< array.length; i++){

            array[i] = (int)(Math.random() * 100 + 1);
            IO.println(array[i]);

        }


        Cronometre cron = new Cronometre();

        cron.start();

        OrdenacioICerca.bimbolla(array);

        cron.stop();

        IO.println("------------ARRAY ORDENADO-------------------");

        for (int i = 0; i< array.length; i++){

            IO.println(array[i]);

        }
        
        long tiempoCrudo = cron.temps(); 

        Duration duracion = Duration.ofNanos(tiempoCrudo);


        IO.println("Ha tardado: " + duracion.toMillis() + " ms"); 
        IO.println("O: " + duracion.toNanos() + " ns");






    }

}
