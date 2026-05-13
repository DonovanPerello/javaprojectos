package cat.paucasesnovescifp.swpro.dades;

import cat.paucasesnovescifp.swpro.utilitats.TipusPlat;


public class Preferencia4 implements Comparable<Preferencia4>  {
    private int ordre;
    private String nom;
    private TipusPlat tipus;

    public Preferencia4(int ordre, String nom, TipusPlat tipus) {
        this.ordre = ordre;
        this.nom = nom;
        this.tipus = tipus;
    }

    public int getOrdre() {
        return ordre;
    }

    public String getNom() {
        return nom;
    }

    public TipusPlat getTipus() {
        return tipus;
    }

    @Override
    public String toString() {
        return "Preferencia3{" +
                "ordre=" + ordre +
                ", nom='" + nom + '\'' +
                ", tipus=" + tipus +
                '}';
    }

    @Override

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Preferencia4)) return false;

        Preferencia4 that = (Preferencia4) o;

        if (ordre != that.ordre) return false;
        if (!nom.equals(that.nom)) return false;
        return tipus == that.tipus;
    }

    @Override
    public int hashCode() {
        int result = ordre;
        result = 31 * result + nom.hashCode();
        result = 31 * result + tipus.hashCode();
        return result;
    }

    /**Crea el paquet dades i dins ell copia la classe Preferencia3 amb el nom Preferencia4. Copia també TipusPlat. 
     * Modifica-la de manera que implementi la interfície Comparable<Preferencia4>. El criteri d'ordenació serà l'atribut ordre. */
    @Override

    public int compareTo(Preferencia4 otraPreferencia){

        return ordre - otraPreferencia.ordre;
    }


}
