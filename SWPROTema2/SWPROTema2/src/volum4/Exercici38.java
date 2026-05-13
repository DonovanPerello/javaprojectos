package volum4;
/*Genera sencers aleatòris entre un valor màxim i un valor mínim fins que els hagis generats tots. 

Mostra els valors generats i quantes iteracions has necessitat per conseguir-ho. 

    @Author Donovan
*/
public class Exercici38 {
    
    void main(){


    final int MAX = 15;
    final int MIN= 10;

    boolean[] generat = new boolean[MAX - MIN + 1];
   
    boolean completat;
    int comptador = 0;

    for (int i = 0; i < generat.length; i++) {
        generat[i] = false;
    }
    do {
        int aleatori = MIN + (int) (Math.random() * ((MAX - MIN) + 1));
       
        generat[aleatori - MIN] = true;
        comptador++;

        IO.println("Aleatori: " + aleatori);
        
        completat = true;

        for (int i = 0; i < generat.length && completat; i++) {
            completat = generat[i];
        }
    } while (!completat);
    System.out.printf("\nHa necessitat %d iteracions per generar-los tots\n", comptador);

}

}
