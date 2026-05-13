package cat.paucasesnovescifp.herencia.personal;

import java.time.LocalDate;

/**
 * 
 * @author Donovan
 * Crea un paquet cat.paucasesnovescifp.herencia.personal. 
 * A dins crea una classe anomenada Persona, amb atributs, getters i setters per el nom, la data de naixement i el DNI.
 * 
 * Pots utilitzar directament els atributs de Persona dins les subclasses? 
 * Modifica-la si fa falta i comenta dins Persona els canvis que has fet.
 *      
 */

public class Persona {
    // He cambiado la visibilidad de los atributos a protected para que las subclases puedan acceder sin afectar a la seguridad.
    protected String nom;
    protected LocalDate dataNaixament;
    protected String dni;

    public Persona() {
        this.nom = null;
        this.dataNaixament = null;
        this.dni = null;
    }
    
    public Persona(String nom, LocalDate dataNaixament, String dni) {
        this.nom = nom;
        this.dataNaixament = dataNaixament;
        this.dni = dni;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public LocalDate getDataNaixament() {
        return dataNaixament;
    }
    public void setDataNaixament(LocalDate dataNaixament) {
        this.dataNaixament = dataNaixament;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }

    


}
