package exercicis;
/*Escriviu un fitxer .java que demani el nombre de notes d'un alumne i les guardi dins un array de double. 

Afegiu un mètode que mostri les notes i un altre que calculi la mitjana. Mostra la mitjana des del main. 

@Author Donovan
*/
import utilitats.UtilitatsConsola;
public class Exercici19 {

        void main(){

            double[]nombreNotes= new double [UtilitatsConsola.llegirSencer("Escriu el nombre de notes")];

            for(int i =0;i<nombreNotes.length; i++){

                nombreNotes[i]= UtilitatsConsola.llegirDouble("Escriu la nota nº " + i);
            }

            mostrarNotes(nombreNotes);
           IO.println("Tu media de notas es de =  " + mitjana(nombreNotes)); 
        
        }

        public void mostrarNotes(double[] notes){

            for(int i =0;i<notes.length; i++){

                IO.println("nota nº " + i + "te aquesta nota = " + notes[i]);

            }

        }

        public double mitjana(double[] notes){

            double mitjanatotal=0;
            double resultat;

            for(int i =0;i<notes.length; i++){

                mitjanatotal+= notes[i];
            }

            resultat= (mitjanatotal / notes.length);
            return resultat;
            
        }
    
}
