package recursivitat;

public class Exercici33 {

    void main (){

        IO.println(fibonacci(10));
    }

    public int fibonacci(int n) {

    
    IO.println("-> Càlcul de F(" + n + ")");

   
    if (n == 0) {
        IO.println("<- F(0) retorna 0 (Cas Base)");
        return 0;
    } else if (n == 1) {
        IO.println("<- F(1) retorna 1 (Cas Base)");
        return 1;
    } else {
        
        int a = fibonacci(n - 1); 
        int b = fibonacci(n - 2); 
        
        int resultat = a + b;
        
       
        IO.println(">> F(" + n + ") = F(" + (n-1) + ") [" + a + "] + F(" + (n-2) + ") [" + b + "] = " + resultat);
        
        return resultat;
    }
}
    
}
