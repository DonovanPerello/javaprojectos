//Alertas


//alert("Hola soy Donovan");

//Variables
let nombre = "Donvan Perello"
let mida = 180;
//Constantes
const altura = 187;

//mostrar en consola
console.log(nombre);
console.log(altura);




//Concatenación

let concatenacion = nombre + " " + altura;

//Seleccionar elementos de la pagina 
let datos = document.querySelector("#datos");

datos.innerHTML = `
    <h1> Soy la caja de datos </h1>
    <h2> Mi nombre es: ${concatenacion}</h2>
    
    `;

    //Condiciones

if(mida >= 180){
    datos.innerHTML += "<h1>Eres una persona alta</h1>"
}