package cat.paucasesnovescifp.familia;
/**Al main de Principal creau una objecte de la classe Net. Quins missatges surten? En quin ordre? Perquè?
 *  Posa un println explicant-ho. */
public class Principal {

    public static void main(String[] args) {
        Net net = new Net();

        IO.println("Primero aparece el mensaje del padre, luego del hijo y por ultimo del nieto");
        IO.println("Porque el programa necesita primero construir las clases de las que hereda ya que el compilador inserta automaticamente el comando super()");
         /**
          * A Principal crea un mètode que rebi com a paràmetre un objecte Pare i que mostri un missatge absurd. Cridau-lo passant-li com a paràmetre l'objecte Net que heu creat abans. 
          * És possible? Perquè?
          * 
          *     Es posible si usamos static en el metodo, esto es debido al polimorfisme 
          */
     IO.println("------------SEPARACION------------------");

        mensajeAbsurdo(net);
    IO.println("------------SEPARACION------------------");
        IO.println("");
    }  
    
    public static void  mensajeAbsurdo(Pare pare){
        /**
         * Substitueix el contingut del mètode anterior de forma que ara mostri el resultat de getClass() del paràmetre. Quina classe mostra?
         *  Perquè? Posa un println explicant-ho.
         */
        IO.println(pare.getClass());
    }
    

}
