/*Donat un sencer que representa el valor numèric d'una nota, 
mostra la qualificació corresponent en paraules, 
per exemple Insuficient, Suficient, Notable i Excel·lent. Utilitza if. 

@Author Donovan

*/

void main(){
    int nota = 8;

    if ( nota < 5) {

        IO.println("Insuficient");

    } else if (nota == 5) {

        IO.println("Suficient");

    } else if (nota == 6) {

        IO.println("Bé");

    } else if (nota > 6 && nota < 9)   {

        IO.println( "Notable");

    } else if (nota >= 9 && nota <= 10) {
        IO.println( "Exel.lent");
    }

    }
