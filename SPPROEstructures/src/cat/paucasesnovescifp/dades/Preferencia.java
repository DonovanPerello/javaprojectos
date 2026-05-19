package cat.paucasesnovescifp.dades;

/**
 * Exercici: 1
 * 
 * Al paquet dades crea la classe Preferencia per mantenir els plats preferits
 * de l'usuari:
 * Ha de tenir un atribut de tipus int anomenat ordre.
 * Ha de tenir un atribut de tipus String anomenat plat.
 * Ha de tenir un constructor amb paràmetres per els dos camps, els getters i el
 * toString.
 * 
 * @author Donovan Perello
 */

public class Preferencia {
    private int ordre;
    private String plat;

    public Preferencia(int ordre, String plat) {
        this.ordre = ordre;
        this.plat = plat;
    }

    public int getOrdre() {
        return ordre;
    }

    public String getPlat() {
        return plat;
    }

    @Override
    public String toString() {
        return "Preferencia [ordre=" + ordre + ", plat=" + plat + "]";
    }

}
