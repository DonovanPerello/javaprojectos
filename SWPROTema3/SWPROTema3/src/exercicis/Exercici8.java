package exercicis;

/*

Crea un fiter amb main. Copia dins aquest fitxer els mètodes dels exercicis 3, 4 i 5 que miren si un nombre és parell o no i el que torna la mitjana. Els mètodes que llegeixen el teclat no els copiïs.

Des del main crida aquests mètodes utilitzant la classe UtilitatsConsola per llegir els valors demanats.
 */
import utilitats.UtilitatsConsola;

public class Exercici8 {


    void main (){

        int numero = UtilitatsConsola.llegirSencer("Escribe un numero: ");
        paroImpar(numero);

        double as= UtilitatsConsola.llegirDouble("Escribe un entero: ");
        double bs= UtilitatsConsola.llegirDouble("Escribe un entero: ");
        double cs= UtilitatsConsola.llegirDouble("Escribe un entero: ");

        IO.println("La media es de " + mitjana(as, bs, cs));
        

    }
    

    public void paroImpar(int num){

    if (num % 2 == 0){

        IO.println( num + " Es par");

    } else {

        IO.println(num + " Es impar");
    }

    }

        public double mitjana (double a, double b, double c){

        double resultado = (a + b + c)/3; 

        return resultado;
    }

}


