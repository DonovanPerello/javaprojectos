/*

Escriu una classe que generi dos arrays de sencers de la mateixa longitud i els inicialitzi.

    Compara-los amb una igualtat v1==v2. Funciona? Escriu l'explicació per pantalla utilitzant un println.

    Compara-los correctament. Dos arrays són iguals si tenen la mateixa longitud i a més a cada posició tenen el mateix valor. Utilitzau una variable booleana per a guardar el resultat. Imprimeix un println que ens informi del resultat de la comparació.

 */

package volum4;

public class Exercici34 {

void main() {

    boolean iguals = true;
    int[] vector1 = new int[10];
    int[] vector2 = new int[vector1.length];
    for (int index = 0; index < vector1.length; index++) {
        vector1[index] = index + 1;
        vector2[index] = index + 1;
    }

    if (vector1 == vector2) {
        IO.println("Són iguals");
    }
    IO.println("Amb vector1==vector2 comparam les referencies on estan guardats els vectors, i mai seran la mateixa.");

    //Comparam els vectors posició a posició
    for (int index = 0; index < vector1.length && iguals; index++) {
        if (vector1[index] != vector2[index]) {
            iguals = false;
        }
    }
    if (iguals) {
        IO.println("Són iguals");
    } else {
        IO.println("Són diferents");

    }
}

}