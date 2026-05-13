package cat.paucasesnoves.cifp.institut;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * 
 * 
 * Blinda les classes Modul i CicleArrayList de manera que no es puguin posar valors 
 * sense sentit als seus atributs: noms amb longitud menor de 3 caràcters, 
 * hores o alumnes negatius o exagerats, mòduls nuls, ... 
 * Heu d’impedir aquests valors als setters, però també als constructors.
 */

import java.util.ArrayList;
import cat.paucasesnoves.cifp.excepcions.*;

/**
 *
 * @author joan
 * 
 */
public class CicleArrayList {

    private String nom;
    private int alumnes;
    private ArrayList<Modul> moduls;
    private int maximModuls;

    public ArrayList<Modul> getModuls() {
        return moduls;
    }

    public void setModuls(ArrayList<Modul> moduls) throws InstitutException {

        if (moduls == null) {
            throw new InstitutException("La llista de mòduls no pot ser nul·la.");
        }
        if (moduls.size() < 1 || moduls.size() > maximModuls) {
            throw new InstitutException("Nombre de mòduls incorrecte. Ha de ser entre 1 i " + maximModuls);
        }
        this.moduls = moduls;

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

    public int getAlumnes() {
        return alumnes;
    }

    public void setAlumnes(int alumnes) throws InstitutException {

        if (alumnes < 1) {
            throw new InstitutException("Minim 1 alumne ");
        }
        this.alumnes = alumnes;
    }

    public CicleArrayList(String nom, int alumnes, int maximModuls) throws InstitutException {
        setAlumnes(alumnes);
        setNom(nom);

        if (maximModuls < 1 || maximModuls > 10) {

            throw new InstitutException("El maxim de moduls a de ser mayor a 0 y menor de 10 ");

        }
        this.maximModuls = maximModuls;
        this.moduls = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Cicle{" + "nom=" + nom + ", alumnes=" + alumnes + '}';
    }

    /**
     * Afegeix el mòdul que li arriba com a paràmetre a la llista si no hem
     * arribat al màxim de mòduls que pot tenir el cicle.
     *
     * @param nou El mòdul que afegirem
     * @return true si l'ha pogut afegir, false si el cicle ja té el màxim de
     *         mòduls permesos.
     */
    public boolean afegirModul(Modul nou) throws InstitutException {

        if (nou == null) {
            throw new InstitutException("No es pot afegir un mòdul nul.");
        }

        if (cercarModul(nou.getNom()) != null) {
            throw new InstitutException("El mòdul " + nou.getNom() + " ja existeix al cicle.");
        }

        if (moduls.size() < maximModuls) {
            moduls.add(nou);
            return true;
        }
        return false;
    }

    /**
     * Torna el mòdul que té per nom el paràmetre que rep.
     *
     * @param nom EL nom del mòdul que cercam
     * @return El mòdul que hem trobat, o null si no el trobam
     */
    private Modul cercarModul(String nom) {
        for (Modul m : moduls) {
            if (m.getNom().equalsIgnoreCase(nom)) {
                return m;
            }
        }
        return null;
    }

    /**
     * Elimina el mòdul que té per nom el paràmetre que rep. Utilitza el mètode
     * intern.
     *
     * @param nom El nom del mòdul que volem eliminar.
     * @return true si l'ha trobat i l'ha pogut eliminar, false en cas contrari.
     */
    public boolean eliminarModul(String nom) throws InstitutException {
        Modul eliminat = cercarModul(nom);
        if (eliminat == null) {
            throw new InstitutException("No s'ha pogut eliminar: El mòdul '" + nom + "' no existeix.");
        }
        moduls.remove(eliminat);
        return true;
    }

    /**
     * Elimina el mòdul que té per nom el paràmetre que rep.
     *
     * @param nom El nom del mòdul que volem eliminar.
     * @return true si l'ha trobat i l'ha pogut eliminar, false en cas contrari.
     */

    public boolean eliminarModul2(String nom) throws InstitutException {
        for (int i = 0; i < moduls.size(); i++) {
            if (moduls.get(i).getNom().equalsIgnoreCase(nom)) {
                moduls.remove(i);
                return true;
            }
        }
        throw new InstitutException("No s'ha pogut eliminar: El mòdul '" + nom + "' no existeix en aquest cicle.");
    }

    /**
     * Torna el mòdul que té per nom el paràmetre que ha rebut.
     * 
     * @param nom
     * @return
     */
    public Modul tornarModul(String nom) {
        return cercarModul(nom);
    }
}
