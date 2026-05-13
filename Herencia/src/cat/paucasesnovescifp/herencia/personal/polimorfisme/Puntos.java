package cat.paucasesnovescifp.herencia.personal.polimorfisme;
/**
 * 
 * @author Donovan
 * 
 * Crea una classe que representi un punt 2D. Haurà de guardar les coordenades X i Y d'aquest punt. 
 * El punt s'inicialitzarà amb el constructor i una vegada creat no es podrà modificar.
 */
public class Puntos {

    private int x;
    private int y;

    
    
    public Puntos(int x, int y){

        this.x = x;
        this.y = y;

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


}
