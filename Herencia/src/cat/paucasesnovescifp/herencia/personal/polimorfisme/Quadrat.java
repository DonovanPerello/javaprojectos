package cat.paucasesnovescifp.herencia.personal.polimorfisme;

import java.util.ArrayList;

/** 
 * @autor Donovan
 * Crea una classe Quadrat. 
 * Els objectes d'aquesta classe sempre tendran quatre vèrtexs. 
 * A més, per calcular l'àrea necessitam conèixer la longitud del costat, 
 * que s'ha de passar com a argument al constructor. 
 * Àrea=costat x costat
 */
public final class Quadrat extends Poligono{

    private int longitudCostat;

    public Quadrat(ArrayList <Puntos> listaPuntos, int longitudCostat){

        super(listaPuntos);

        this.longitudCostat = longitudCostat;

    }

    @Override
    public double calcularArea() {

        return (double) longitudCostat * longitudCostat;

        
        
    }


    
}
