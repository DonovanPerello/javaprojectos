let numero1 = prompt("Di una calificación del 1 al 100: ");
let numero = parseInt(numero1);



    switch (true) {
  case (numero >= 1 && numero <= 20):
    console.log("A");
    break;
  case (numero >= 21 && numero <= 40):
    console.log("B");
    break;
  case (numero >= 41 && numero <= 60):
    console.log("C");
    break;
  case (numero >= 61 && numero <= 80):
    console.log("D");
    break;
  case (numero >= 81 && numero <= 100):
    console.log("E");
    break;
  default:
    console.log("F");

    }


