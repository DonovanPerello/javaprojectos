package exercicis;

/*

Crea un fitxer .java que defineixi una matriu quadrada, pe 4x4, i un mètode per a cada una d'aquestes opcions.

    Inicialitza-la de forma que cada casella tengui la suma de les seves coordenades.

    Mostra-la per pantalla, cada fila a una línia.

    Mostra la diagonal principal, [1,1], [2,2]...

    Mostra la diagonal secundària [4,1][3,2]...

    @Author Donovan
    */

public class Exercici18 {

    void main (){
    int[][] array = new int[4][4];

    sumaCoordenades(array);
    mostraDiagonalPrincipal(array);
    mostraDiagonalSecundaria(array);
    }

    public void sumaCoordenades(int[][]array){

        IO.println("Suma de les cordenades");
        for (int i = 0; i < array.length; i++) {
        for (int y = 0; y < array[i].length; y++) {
            array[i][y] = i + y;
            IO.println(array[i][y] + "\t");
        }
    }

    }

    public void mostraDiagonalPrincipal(int[][]array){

        IO.println("Diagonal principal");
    for (int i = 0; i < array.length; i++) {
        IO.println(array[i][i] + "\t");
    }

    }


    public void mostraDiagonalSecundaria(int[][]array){

        IO.println("Diagonal Secundaria");
    for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
        IO.println(array[i][j] + "\t");
    }

    }
}
