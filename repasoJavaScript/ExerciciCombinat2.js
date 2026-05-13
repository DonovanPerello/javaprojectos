/*Defineix un objecte cotxe amb propietats com marca, model i any. A continuació, utilitza un condicional
per verificar si el cotxe té més de 10 anys i mostra un missatge en conseqüència.*/

const coche = {

    marca: "Opel",
    modelo:"Corsa",
    Any: 2014
};


if((coche.Any +10) != 2026){

    console.log("Tu coche tiene mas de 10 años");
}