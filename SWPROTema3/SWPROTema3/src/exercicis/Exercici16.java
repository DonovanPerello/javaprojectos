package exercicis;

import utilitats.Exercici12arrays;
/*Escriu un fitxer amb un mètode void que rebi un array de tres sencers i l'ordeni (com a l'exercici 12 del tema anterior). 


Aquest mètode no pot mostrar res per pantalla. Al main mostra l'array abans i després d'ordenar-lo. 

Si l’array rebut és de longitud distinta de 3 no farà res. 

@Author Donovan
*/
public class Exercici16 {

    void main(){
    int[] array2 = new int[3];

        array2[0]= 9;
        array2[1]= 5;
        array2[2]= 3;

    ordenarArrays(array2);

    }

    public void ordenarArrays(int[] vector){

        if (vector.length != 3) {
        IO.println("nomes puc treballar amb vectors de 3 sencers");
    } else {
        
        IO.println("---------Vector original------------");
        
        Exercici12arrays.mostraArray(vector);
        
        IO.println("");
        
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
        
        IO.println("----------Vector ordenat------------");
        Exercici12arrays.mostraArray(vector);
        IO.println("");
    }


        

    }
    
}
