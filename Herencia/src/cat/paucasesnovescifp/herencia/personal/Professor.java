package cat.paucasesnovescifp.herencia.personal;
import java.time.LocalDate;
/**
 * @author Donovan
 * Crea al paquet cat.paucasesnovescifp.herencia.personal una subclasse de Persona anomenada Professor.
 *  Afegeix els atributs especialitat i anyOposició.
 * 
 * Programa els constructors de cada classe de manera que tenguin paràmetres per tots els seus atributs.
 *  No pot quedar cap constructor sense paràmetres.
 */

public class Professor  extends Persona{
    private String especialitat;
    private LocalDate anyOposicio;

    
    public Professor(String nom, LocalDate dataNaixament, String dni, String especialitat, LocalDate anyOposicio) {
        super(nom, dataNaixament, dni);
        this.especialitat = especialitat;
        this.anyOposicio = anyOposicio;
    }

    

}
