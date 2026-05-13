package recursivitat;
/*Escriu fitxer amb un mètode que calculi el terme n-essim de la sèrie de Fibonacci de forma recursiva. Des del main crida aquest mètode per a mostrar els 10 primers termes de la successió. La definició de la successió és la següent:

@Author Donovan
*/
public class Exercici32 {

    void main (){

        IO.println(fibonacci(11));
    }

    public int fibonacci(int n){
       
       int resultado = 0;
        if (n <= 1)  {
          return n;  

        } else{
            resultado = fibonacci(n-1) + fibonacci(n-2); 
            return resultado;
        }        

    }
   
}