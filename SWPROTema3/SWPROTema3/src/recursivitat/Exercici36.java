package recursivitat;
/*

(Opcional) Escriviu fitxer amb un un mètode recursiu que ens digui si una cadena de caràcters és simètrica.

El mètode charAt(index) de String ens torna el caràcter que ocupa la posició index dins la cadena

String s="Hola";

IO.println(s.charAt(1); // Imprimeix o

 */
public class Exercici36 {

    void main(){
        IO.println(simetric("ANNA"));
    }
    

    public boolean simetric(String caracter){
        
        boolean simetric = false;
       char resultat = caracter.charAt( 0 );
       char  final1 = caracter.charAt(caracter.length() - 1);
       String contador=caracter.substring(1, caracter.length() - 1);

       if ( resultat != final1 ){
        
        return simetric;
        
       } else if(contador.charAt(0) != contador.charAt(contador.length()-1)){
            return simetric;
            
       } else{

        return true;
       }

    }
}
