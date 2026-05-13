package volum4;
/*

Crea una classe que defineixi una matriu quadrada, pe 4x4, i:

    Inicialitza-la de forma que cada casella tengui la suma de les seves coordenades.

    Mostra la diagonal principal, [0,0],[1,1], [2,2]...

    Mostra la diagonal secundària [3,0],[2,1]...


    @Author Donovan
 */
public class Exercici37 {
        void main() {


//Inicialitza-la de forma que cada casella tengui la suma de les seves coordenades.
    int[][] array = new int[4][4];

    for (int i = 0; i < array.length; i++) {

        for(int j = 0; j< array[i].length; j++){

            array[i][j]= i + j;

            System.out.print(array[i][j] + "\t");


        }
          IO.println(); 
        }
        
    

    //Mostrar la diagonal principal

     IO.println("Diagonal principal");
    for (int i = 0; i < array.length; i++) {
        IO.println(array[i][i] + "\t");
    }



    //Mostra la diagonal secundària
    
        IO.println("Diagonal Secundaria");
    for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
        IO.println(array[i][j] + "\t");
    }

    }
}


