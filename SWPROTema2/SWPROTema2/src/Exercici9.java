/* Donats tres sencers mostra el valor màxim i el mínim. 
 * 
 * @Author Donovan
*/
void main() {
    int a = 4;
    int b = 3;
    int c = 4;

    if (a >= b & a >= c) {
        IO.println("El número mayor es: " + a);
    } else if (b >= a && b >= c) {

        IO.println("El número mayor es: " + b);
    } else { 
      
        IO.println("El número mayor es: " + c);
    }

    if (a <= b && a <= c) {

        IO.println("El número menor es: " + a);
    } else if (b <= a && b <= c) {
   
        IO.println("El número menor es: " + b);
    } else {
        
        IO.println("El número menor es: " + c);
    }
}
