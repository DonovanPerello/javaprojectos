package exercicis;
/* Escriu un mètode que rebi qualsevol quantitat de valors sencers i torni el màxim del valors que ha rebut.


Prohibit utilitzar arrays com a paràmetre.

@Author Donovan
*/
public class Exercici12 {
    
    void main (){


        IO.println(valorMaxim(1,2,3,4,4,5,6333,2,33,12,3234,333));

    }

    public int valorMaxim(int... a){

        int resultat = a[0];
        for(int i : a){

            if( i>resultat){

                resultat = i;
            }
            
            }
        return resultat;
    }


}
