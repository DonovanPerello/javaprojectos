package cat.paucasesnovescifp.swpro.executable;

import cat.paucasesnovescifp.swpro.utilitats.*;
import cat.paucasesnovescifp.swpro.dades.Preferencia4;
/**
 * 
 * 
 * @author Donovan
 * Crea el paquet executable i dins ell una classe amb main. 
 * Comprova a l'API si la classe String implementa la interfície Comparable. 
 * Si és així crea un array d'strings i comprova que el mètode de l'exercici anterior els ordena.
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<Comparable> palabras = new ArrayList<>();

        palabras.add("Zebra");
        palabras.add("Pera");
        palabras.add("Manzana");
        palabras.add("Antílope");
        
         System.out.println(palabras);

        OrdenacioICerca.bimbolla(palabras);

        System.out.println(palabras);

    //A la classe amb main crea un array de Preferencia4 i comprova que els mètodes d'ordenació l'ordenen correctament. 
        ArrayList<Preferencia4> listaPreferencias = new ArrayList<>();
        listaPreferencias.add(new Preferencia4(3, "Postre", TipusPlat.POSTRE));
        listaPreferencias.add(new Preferencia4(1, "Sopa", TipusPlat.PRINCIPAL));
        listaPreferencias.add(new Preferencia4(2, "Filete", TipusPlat.SEGON));

    //l main comprova que el mètode Collections.sort ordena un ArrayList de Preferencia4 correctament.
        Collections.sort(listaPreferencias);
        for (Preferencia4 p : listaPreferencias) {
         System.out.println(p);
        }



    }

    
    
    

}
