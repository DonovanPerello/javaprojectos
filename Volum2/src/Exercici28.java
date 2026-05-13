/*Al programa anterior elimina els break del switch. 
Que passa? Torna'l a escriure de forma que amb el mínim de codi obtinguem el resultat correcte. 

@Author Donovan
*/
void main (){
    
char lletra ='A';


  IO.println("---------------SWITCH SIN BRAKE --------------");
for(;lletra <= 'Z'; lletra++){

    switch (lletra) {
        case 'A':{
            IO.println("A = vocal");
      
        }
        case 'E':{
            IO.println("E = vocal");
      
        }
        case 'I':{
            IO.println("I = vocal");
      
        }
        case 'O':{
            IO.println("O = vocal");
       
        }
        case 'U':{
            IO.println("U = vocal");

        }

        default:
        IO.println(lletra + " = consonant");

    }

}

  IO.println("Cunado le quitamos el brake lo que hace es convertirse en una cadena que ejecuta los siguientes casos posteriores, es decir que no se para hasta hacer los demas casos. ");
}