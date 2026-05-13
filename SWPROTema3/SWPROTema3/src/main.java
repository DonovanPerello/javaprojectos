
public class main {

    public static void main() {
        Televisor lg; //Declaramos la variable de tipo televisor
        lg = new Televisor();//Cream l'objecte

        lg.incrementaVolum();

        Televisor Samsung = new Televisor(8,32);

        Samsung.setCanal(25);

        IO.println(Samsung.getCanal());
        IO.println(lg.getCanal());

        
        
    }


}
