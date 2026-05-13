package recursivitat;
/*
    Crea un fiter nou i comprova que l'exemple de sobrecàrrega dels apunts, el que té unes quantes versions de saluda, funciona.

*/
public class Exercici26 {

    void main(){

        saluda();
        saluda("Tomeu");
        saluda("Doni", "Francis");
        saluda("Toni", 18);
    
    }

  void saluda() {
System.out.println("Hola!");
}
void saluda(String nom) {
System.out.println("Hola " + nom + " !");
}
void saluda(String nom1, String nom2) {
System.out.println("Hola " + nom1 + " i " + nom2 + " !");
}
void saluda(String nom, int dies) {
System.out.println("Hola " + nom + " ! Feia " + dies + " que no et veia!");
}



    
}
