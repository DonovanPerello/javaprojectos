//Crea un programa que converteixi un string a majúscules i després compti quantes vegades apareix una
//lletra específica utilitzant un bucle.




function upperTo(paraula, letra){

    let contador = 0;

const letraMayus = letra.toUpperCase();

const palabraMayus = paraula.toUpperCase();

for (const letraBuscar of palabraMayus){

    if( letraBuscar === letraMayus){

        contador ++;

    }

    
}
return contador;
}
const paraula = "palabradeprueba"
let resultado = upperTo(paraula,"a")


console.log(resultado );