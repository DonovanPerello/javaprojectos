package recursivitat;
/*

A un fitxer nou, escriu un mètode que calculi de forma recursiva la suma dels n primers enters, és a dir, la suma dels 5 primers enters és 5 més la suma dels 4 primers enters.

La suma dels 1 primers enters és 1.
 */
public class Exercici28 {
    
    void main(){

       IO.println(SumaN(2)); 


    }

    public int SumaN(int n){
       
       int resultado = 0;
        if (n > 0)  {

          resultado = n + SumaN(n-1); 
          return resultado;  
        } else

          return resultado;
        
        
   

        

    }
}
