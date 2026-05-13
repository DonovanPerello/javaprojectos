package recursivitat;
/*El factorial d'un natural es pot definir de forma recursiva com n!=n*(n-1)! 



Amb el cas especial 1!=1. Crea un fitxer amb un mètode que donat un paràmetre n torni (return) el factorial de n. 


Realitza el càlcul de forma recursiva. 

@Author Donovan
*/
public class Exercici29 {

    void main (){

        IO.println(factorialN(5));
    }

    public int factorialN(int n){
       
       int resultado = 0;
        if (n <= 1)  {

          
          return 1;  
        } else
            resultado = n * factorialN(n-1); 
            return resultado;
        
        
   

        

    }

    
}
