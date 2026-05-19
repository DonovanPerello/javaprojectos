package cat.paucasesnovescifp.proves;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

import cat.paucasesnovescifp.auxiliars.TipusPlat;
import cat.paucasesnovescifp.dades.Preferencia;
import cat.paucasesnovescifp.dades.Preferencia2;
import cat.paucasesnovescifp.dades.Preferencia3;

/**
 * Exercici: 3
 * Dins del paquet proves crea una classe executable anomenada Proves.
 * Cada vegada que creeu o modifiqueu un mètode d'aquesta classe
 * executau-lo des del main.
 * 
 * @author Donovan Perello
 */

public class Proves {

    public static void main(String[] args) {

        Proves pruebas = new Proves();
        /**
         * pruebas.provaPilaStack();
         * pruebas.provaPilaArrayDeque();
         * pruebas.provaCoaArrayDeque();
         */
        // pruebas.provesHashSet();
        // pruebas.provesHashMap();
        // pruebas.provesEnumeracio();
        pruebas.provaCollections();
    }

    /**
     * Exercici: 2
     * 
     * A la classe Proves crea el mètode provaPilaStack que utilitzi una pila de
     * Preferencia utilitzant els mètodes de la classe Stack. Nota: No implementa
     * poll.
     * 
     * @author Donovan Perello
     */
    public static void provaPilaStack() {
        Stack<String> pila = new Stack<>();

        pila.push("1 elemento");
        pila.push("2 elemento");
        pila.push("3 elemento");

        String cima = pila.peek();
        System.out.println("La cima:" + cima);

        String elementoEliminado = pila.pop();

        System.out.println("pop: " + elementoEliminado);

        System.out.println("Pila despues del pop:" + pila);

    }

    /**
     * Exercici: 3
     * 
     * A la classe Proves crea el mètode provaPilaArrayDeque que utilitzi una pila
     * de Preferencia utilitzant els mètodes de la classe ArrayDeque.
     * 
     * @author Donovan Perello
     */
    public void provaPilaArrayDeque() {
        ArrayDeque<String> pila = new ArrayDeque<>();

        pila.push("1 elemento");
        pila.push("2 elemento");
        pila.push("3 elemento");

        System.out.println("pila: " + pila);

        String cima = pila.peek();
        System.out.println("Cima: " + cima);

        String elementoEliminado = pila.pop();
        System.out.println("pop: " + elementoEliminado);

        System.out.println("Pila despues del pop: " + pila);
    }

    /**
     * Exercici: 4
     * 
     * A la classe Proves crea el mètode provaCoaArrayDeque que utilitzi una coa
     * utilitzant els mètodes de la classe ArrayDeque.
     * 
     * @author Donovan Perello
     */
    public void provaCoaArrayDeque() {
        ArrayDeque<String> coa = new ArrayDeque<>();

        coa.add("1 elemento");
        coa.add("2 elemento");
        coa.push("3 elemento");

        System.out.println("coa: " + coa);

        String frente = coa.peek();
        System.out.println("Frente: " + frente);

        String elementoEliminado = coa.poll();
        System.out.println("poll: " + elementoEliminado);

        System.out.println("Coa despues del poll: " + coa);

    }

    /**
     * Exercici: 5
     * 
     * A la classe Proves crea el mètode provesHashSet. Crea un HashSet de tipus
     * Preferencia:
     * 
     * Crea una preferència amb els valors 1, “Paella”. Afegeix-lo al conjunt.
     * 
     * Crea un altre objecte Preferencia amb les mateixes dades. L'ha inserit? És el
     * que esperàvem? Per què? Explica-ho amb un println.
     * 
     * Crea un altre objecte Preferencia amb valors diferents i afegeix-lo.
     * 
     * Comprova si una determinada Preferencia ja és al conjunt. Mostra el resultat
     * per pantalla.
     * 
     * (Opcional) Mostra per pantalla tot el conjunt.
     * 
     * Mostra per pantalla el nombre d'elements del conjunt.
     * 
     * Elimina del conjunt el primer objecte que has creat. Digues si ha anat bé.
     * 
     * Comprova si el conjunt és buit o no . Mostra el resultat per pantalla.
     * 
     * @author Donovan Perello
     */
    public void provesHashSet() {
        HashSet<Preferencia> conjunto = new HashSet<>();

        Preferencia p1 = new Preferencia(1, "Paella");
        conjunto.add(p1);

        Preferencia p2 = new Preferencia(1, "Paella");
        boolean insertadoDuplicado = conjunto.add(p2);

        System.out.println(insertadoDuplicado);
        System.out.println(" El resultado no es el mismo que antes. ");

        Preferencia p3 = new Preferencia(2, "Fideua");
        conjunto.add(p3);

        boolean existe = conjunto.contains(p3);
        System.out.println(existe);

        System.out.println("Número de elementos: " + conjunto.size());

        boolean eliminado = conjunto.remove(p1);
        System.out.println(eliminado);

        boolean estaVacio = conjunto.isEmpty();
        System.out.println(estaVacio);
    }

