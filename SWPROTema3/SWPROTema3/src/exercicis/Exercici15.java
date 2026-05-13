package exercicis;
/*Escriu un fitxer que generi dos vectors de sencers i els inicialitzi. 


Escriu un mètode que pugui rebre dos vectors de sencers de diferent longitud i torni un boolèa dient si són iguals o no. 

Si no tenen la mateixa longitud evidentment no són iguals. 

@Author Donovan
*/
public class Exercici15 {

    void main(){
    int[] array = new int[3];
        array[0]= 1;
        array[1]= 3;
        array[2]= 1;
    
    int[] array2 = new int[3];

        array2[0]= 1;
        array2[1]= 3;
        array2[2]= 1;

        IO.println(arraysIguals(array, array2));
    }

    public boolean arraysIguals(int[]array1, int[]array2){

        boolean resultat = true;

        if(array1.length == array2.length){

            for(int i=0;i < array1.length; i++){

                if (array1[i]!=array2[i]){
                    resultat = false;  
                }
            }

        }else{
            resultat = false;
        }

        return resultat;
        
    }
}
