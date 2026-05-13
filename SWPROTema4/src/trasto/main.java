
package trasto;

 // Crea una classe amb main i dins del main comprova que tens accés als getters i setters de l'atribut de classe sense crear cap objecte, 
 // directament amb la classe.

public class main {

    void main(){

        //IO.println(Trasto.getClasse()); 


      // Dins del main crea tres objectes Trasto. Utilitza el setter per modificar el valor de l’atribut de classe des d'un dels objectes.
      //  Utilitza el getter des d'un altre dels objectes per comprovar que realment comparteixen l'atribut.
      
        Trasto ropa = new Trasto("Camiseta");

        Trasto tecnologia = new Trasto("Movil");

        Trasto animals = new Trasto("Gato");


       ropa.setClasse(1);

        if (animals.getClasse() == 1){

            IO.println("Se comparten");

        } else {
            IO.println("No funciona");}

            // Se comparten el valor gracias al static de la variable classe, 
            // ya que eso hace que classe sea de la clase trasto, no de cada objeto.

    }

}
