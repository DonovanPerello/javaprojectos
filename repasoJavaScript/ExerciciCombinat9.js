//Crea un programa que utilitzi un bucle for per imprimir els números del 1 al 20 i determinar si cada
//número és primer o no.

const numero = 7;

function numeroPrimo(numero){


    for ( let i = 2; i < numero; i++){

        if (numero <= 1) return false;
        if (numero === 2 ){return true;}

        if(numero % i === 0 ){

            return false;
        } 

    }

    


}