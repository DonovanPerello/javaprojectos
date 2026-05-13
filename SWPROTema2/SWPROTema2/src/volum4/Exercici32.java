package volum4;
/* Escriu una classe que crei un array de 10 sencers, 
els inicialitzi de 1 a 10 i els mostri per pantalla.*/
public class Exercici32 {
    void main(){
     int [] meuArray = new int[10] ;   

        for (int i = 0;i < meuArray.length; i++){

           meuArray[i] = i + 1;
        }
      for (int i = 0; i < meuArray.length; i++) {
            // Imprimim la posició i el valor corresponent.
            System.out.println("Posició [" + i + "]: " + meuArray[i]);

    }
}
}