package utilitats;
/*A la classe UtilitatsConsola afegeix un mètode que rebi un array de sencers com a paràmetre i el mostri per pantalla, si pot ser amb el format [1, 2, 3, 4]. 

Prohibit utilitzar Arrays.toString(); 


@Author Donovan
*/
public class Exercici12arrays {

    void main(){
        int[] array = new int[3];

        array[0]= 2;
        array[1]= 4;
        array[2]= 6;
        
        mostraArray(array);
    }

    public static void mostraArray(int[] array){

        int resultat=0;
        IO.print("[");
        for (int i=0; i<array.length ; i++){

            IO.print(array[i]);

            if(i < array.length - 1){
                IO.print(", ");
            }  
            
        }
        IO.println("]");

    }


    
}
