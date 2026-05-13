/*Comprova si un nombre és primer o no utilitzant un for i un booleà.
 * 
 * 
 * @Author Donovan
 */

void main(){

boolean primo;
int num = 54; 
int contador=0;
int i;

    for ( i=1 ;i <= num; i++){

        if (num % i == 0) {

            contador = contador  +1;
        
        }   
}
    if (contador == 2){

            primo = true;
    } else {
            primo = false;
        }

    if ( primo == true) {
        IO.println(num + " es un numero primo");
        } else {
            IO.println(num + " NO es un numero primo");
    }
}


