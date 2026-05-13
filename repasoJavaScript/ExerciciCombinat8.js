//Defineix una funció que calcule el factorial d'un número utilitzant bucles i condicionals. Imprimeix el
//resultat per a un número donat.

function calcularFactorial(n) {
    if (n < 0) return "No existe";
    if (n === 0 || n === 1) return 1;

    let resultado = 1;

    for (let i = n; i > 1; i--) {
        resultado *= i;
    }

    return resultado;
}

const numero = 5;
console.log(calcularFactorial(numero));