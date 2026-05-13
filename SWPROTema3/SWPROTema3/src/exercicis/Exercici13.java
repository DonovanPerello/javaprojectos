package exercicis;
/*Crea una classe amb un mètode que rebi un array de sencers i torni la suma de tots els seus valors. 
Al main mostra aquest resultat. 

@Author Donovan

*/
public class Exercici13 {

    void main(){
        int[] array = new int[3];

        array[0]= 1;
        array[1]= 3;
        array[2]= 1;
        
        IO.println(sumaArrays(array));
    }

    public int sumaArrays(int[] array){

        int resultat = 0;

        for(int i=0; i< array.length; i++){

            resultat = array[i] + resultat;

        }

        return resultat;
    }
}
