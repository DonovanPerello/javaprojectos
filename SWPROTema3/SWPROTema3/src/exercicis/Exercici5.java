package exercicis;

/* 

Crea un fitxer amb un mètode que rebi tres valors amb decimals i torni la mitjana d'aquests valors. Aquest mètode no ha de mostrar res per pantalla.

Crea un altre mètode que torni un double llegit del teclat. Utilitza'ls de manera coherent des del main i informa a l'usuari del resultat.

@Author Donovan
*/

import java.util.Scanner;

public class Exercici5 {


    void main(){


        IO.println("Escribe el primer numero");

        double a = valor();
        IO.println("Escribe el seguno numero");

        double b = valor();

        IO.println("Escribe el tercer numero");

        double c = valor();

        IO.println("La media es de " + mitjana(a, b, c));


    }

    public double mitjana (double a, double b, double c){

        double resultado = (a + b + c)/3; 

        return resultado;
    }

    public double valor (){

        Scanner lector = new Scanner(System.in); 
        
        double n1 = lector.nextDouble(); 

        return n1;
    

    }

    
}
