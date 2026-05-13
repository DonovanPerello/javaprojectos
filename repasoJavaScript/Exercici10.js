let Frase = prompt("Di una frase");

console.log(Frase + " tiene " + Contador(Frase) + " vocales");

function Contador(texto) {
    let contador = 0;
    
    let textoMinusculas = texto.toLowerCase(); 

    for (let i = 0; i < textoMinusculas.length; i++) {
        let letra = textoMinusculas[i];
        
      
        if (letra === "a" || letra === "e" || letra === "i" || letra === "o" || letra === "u") {
            contador++;
        }
    }
    return contador;
}