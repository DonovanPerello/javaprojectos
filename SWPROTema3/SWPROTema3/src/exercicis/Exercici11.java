package exercicis;

/*Escriu un mètode que pugui rebre qualsevol nombre de paraules i torni una cadena formada concatenant aquestes paraules. 

Prohibit utilitzar arrays com a paràmetre. 

@Author Donovan
*/
public class Exercici11 {

    void main(){

        IO.println(concatenar("Hola", "Como" ,"estas"));
    }
    
    public String concatenar(String... palabras){
        
        String resultado="";

        for(String i : palabras ){
            
            resultado = resultado + i;


        }

        return resultado;


    }
}
