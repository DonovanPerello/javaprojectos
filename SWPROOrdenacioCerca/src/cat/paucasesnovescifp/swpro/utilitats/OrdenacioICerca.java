/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.paucasesnovescifp.swpro.utilitats;

import java.util.ArrayList;

/**
 *
 * @author joan
 * 
 * Crea el paquet utilitats i copia a aquest paquet la classe OrdenacioICerca creada al tema 3.
 */
public abstract class OrdenacioICerca {

    public static void bimbolla(int[] vector) {
        for (int i = 2; i <= vector.length; i++) {
            for (int j = 0; j <= vector.length - i; j++) {

                if (vector[j] > vector[j + 1]) {
                    int aux = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = aux;
                }
            }
        }
    }
//Sobrecarrega  el mètode d'ordenació per bimbolla de manera que rebi com a paràmetre un array de Comparable i l'ordeni correctament.
    public static void bimbolla(ArrayList <Comparable> array) {

        for (int i = 2; i <= array.size(); i++) {
            for (int j = 0; j <= array.size() - i; j++) {

                if (array.get(j).compareTo(array.get(j + 1) ) > 0) {
                    Comparable aux = array.get(j);
                    array.set(j, array.get(j + 1));
                    array.set(j+1, aux);             
                }
            }
        }    
    }

    public static void insertSort(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            int index = vector[i];
            int j = i - 1;
            while ((j >= 0) && vector[j] > index) {
                vector[j + 1] = vector[j];
                j--;
            }
            vector[j + 1] = index;
        }
    }


    public static void rapid(int[] vector, int esquerra, int dreta) {
        int i = esquerra;
        int j = dreta;
        int vPivot = vector[(i + j) / 2]; //Posició del mig de l'array
        do {
            //Mentre el valor de la casella sigui menor que el pivot avançam casella
            while (vector[i] < vPivot) {
                i++;
            }
            //Mentre el valor de la casella sigui major que el pivot retrocedim casella
            while (vector[j] > vPivot) {
                j--;
            }
            //Si no s'han creuat i i j intercanviam els valors
            if (i <= j) {
                if (i != j) {
                    int aux = vector[i];
                    vector[i] = vector[j];
                    vector[j] = aux;
                }
                //Avançam i i j
                i++;
                j--;
            }

        } while (i < j); //Mentre no es creuin i i j

        //Si j no ha arribat a l'inici  aplica l'algorisme a la part esquerra de l'array.
        if (esquerra < j) {
            rapid(vector, esquerra, j);
        }
        //Si i no ha arribat al final aplica l'algorisme a la part dreta de l'array.
        if (i < dreta) {
            rapid(vector, i, dreta);
        }
    }


    public static int cercaBinaria(int[] vector, int cercat) {
        int inici = 0;
        int fi = vector.length - 1;
        boolean trobat = false;
        int mid = -1;
        while (!trobat && inici <= fi) {
            mid = (inici + fi) / 2;
            if (vector[mid] == cercat) {
                trobat = true;
            } else if (vector[mid] > cercat) {
                fi = mid - 1;
            } else {
                inici = mid + 1;
            }
        }
        if (!trobat) {
            return -1;
        } else {
            return mid;
        }
    }

    public static int cercaBinaria2(int[] vector, int cercat) {
        int inici = 0;
        int fi = vector.length - 1;
        boolean trobat = false;
        int mid = -1;
        int comptador = 0;
        while (!trobat && inici <= fi) {
            mid = (inici + fi) / 2;
            if (vector[mid] == cercat) {
                trobat = true;
            } else if (vector[mid] > cercat) {
                fi = mid - 1;
            } else {
                inici = mid + 1;
            }
            comptador++;
        }
        System.out.println("Nombre de comparacions: " + comptador);
        if (!trobat) {
            return -1;
        } else {
            return mid;
        }
    }

}
