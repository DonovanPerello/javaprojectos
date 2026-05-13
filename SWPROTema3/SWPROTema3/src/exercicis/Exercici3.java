package exercicis;

/*Crea un fitxer amb un mètode que rebi un sencer i mostri per pantalla si el nombre es parell o no. Crea un altre mètode que torni un sencer llegit del teclat. 
Utilitza'ls de manera coherent des del main. 

Author Donovan
*/

import java.util.Scanner; 

public class Exercici3 {


    void main (){

        paroImpar(valor());
    }
    

    public void paroImpar(int num){

    if (num % 2 == 0){

        IO.println( num + " Es par");

    } else {

        IO.println(num + " Es impar");
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







