package OrdenacioICerca;
import utilitats.UtilitatsConsola;

public class Exercici38 {
    public static void main(){
        int[] valors={8,4,5,2};
        IO.println("----------------SIN RESOLVER------------------");
        IO.println("["+valors[0]+"]" + "["+valors[1]+"]" +"["+valors[2]+"]" +"["+valors[3]+"]" );

        UtilitatsConsola.OrdenaBimbolla(valors);
        IO.println("----------------RESUELTO------------------");

        IO.println("["+valors[0]+"]" + "["+valors[1]+"]" +"["+valors[2]+"]" +"["+valors[3]+"]" );
    }
}


