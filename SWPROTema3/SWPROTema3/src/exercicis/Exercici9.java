package exercicis;
import utilitats.UtilitatsConsola;
/*

    Realitza un programa que permeti executar les següents accions:

        Trobar el major de dos sencers.

        Trobar el major de tres sencers.

        Mostrar la relació entre dos sencers a<b o a=b o a> b

    Per a cada una d'elles has de crear un mètode que faci els càlculs necessaris.

    El main s'encarregarà de

            Mostrar a l'usuari les opcions possibles i demanar-li quina vol executar.

            Llegir l'opció que ha pitjat l'usuari.

            Per a cada opció llegir les dades necessàries.

            Cridar al mètode adequat passant-li les dades necessàries com a paràmetres.

            Aquest cicle es repetirà fins que l'usuari vulgui acabar el programa.

    @Author Donovan
*/


public class Exercici9 {

    void main(){

        boolean cicle = true;

        do {
        int opcio = UtilitatsConsola.llegirSencer("Tria una opcio que vulguis \n1.Trobar el major de dos sencers. \n2.Trobar el major de tres sencers.\n3. Mostrar la relació entre dos sencers a<b o a=b o a> b\n4. Finalitzar el programa"); 
            if (opcio == 1){
                    IO.println("Trobar el major de dos sencers.");
                    int a = UtilitatsConsola.llegirSencer("Tria un numero: ");
                    int b = UtilitatsConsola.llegirSencer("Tria un numero: ");
                    major2Sencer(a, b);
                    } else if (opcio == 2){
                        IO.println("Trobar el major de tres sencers.");
                        int a = UtilitatsConsola.llegirSencer("Tria un numero: ");
                        int b = UtilitatsConsola.llegirSencer("Tria un numero: ");
                        int c = UtilitatsConsola.llegirSencer("Tria un numero: ");
                        major3Sencer(a, b, c);
                    } else if (opcio == 3){
                        IO.println("Mostrar la relació entre dos sencers a<b o a=b o a> b");
                        int a = UtilitatsConsola.llegirSencer("Tria un numero: ");
                        int b = UtilitatsConsola.llegirSencer("Tria un numero: ");
                        relacio(a, b );
                    } else if (opcio == 4){
                        IO.println("Has finalitzat el programa :)");
                        cicle= false;
                        
                    }else {
                        IO.println("Opció Incorrecta.");
                    }
        } while (cicle == true);
        

    }

    public void major2Sencer (int a, int b){

        if (a > b){
            IO.println(a + "  es el mes gran");
            
        } else if (b > a ){

            IO.println(b+ " es el mes gran");
        } else{
            
            IO.println("Son iguals");
        }
    }

    public void major3Sencer (int a, int b, int c){

        if (a >= b && a >= c){  

            IO.println(a + "  es el mes gran");
            
        } else if (b >= a && b >= c ){

            IO.println(b + " es el mes gran");
        } else {
            IO.println(c + " es el mes gran");
        }

    }

    public void relacio (int a, int b){

        if(a > b){

            IO.println(a + " es mes gran que " + b);
        } else if (b > a){
            IO.println(a + " es mes petit que " + b);
        } else if(a == b){
            IO.println(a + " es igual" + b);
        }

    }
}
