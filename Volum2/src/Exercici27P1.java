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

    

    if (lletra == 'A') {
        IO.println("A = Vocal");
          
    }else if (lletra == 'E') {
        IO.println("E = Vocal");
        
    }else if (lletra == 'I') {
        IO.println("I = Vocal");
     
    }else if (lletra == 'O') {
        IO.println("O = Vocal");
       
    }else if (lletra == 'U') {
        IO.println("U = Vocal");
     
    } else {
        IO.println(lletra + " = Consonant");
    }

}





}