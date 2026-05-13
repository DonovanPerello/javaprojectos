package utilitats;
/*

    Fins ara cada vegada que volem llegir un sencer o un double del teclat hem hagut de crear un mètode al mateix fitxer. Volem que sigui més fàcil reutilitzar el codi. Ho farem de la següent manera:

    Crea el paquet utilitats. Dins el paquet crea la classe UtilitatsConsola amb les següents característiques:

        No tendrà main.

        Tendra un mètode public static llegirSencer que tornarà un int. Tendrà un paràmetre de tipus String que serà el text que es mostrarà a l'usuari per que sàpiga quina dada es demana.

        Tendra un mètode public static llegirDouble que tornarà un double. Basau-vos en el mètode anterior.

        Tendra un mètode public static llegirCadena que tornarà un String. Tendrà un paràmetre també de tipus String que serà el text que es mostrarà a l'usuari per que sàpiga quina dada es demana.

    A partir d'ara utilitzau aquesta classe quan necessiteu llegir dades de teclat. Per fer-ho haureu de fer dues passes:

        Importar la classe al principi del fitxer.

    import utilitats.UtilitatsConsola;

        En voler utilitzar un dels mètodes heu de posar el nom de la classe abans del del mètode:

    int quantitatNotes = UtilitatsConsola.llegirSencer("Nombre de notes: ");

    @Author Donovan
 */

import java.util.Scanner;

public class UtilitatsConsola {

    
    public static int llegirSencer(String missatge) {
        Scanner lector = new Scanner(System.in);
        
        
        System.out.println(missatge);
        
       
        int valor = lector.nextInt();
        
       
        return valor;
    }

    
    public static double llegirDouble(String missatge) {
        Scanner lector = new Scanner(System.in);
        
        System.out.println(missatge);
        
       
        double valor = lector.nextDouble();
        
        return valor;
    }

   
    public static String llegirCadena(String missatge) {
        Scanner lector = new Scanner(System.in);
        
        System.out.println(missatge);
        
      
        String text = lector.nextLine();
        
        return text;
    }

    public static void mostraArrays(boolean[] array){

            for (int i = 0;i< array.length; i++){

                IO.println(array[i]);


            }


    }
    public static void mostraArrays(double[] array){

            for (int i = 0;i< array.length; i++){

                IO.println(array[i]);


            }


    }
    public static void mostraArrays(String[] array){
            for (int i = 0;i< array.length; i++){

                IO.println(array[i]);


            }
        
    }

    public static void OrdenaBimbolla(int[] a){
        for (int i= 2 ; i < a.length; i++){
            for(int j= 0; j < a.length - i ; j++){
                if(a[j]>a[j+1]){
                    int aux= a [j];
                    a[j] = a[j + 1];
                    a[j + 1] = aux;
                }
            }
            
        }
    }
    public static void InsertSort(int[] a){
        for (int i= 2 ; i < a.length; i++){
            for(int j= 0; j < a.length - i ; j++){
                if(a[j]>a[j+1]){
                    int aux= a [j];
                    a[j] = a[j + 1];
                    a[j + 1] = aux;
                }
            }
            
        }
    }
    
}

