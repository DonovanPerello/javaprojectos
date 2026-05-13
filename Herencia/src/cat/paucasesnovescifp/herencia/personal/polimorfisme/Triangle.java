package cat.paucasesnovescifp.herencia.personal.polimorfisme;

import java.util.ArrayList;

/**
 * @author Donovan
 * 
 * Crea una classe Triangle. Els objectes d'aquesta classe sempre tendran tres vèrtexs. 
 * A més, per calcular l'àrea necessitam conèixer la base i l'altura. S'han de passar com a arguments al constructor. 
 */
public final class Triangle extends Poligono {

    private int base;
    private int altura;

    public Triangle( int base, int altura,ArrayList <Puntos> listaPuntos){

        super(listaPuntos);
        this.altura = altura;
        this.base = base;

    }

  
    @Override
    public double calcularArea() {

        return base * altura /2;
        
    }



    
}
