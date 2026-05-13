package institut;
/*Copia la classe Cicle amb el nou nom CicleArray.
 
@Author Donovan*/
public class CicleArray {

    //Afegeix un array d'objectes Modul com a atribut.
    //Crea un altre atribut numModuls que indiqui quants mòduls hem afegit al cicle. 
    // Inicialitza'l al constructor amb el valor adequat. 
    // Ha de tenir getter i setter?: Solo getter ya que el numModuls nos ayuda a determinar la cantidad de modulos que hay, y si pudiesen cambiar los atributos romperian el programa 

    private Modul[] llistaModul;
    private int numModuls;

    //Modifica el constructor per que rebi un paràmetre amb el nombre de mòduls que tendrà com a màxim el cicle. 
    // Dins el constructor inicialitza l'array.

    public CicleArray(int cantidadModuls) {
        
        this.llistaModul = new Modul[cantidadModuls];
        this.numModuls = 0;
    }

    public Modul[] getLlistaModul() {
        return llistaModul;
    }

    public int getNumModuls() {
        return numModuls;
    }
    //Afegeix un mètode afegirModul que rebi com a paràmetre un objecte de tipus modul. Ha d'afegir el mòdul a l'array. 
    // Torna true si l'ha pogut afegir i false si no. L'atribut numModuls ens pot servir per saber a quina posició insertar-lo.

    public boolean afegirModul(Modul modul){

        if(numModuls < llistaModul.length){
        llistaModul[numModuls] = modul;
        numModuls ++;
            return true;
        } else {
            return false;
        }
        

    }

    //Crea un mètode tornaModul que rebi com a paràmetre el nom d'un modul i torni el mòdul si es troba dins l'array de mòduls del cicle. 
    // Si no torna null.

    public Modul tornaModul( String nomModul){

       for(int i = 0; i < numModuls; i++){

        if(llistaModul[i].getNom().equalsIgnoreCase(nomModul) ){

            return llistaModul[i];
        } 

        
       }

       return null;
    }







}
