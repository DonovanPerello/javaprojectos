/*Crea un programa que donat un nombre sencer mostri per pantalla tots els seus divisors, 
per exemple, per a 6 mostraria 1, 2, 3, 6.
 * 
 * 
 * @Author
 * 
 */

void main() {
   int div = 184;
   int residu;
  
   for (int i=1 ;i <= div ; i++  ){

        if (div % i == 0 ){

            residu = i;

            IO.println(residu + " es divisor de " + div);

        }


   }
}