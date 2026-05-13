package exercicis;

import utilitats.Exercici12arrays;

/*Copia l'exercici anterior i modifica'l. El mètode d'ordenació ha de comprovar que l'array tengui tres posicions. Torna un booleà, true si el podeu ordenar i false en cas contrari. 

Aquest mètode no pot mostrar res per pantalla. 

Al main mostra l'array abans i després d'ordenar-lo. 

@Author Donovan
*/
public class Exercici17 {

    void main(){
        int[] array2 = new int[3];
        array2[0]= 9;
        array2[1]= 5;
        array2[2]= 3;

        IO.println("---------Vector original------------");
        
        Exercici12arrays.mostraArray(array2);


        IO.println("----------Vector ordenat------------");
        ordenarArrays(array2);
        Exercici12arrays.mostraArray(array2);
        IO.println("");
    }


    

    public boolean ordenarArrays(int[] vector){

        boolean resultat = true;

        if (vector.length != 3) {
        
            resultat = false;
    } else {

        if (vector[0] > vector[1]) {
            int aux = vector[0];
            vector[0] = vector[1];
            vector[1] = aux;
        }
        if (vector[0] > vector[2]) {
            int aux = vector[0];
            vector[0] = vector[2];
            vector[2] = aux;
        }
        
        if (vector[1] > vector[2]) {
            int aux = vector[2];
            vector[2] = vector[1];
            vector[1] = aux;
        }
       
    }     
    return resultat;
    }
    
}

    

