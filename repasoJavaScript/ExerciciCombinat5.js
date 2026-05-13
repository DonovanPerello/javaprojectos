/*Genera un número aleatori entre 1 i 10 utilitzant Math.random() i demana a l'usuari que endevini el
número. Utilitza condicionals per informar si la seva resposta és correcta o incorrecta.
 */

let aleatorio= parseInt(Math.random() * (5 - 1) + 1);

let usuarioNum=  parseInt(prompt("Escribe un numero del 1 al 5: "));

if(aleatorio == usuarioNum){

    console.log("Correcto")
}else{
    console.log("incorrecto, el numero era " + aleatorio)
}



