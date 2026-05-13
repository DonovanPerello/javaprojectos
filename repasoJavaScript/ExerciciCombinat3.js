/*Escriu una funció que rebi un string i un número, i retorni el string repetit aquell número de vegades.
Utilitza un bucle per construir el resultat. */


let texto= "Prueba de string repetido";
let numero= 3;
function RetornRepetit( texto, numero){

    for(i = 1; i<= numero; i++){

        console.log((i) + " "+ texto)

    }
}


console.log(RetornRepetit(texto, numero));