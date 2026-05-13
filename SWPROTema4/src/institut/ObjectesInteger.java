package institut;
import java.lang.Math;

//Crea una classe amb main i defineix dos objectes Integer. Comprova que pots operar amb ells com si fossin dades primitives gràcies al boxing i unboxing.
public class ObjectesInteger {

    public static void main(String[] args) {
        
        int a = Integer.parseInt("8");
        int b = Integer.parseInt("2");

        IO.println(a+b);
        //Al main de la classe anterior utilitza mètodes de la classe Math per 
        // calcular una potència, 
        double potencia = Math.pow(a, b);
        // un logaritme, 
        double logaritmo = Math.log(10);

        // un sinus i 

        double seno = Math.sin(Math.PI / 2); 

        // un cosinus i mostra'ls per pantalla.
        double coseno = Math.cos(0);

        IO.println("Potencia: " + potencia +  "\nlogaritmo: " + logaritmo + "\nseno: "+ seno + "\ncoseno: " + coseno) ;
    

// Explora l'api de l'string i utilitza els seus mètodes per, dins del main de la classe anterior:
        String texto = "Texto de prueba , para ver las funcionalidades, de la api de String";

//     passar un string a majúscules.

        IO.println(texto.toUpperCase());
//     Extreure una part d'una cadena de text.
        IO.println(texto.substring(23));
//     Dividir una cadena de text en funció d'un caràcter, per exemple la cadena "Joan, Toni, Miquel" dividir-la per la coma.
        String[] partes = texto.split(",");
        for (String parte : partes) {
        System.out.println(parte);}
//     Treure el primer caràcter de la cadena.
            IO.println(texto.charAt(1));



    }

}
