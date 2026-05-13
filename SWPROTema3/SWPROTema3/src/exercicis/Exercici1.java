package exercicis;

/*Crea un fitxer amb main i un mètode anomenat simpatic que rebi com a paràmetre una cadena de caràcters amb un nom i saludi aquesta persona. 
Crida'l des del main. 

Donovan Perello

*/


public class Exercici1 {

  
    void main() {
        int[] notas = {3,6,8,9};
        simpatic(notas);
    }

    public void simpatic(int [] notas){

        

        for(int nota : notas){

            IO.println(nota);
        }


    }
}

