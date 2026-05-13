package exercicis;

/* 

Crea un fitxer amb un mètode que rebi un sencer i torni si és parell o no. Aquest mètode no ha de mostrar res per pantalla. Quin tipus de dades hauria de tornar aquest mètode?

Crea un altre mètode que torni un sencer llegit del teclat. Utilitza'ls de manera coherent des del main i informa a l'usuari del resultat.

@Author Donovan
*/


import java.util.Scanner;

public class Exercici4 {

    void main (){

        boolean esParell = paroImpar(valor());

        IO.println("Ha de tornar un valor de tipo boolean");

        if(esParell == true){

            IO.println( "Es parell y a sortit " + esParell);
        } else{

            IO.println("Es impar y a sortit " + esParell);
        }

    }
    

    public boolean paroImpar(int num){

    if (num % 2 == 0){

        return true;

    } else {

        return false;
    }
    }

    
    public int valor (){

        Scanner lector = new Scanner(System.in); 
        
        System.out.println("Escriu un numero  ");
        int num = lector.nextInt(); 
        lector.close();
        
        return num; 
    }

    
}
