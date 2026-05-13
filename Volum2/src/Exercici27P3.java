/*
 * 

Mostra les lletres de l'alfabet i al costat indica si es tracta d'una vocal o d'una consonant. En farem tres versions:

    Amb un if per a cada vocal if() else if....

    Amb un sol if() else

    Amb un switchI amb un case per a cada vocal. Recorda posar break a cada case

Nota: Les variables de tipus char que necessitau per aquest exercici es poden incrementar i decrementar com si fossin un int. Per exemple:

            char lletra='A';

            lletra++;

            System.out.println(lletra);

            // Mostrarà per pantalla B 
 * 
 * @Author Donovan
 */


void main (){
    
char lletra ='A';

for(;lletra <= 'Z'; lletra++){

    switch (lletra) {
        case 'A':{
            IO.println("A = vocal");
        break;
        }
        case 'E':{
            IO.println("E = vocal");
        break;
        }
        case 'I':{
            IO.println("I = vocal");
        break;
        }
        case 'O':{
            IO.println("O = vocal");
        break;
        }
        case 'U':{
            IO.println("U = vocal");
        break;
        }

        default:
        IO.println(lletra + " = consonant");
            break;
    }

}





}