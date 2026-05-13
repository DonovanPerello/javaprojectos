package cat.paucasesnovescifp.herencia.personal.polimorfisme;

import java.util.ArrayList;
/**
 * 
 * @author Donovan
 * 
 * Crea una classe amb main.

    

 */


public class main {

    public static void main(String[] args) {

        ArrayList <Puntos> listaPuntosTriangle;
        listaPuntosTriangle = new ArrayList<>();
        ArrayList <Puntos> listaPuntosQuadrat;
        listaPuntosQuadrat = new ArrayList<>();

        Puntos punto = new Puntos(2, 4);
        Puntos punto2 = new Puntos(4, 8);
        Puntos punto3 = new Puntos(1, 3);
        Puntos punto4 = new Puntos(8, 7);

        listaPuntosQuadrat.add(punto);
        listaPuntosQuadrat.add(punto2);
        listaPuntosQuadrat.add(punto3);
        listaPuntosQuadrat.add(punto4);

        listaPuntosTriangle.add(punto);
        listaPuntosTriangle.add(punto4);
        listaPuntosTriangle.add(punto3);
/**
 * Al main crea un ArrayList que admeti tant triangles com quadrats.
    Al main crea un triangle i un quadrat i afegeix-los a la llista.
 */

        Quadrat q = new Quadrat(listaPuntosQuadrat, 5);
        Triangle t = new Triangle(3, 6, listaPuntosTriangle);

        ArrayList <Poligono> llistaPoligons;
        llistaPoligons = new ArrayList<>();

        llistaPoligons.add(t);
        llistaPoligons.add(q);

        //Crida el mètode creat anteriorment passant-li per paràmetre el contingut de la llista, d'element en element.

       for(Poligono p :  llistaPoligons){
        IO.println("//////////////////////////////////////////////////////////////////");
        mostrarDadesYArea(p);

       }

        
        



    }
//Crea un mètode que rebi com a paràmetre un Poligon2D. Aquest mètode ha de mostrar les dades del polígon i la seva àrea.
    public static void mostrarDadesYArea(Poligono p){

         p.pinta();
       System.out.println("Área del polígono: " + p.calcularArea());
    }
}