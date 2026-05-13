/* Comprova si un nombre és primer o no utilitzant un while.
 * 
 * 
 * @Author Donovan
 */
void main(){


int num = 14; 
int contador=0;
int i = 1;

    while (i <= num) {

        if (num % i == 0 ) {
            contador = contador +1;
        }
        i = i+ 1;
    }

    if (contador == 2) {
        IO.println(num + " es un numero primo");
        
    } else{
        IO.println(num + " NO es un numero primo");

    }
}

