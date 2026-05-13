package exercicis;
import utilitats.Exercici12arrays;
/*
Crea un fitxer amb un mètode que rebi la longitud d'un array de sencers, i un màxim i un mínim, 

i torni un array de la longitud demanada inicialitzat de forma aleatòria entre el mínim i el màxim rebuts per paràmetre. 

Al main genera tres arrays de longituds diferents i mostra'ls per pantalla. Utilitza el mètode creat a l’exercici 12.


    @Author Donovan
*/
public class Exercici14 {

    void main(){

        int[] array1= maxiMinim(12,100 , 1);
        int[] array2= maxiMinim(8,100 , 1);
        int[] array3= maxiMinim(5,100 , 1);

       Exercici12arrays.mostraArray(array1);
       Exercici12arrays.mostraArray(array2);
       Exercici12arrays.mostraArray(array3);
       
        

    }
    

    public int[] maxiMinim(int tamaño, int max, int min){

        
        int[] array = new int[tamaño];


        for (int i=0; i< array.length; i++){

            array[i]= min + (int)(Math.random() * ((max - min) + 1));
        
        }

        return array;
    }
}