    /**
     * Exercici: 6.2
     * 
     * A la classe Proves copia el mètode de l'exercici 5 amb el nom de
     * provesHashSet2. Canvia totes les declaracions d'objecte Preferencia per
     * Preferencia2. El resultat és el mateix? Per què? Explica-ho amb un println.
     * 
     * 
     * @author Donovan Perello
     */
    public void provesHashSet2() {
        HashSet<Preferencia2> conjunto = new HashSet<>();

        Preferencia2 p1 = new Preferencia2(1, "Paella");
        conjunto.add(p1);

        Preferencia2 p2 = new Preferencia2(1, "Paella");
        boolean insertadoDuplicado = conjunto.add(p2);

        System.out.println(insertadoDuplicado);
        System.out.println(
                "El resultado no es el mismo que antes. Ahora da FALSE porque al haber programado 'equals' y 'hashCode', el HashSet detecta que ambos objetos tienen los mismos datos y deniega la inserción del duplicado.");

        Preferencia2 p3 = new Preferencia2(2, "Fideua");
        conjunto.add(p3);

        boolean existe = conjunto.contains(p3);
        System.out.println(existe);

        System.out.println("Número de elementos: " + conjunto.size());

        boolean eliminado = conjunto.remove(p1);
        System.out.println(eliminado);

        boolean estaVacio = conjunto.isEmpty();
        System.out.println(estaVacio);
    }

    /**
     * Exercici: 7
     * 
     * A la classe Proves crea el mètode provesHashMap. Crea un HashMap de tipus
     * Preferencia2, on la clau del mapa sigui el nom del plat:
     * 
     * Afegeix al mapa tres preferències.
     * 
     * Crea una preferència amb un plat que ja existeixi i un ordre diferent. Mostra
     * el que torna el put.
     * 
     * Comprova si una clau és al mapa o no.
     * 
     * Comprova si un valor és al mapa o no.
     * 
     * Recupera un objecte a partir de la seva clau. Mostra el resultat per
     * pantalla.
     * 
     * Mostra per pantalla tot el mapa.
     * 
     * Mostra per pantalla el nombre d'elements del mapa.
     * 
     * Elimina una preferència del mapa. Digues si ha anat bé.
     * 
     * Comprova si el mapa és buid o no . Mostra el resultat per pantalla.
     * 
     * @author Donovan Perello
     */

    public void provesHashMap() {

        HashMap<String, Preferencia2> mapa = new HashMap<>();

        Preferencia2 p1 = new Preferencia2(1, "Paella");
        Preferencia2 p2 = new Preferencia2(2, "Fideua");
        Preferencia2 p3 = new Preferencia2(3, "Arroz al horno");

        mapa.put(p1.getNombre(), p1);
        mapa.put(p2.getNombre(), p2);
        mapa.put(p3.getNombre(), p3);

        Preferencia2 pDuplicada = new Preferencia2(4, "Paella");
        Preferencia2 valorAnterior = mapa.put(pDuplicada.getNombre(), pDuplicada);
        System.out.println(valorAnterior);

        boolean existeClave = mapa.containsKey("Fideua");
        System.out.println(existeClave);

        boolean existeValor = mapa.containsValue(p3);
        System.out.println(existeValor);

        Preferencia2 recuperado = mapa.get("Arroz al horno");
        System.out.println("Objeto recuperado: " + recuperado);

        System.out.println("Contenido completo del mapa: " + mapa);

        System.out.println("Número de elementos en el mapa: " + mapa.size());

        Preferencia2 eliminado = mapa.remove("Fideua");
        System.out.println((eliminado != null));

        boolean estaVacio = mapa.isEmpty();
        System.out.println(estaVacio);
    }

