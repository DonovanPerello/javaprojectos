package cat.paucasesnoves.cifp.institut;

import cat.paucasesnoves.cifp.excepcions.*;

/**
 * 
 * 
 * 
 * Blinda les classes Modul i CicleArrayList de manera que no es puguin posar
 * valors
 * sense sentit als seus atributs: noms amb longitud menor de 3 caràcters,
 * hores o alumnes negatius o exagerats, mòduls nuls, ...
 * Heu d’impedir aquests valors als setters, però també als constructors.
 */
public class Modul {
    private String nom;
    private int horesSetmanals;

    public Modul(String nom, int horesSetmanals) throws InstitutException {

        setHoresSetmanals(horesSetmanals);
        setNom(nom);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) throws InstitutException {
        if (nom == null || nom.length() < 3) {

            throw new InstitutException("Format incorrecte. El nom ha de ser mayor a 3 caracters");

        }
        this.nom = nom;
    }

    public int getHoresSetmanals() {
        return horesSetmanals;
    }

    public void setHoresSetmanals(int horesSetmanals) throws InstitutException {

        if (horesSetmanals < 0 || horesSetmanals > 12) {

            throw new InstitutException("Format incorrecte. Les hores han de ser mayor a 0 y menor de 12 ");

        }

        this.horesSetmanals = horesSetmanals;

    }

    @Override
    public String toString() {
        return "Modul{" +
                "nom='" + nom + '\'' +
                ", horesSetmanals=" + horesSetmanals +
                '}';
    }
}
