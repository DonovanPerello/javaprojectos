import java.util.ArrayList;
import java.util.Collections;
public class Herencia {

    public static void main(String[] args) {
        ArrayList<String> cadenes = new ArrayList<>();

        cadenes.add("Zebra");
        cadenes.add("Elephant");
        cadenes.add("Giraffe");

        Collections.sort(cadenes);
        for (String cadena : cadenes) {
            System.out.println(cadena);
        }
    }
    
}
