package institut;

public class Modul {

     private String nom;
     private int horesSetmanals;
     private static int contador;
     private int id;

     
     public Modul (String nom, int horesSetmanals) {
        this.nom = nom;
        this.horesSetmanals = horesSetmanals;
        this.id = contador;
        contador++;
     }
     public Modul(){
        nom=null;

        horesSetmanals=0;
        
     }


     public String getNom() {
         return nom;
     }


     public int getHoresSetmanals() {
         return horesSetmanals;
     }


     public void setNom(String nom) {
         this.nom = nom;
     }


     public void setHoresSetmanals(int horesSetmanals) {
         this.horesSetmanals = horesSetmanals;
     }


     @Override
     public String toString() {
        return "Modul [nom=" + nom + ", horesSetmanals=" + horesSetmanals + "]";
     }

    
}