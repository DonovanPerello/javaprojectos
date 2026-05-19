package cat.paucasesnovescifp.dades;

/**
 * Exercici: 6.1
 * 
 * Crea una còpia de la classe Preferencia amb el nom Preferencia2 (no es pot
 * fer una subclasse) i programa els mètodes hashCode i equals utilitzant
 * l’assistent de l'IDE. Utilitza tots els atributs.
 * 
 * @author Donovan Perello
 */

public class Preferencia2 {
    private int id;
    private String nombre;

    public Preferencia2(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Preferencia2 other = (Preferencia2) obj;
        if (id != other.id)
            return false;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        return true;
    }

}