/*Donat un nombre natural n, mostrar els n primers nombres de la successió de Fibonnacci: 0, 1, 1, 2, 3, 5, 8, ... 
En aquesta successió, els dos primers termes són 0 i 1. Es següents termes s'obtenen sumant els dos anteriors, 
és a dir, el tercer terme s'obté sumant el primer i el segon; el quart sumant el segon i el tercer, ....
 * 
 * 
 * 
 * @Author Donovan
 * 
 */

void main () {
        
        int n = 15; 

        
        int a = 0;
        int b = 1;
        IO.println("Els " + n + " primers termes de Fibonacci són:");

        for (int i = 1; i <= n; i++) {
           
            IO.println(a);

            int següent = a + b; 
            
            a = b; 
            b = següent; 
        }
    }