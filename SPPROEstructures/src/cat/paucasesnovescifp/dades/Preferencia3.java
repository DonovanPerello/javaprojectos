package cat.paucasesnovescifp.dades;

/** Exercici: 8
 * 
 * Volem classificar els plats de les preferències en les següents categories: Entrants, Principal, Segon i Postre.

    Al paquet utilitats crea l’enumeració TipusPlat que permeti aquesta classificació.

    Copia la classe Preferencia2 amb el nom Preferencia3. Afegeix un atribut del tipus de l’enumeració, amb el seu getter i modifica el constructor de manera que també l’inicialitzi.

    Torna a generar l’equals, el hashcode i el toString de manera que el tenguin en compte

 * @author Donovan Perello
 */
import cat.paucasesnovescifp.auxiliars.TipusPlat;

public class Preferencia3 {
    private int id;
    private String nombre;
    private TipusPlat tipus;

    public Preferencia3(int id, String nombre, TipusPlat tipus) {
        this.id = id;
        this.nombre = nombre;
        this.tipus = tipus;
    }

    public TipusPlat getTipus() {
        return tipus;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + ((tipus == null) ? 0 : tipus.hashCode());
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
        Preferencia3 other = (Preferencia3) obj;
        if (id != other.id)
            return false;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (tipus != other.tipus)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Preferencia3 [id=" + id + ", nombre=" + nombre + ", tipus=" + tipus + "]";
    }

}
