package exercicis;

/*

Copia l'exercici anterior i modifica'l de la següent manera:

    Afegeix un mètode que llegeixi el nom de la persona del teclat, crida’l des del main,

    Posa el nom que torna el mètode dins una variable.

    Passa aquest nom al mètode simpatic.

    Author Donovan Perello

    */
import java.util.Scanner; 

public class Exercici2 {

        void main() {

            String nomGuardat = llegirNom();

            simpatic(nomGuardat);


    }
    public String llegirNom() {
        Scanner lector = new Scanner(System.in); 
        
        System.out.println("Escriu el teu nom: ");
        String nom = lector.nextLine(); 
        
        return nom; 
    }
    
    public void simpatic(String nom){

        IO.println("Hola " + nom + ", encantado!!!");


    }
    
}
