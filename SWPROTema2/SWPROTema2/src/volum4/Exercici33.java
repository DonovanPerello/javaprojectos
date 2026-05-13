package volum4;

public class Exercici33 {

    
    void main(){

        int Max = 200;
        int Min = 100; 

        int [] aleatori = new int [10]; 

        
        for (int i=0; i < aleatori.length ; i++ ){
            
            int random = Min + (int)(Math.random() * (Max - Min + 1)); 
            aleatori[i] = random; 
        }

        for (int i=0; i < aleatori.length ; i++ ){
            
            IO.println("El número aleatorio en la posición " + i + " es: " + aleatori[i]);
        }
    }
}
