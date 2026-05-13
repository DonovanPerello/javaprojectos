package cat.paucasesnovescifp.herencia.personal;

import java.time.LocalDate;

/**
 * 
 * @author Donovna
 * Crea al paquet cat.paucasesnovescifp.herencia.personal una subclasse de Persona anomenada Alumne.
 *  Afegeix els atributs cicle i curs.
 *  Programa els constructors de cada classe de manera que tenguin paràmetres per tots els seus atributs.
 *  No pot quedar cap constructor sense paràmetres.
 */
public class Alumne extends Persona {

    private String cicle;
    private String curs;


    public Alumne(String cicle, String curs, String nom, LocalDate dataNaixament, String dni){
        super(nom, dataNaixament, dni);
        this.cicle=cicle;
        this.curs = curs;
      
       

    }



}
