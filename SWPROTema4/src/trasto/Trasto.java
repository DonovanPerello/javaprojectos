package trasto;
//Crea una altre paquet amb una classe anomenada Trasto: 
//@Author Donovan
public class Trasto {

    // Afegeix un atribut de classe de tipus int, amb els corresponents getter i setter.
    // Ha de tenir un atribut de tipus String per el nom del trasto
    private String nom;
    private static int classe;

    // Crea el constructor amb paràmetre per el nom i el getter.

    public Trasto(String nom){

        this.nom = nom;

    }

    public String getTrasto(){
        return nom;
    }

// Afegeix un atribut de classe de tipus int, amb els corresponents getter i setter.
    public  int getClasse() {
        return this.classe;
    }

   
    public void setClasse(int valor) {
        classe = valor; 
    }
    // Programa el toString de manera que mostri els dos atributs.
    @Override
    public String toString() {
        return "Trasto [nom=" + nom + ", classe=" + classe + "]";
    }

    

    // Dins del main crea tres objectes Trasto. Utilitza el setter per modificar el valor de l’atribut de classe des d'un dels objectes. Utilitza el getter des d'un altre dels objectes per comprovar que realment comparteixen l'atribut.

    

}