    /**
     * Exercici: 9
     * 
     * A la classe Proves crea el mètode provesEnumeració
     * 
     * Utlitza un for per mostrar tots els valors possibles de l’enumeració.
     * 
     * Comprova que no es pot assignar a l’atribut de la preferència un valor que no
     * sigui un dels declarats a l’enumeració.
     * 
     * Crea una llista amb al manco dues preferències de cada tipus. Mostra per
     * pantalla només les preferències d’entrants.
     * 
     * Utilitza un for per recórrer els distints tipus de plat i per a cada un
     * mostra totes les preferències d’aquest tipus.
     * 
     * @author Donovan Perello
     */
    public void provesEnumeracio() {

        for (TipusPlat tipo : TipusPlat.values()) {
            System.out.println(tipo);
        }

        System.out.println(
                "No se puede asignar un valor fuera del enum porque el compilador de Java lo impide directamente");

        ArrayList<Preferencia3> lista = new ArrayList<>();

        lista.add(new Preferencia3(1, "Croquetas", TipusPlat.ENTRANTS));
        lista.add(new Preferencia3(2, "Nachos", TipusPlat.ENTRANTS));

        lista.add(new Preferencia3(3, "Paella", TipusPlat.PRINCIPAL));
        lista.add(new Preferencia3(4, "Hamburguesa", TipusPlat.PRINCIPAL));

        lista.add(new Preferencia3(5, "Entrecot", TipusPlat.SEGON));
        lista.add(new Preferencia3(6, "Bacalao", TipusPlat.SEGON));

        lista.add(new Preferencia3(7, "Coulant", TipusPlat.POSTRE));
        lista.add(new Preferencia3(8, "Tarta de queso", TipusPlat.POSTRE));

        System.out.println("--- Solo Entrantes ---");
        for (Preferencia3 p : lista) {
            if (p.getTipus() == TipusPlat.ENTRANTS) {
                System.out.println(p);
            }
        }

        System.out.println("--- Clasificación por Tipos ---");
        for (TipusPlat tipo : TipusPlat.values()) {
            System.out.println("Platos de tipo " + tipo + ":");
            for (Preferencia3 p : lista) {
                if (p.getTipus() == tipo) {
                    System.out.println("  - " + p);
                }
            }
        }
    }

    /**
     * Exercici: 10
     * 
     * Crea un ArrayList de String desordenat. Mostra'l per pantalla. Crea el mètode
     * provaCollections a la classe Proves. Utilitza els mètodes de la classe
     * Collections per:
     * 
     * Mesclar-la
     * 
     * Obtenir el màxim i el mínim
     * 
     * Ordenar-la al revés.
     * 
     * Ordenar-la correctament.
     * 
     * Trobar la posició que ocupa un String concret.
     * 
     * Mostra per pantalla l'ArrayList després de cada operació
     * 
     * @author Donovan Perello
     */
    public void provaCollections() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Zanahoria");
        lista.add("Manzana");
        lista.add("Platano");
        lista.add("Cereza");
        lista.add("Albaricoque");

        System.out.println("desordenada: " + lista);

        Collections.shuffle(lista);
        System.out.println("Lista mezclada : " + lista);

        String maximo = Collections.max(lista);
        String minimo = Collections.min(lista);
        System.out.println("El maximo es: " + maximo);
        System.out.println("El mínimo es: " + minimo);

        Collections.sort(lista);
        Collections.reverse(lista);
        System.out.println("Lista ordenada al reves: " + lista);

        Collections.sort(lista);
        System.out.println("Lista ordenada normal: " + lista);

        int posicion = Collections.binarySearch(lista, "Cereza");
        System.out.println("'Cereza' esta en la posición: " + posicion);
    }
}
