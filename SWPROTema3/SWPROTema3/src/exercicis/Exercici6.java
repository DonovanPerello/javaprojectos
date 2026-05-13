package exercicis;

/*Crea un fitxer amb un mètode amb tres paràmetres de tipus sencer (anomenats a, b i c), que els ordeni de manera que al final el valor més petit estigui dins la a i el major dins la c.

Al main crea i inicialitza tres variables de tipus sencer x, y, z i mostra-les per pantalla. */

public class Exercici6 {
         void main() {
        
        int x = 10;
        int y = 2;
        int z = 5;

        IO.println("--- EN EL MAIN  ---");
        IO.println("x: " + x);
        IO.println("y: " + y);
        IO.println("z: " + z);
        IO.println(); 

   
        ordenar(x, y, z);
    }

   
    public  void ordenar(int a, int b, int c) {
        int aux; 
        
        if (a > b) {
            aux = a;
            a = b;
            b = aux;
        }

       
        if (b > c) {
            aux = b;
            b = c;
            c = aux;
        }

       
        if (a > b) {
            aux = a;
            a = b;
            b = aux;
        }

        
        IO.println("--- DENTRO DEL MÉTODO ---");
        IO.println("Menor a: " + a);
        IO.println("Medio b: " + b);
        IO.println("Mayor c: " + c);
    }
}
