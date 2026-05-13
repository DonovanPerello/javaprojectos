package cat.paucasesnovescifp.herencia.personal.polimorfisme;

import java.util.ArrayList;
/**
 * 
 * @author Donovan
 * 
 * Crea una classe que representi un polígon en 2D. Està format per una sèrie de punts.

    Hem de saber quants vèrtexs té el polígon i quins són. Es suposa que ens el donaran seguits, 
    de manera que podrem pintar el polígon unint les parelles de vèrtexs consecutius. 
    De moment es suposa que ens donaran el nombre adequat de punts. 
    El constructor rebrà els punts i no es podran modificar.
    
    El polígon tendrà un mètode pinta, que de moment només mostrarà els punts per pantalla.
    
    El polígon tendrà un mètode per calcular la seva àrea. De moment només el definirem, no el programarem (Mira als apunts com es crea un mètode abstracte).

 */
public abstract class Poligono {

    private ArrayList <Puntos> listaPuntos;
    private int numVertices;

    public Poligono(ArrayList <Puntos> listaPuntos){

        this.listaPuntos = listaPuntos;
        

        numVertices = listaPuntos.size();
    }

    public abstract double calcularArea();

    public void pinta(){


        for(Puntos p : listaPuntos){

            System.out.println("Punto: (" + p.getX() + ", " + p.getY() + ")" + "Numero de vertices: " + numVertices);

        }
    }



    

}
