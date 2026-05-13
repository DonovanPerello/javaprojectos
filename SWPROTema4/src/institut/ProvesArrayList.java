
package institut;
import java.util.ArrayList;
public class ProvesArrayList {

    private ArrayList<Modul> llistaModuls;


    public static void main(String[] args) {
        ProvesArrayList programa = new ProvesArrayList();
        programa.proves();
    }
    public ProvesArrayList(){
        this.llistaModuls = new ArrayList<>();
    }

    public void proves() {
        //Crea quatre mòduls amb dades distints i afegeix-los a la llista.
        llistaModuls.add(new Modul("Programacio", 7));
        llistaModuls.add(new Modul("Base de Datos", 7));
        llistaModuls.add(new Modul("LLM", 5));
        llistaModuls.add(new Modul("SI", 4));
        
        //Crida el mètode mostraLlista.

        IO.println("--- mostraLlista ---");
        mostraLlista();
        

        //Recupera el mòdul que ocupa la tercera posició i mostra'l per pantalla.


        IO.println("Recuperar La tercera posició; " + llistaModuls.get(2));
        // Elimina el mòdul amb index 2.

        llistaModuls.remove(2);

        // Crida el mètode mostraLlistaIndex.
        IO.println("--- mostraLlistaIndex sin objeto en index 2---");
        mostraLlistaIndex();

        // Crea un mòdul nou, assigna’l a una variable i afegeix-lo a la posició 2.

        Modul Digitalizacio = new Modul("DASP", 1);

        llistaModuls.add(2, Digitalizacio);

        // Crida el mètode mostraLlistaIndex.
        IO.println("--- mostraLlistaIndex añadiendo objeto en index 2 ---");
        mostraLlistaIndex();
        // Elimina el mòdul creat anteriorment sense utilitzar l'index.
        llistaModuls.remove(Digitalizacio);

        // Crida el mètode mostraLlistaIndex.
    IO.println("--- mostraLlistaIndex eliminando objeto por nombre---");
        mostraLlistaIndex();
        // Crea un mòdul nou, assigna'l a la variable altre i substitueix el que hi hagi a la posició 1 per aquest.

        Modul altre = new Modul("Altre" , 4);

        llistaModuls.add(0,altre);

        //Crida el mètode mostraLlistaIndex.
        IO.println("--- mostraLlistaIndex con altre en posicio:1---");
        mostraLlistaIndex();

        //A la classe proves cronometra el temps que tarda l’ordinador en imprimir diversos valors sencers per pantalla, per exemple de l’1 al 1000.

        Cronometre crono = new Cronometre();

        IO.println("Iniciamos Cronometro");

        crono.iniciar();

        for (int i = 0; i<=1000; i++){
            IO.println(i);
        }
        crono.aturar();

        java.time.Duration duracion = crono.getTemps();
    
        IO.println("Temps transcorregut en nanosegons: " + duracion.toNanos() + " ns, " + duracion.toMillis() + " en ms" );
        
        






        
        
    }
    

    public void mostraLlistaIndex(){

        for (int i = 0; i< llistaModuls.size(); i++){

            Modul m = llistaModuls.get(i);
            IO.println("Posicio num: " + i + "= " + m);
        }

        
    }

    public void mostraLlista(){

        for (Modul m : llistaModuls){

            IO.println( m);
        }
    }




}

