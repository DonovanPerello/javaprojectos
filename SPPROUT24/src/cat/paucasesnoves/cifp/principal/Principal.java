package cat.paucasesnoves.cifp.principal;

import cat.paucasesnoves.cifp.institut.*;
import cat.paucasesnoves.cifp.excepcions.*;

/**
 * 
 * @author Donovan
 * 
 *         Crea una classe amb main i comprova que les limitacions funcionen.
 *         El main no hauria de petar, és a dir, hauria d’acabar amb codi 0 i no
 *         mostrar per pantalla més que missatges personalitzats.
 * 
 * 
 * 
 *         A la classe amb main afegeix un mètode que demani a l’usuari per
 *         teclat totes les dades d’un Mòdul, el crei i el torni.
 *         Si hi ha qualque errada ha d’informar a l’usuari i li ha de donar
 *         l’oportunitat de tornar a entrar totes les dades del mòdul.
 *         Si no ho vol fer, el mètode ha de llançar una InstitutException amb
 *         el missatge que el mòdul no s’ha creat.
 */
public class Principal {

    public static void main(String[] args) {

        try {
            Modul m1 = new Modul("IA", 15);
        } catch (InstitutException e) {
            System.out.println("Prova 1 (Mòdul malament): " + e.getMessage());
        }

        try {
            CicleArrayList cicle = new CicleArrayList("DAW", 0, 5);
        } catch (InstitutException e) {
            System.out.println("Prova 2 (Cicle malament): " + e.getMessage());
        }

        try {
            CicleArrayList miCicle = new CicleArrayList("ASIX", 20, 2);
            Modul m1 = new Modul("Sistemes", 6);
            Modul m2 = new Modul("Sistemes", 4);

            miCicle.afegirModul(m1);
            System.out.println("S'ha afegit m1");

            miCicle.afegirModul(m2);

        } catch (InstitutException e) {
            System.out.println("Prova 3 (Duplicats): " + e.getMessage());
        }

        try {
            CicleArrayList miCicle = new CicleArrayList("DAW", 20, 5);
            miCicle.eliminarModul2("Base de Dades");
        } catch (InstitutException e) {
            System.out.println("Prova 4 (Eliminar inexistent): " + e.getMessage());
        }

        try {

            CicleArrayList cicle = new CicleArrayList("DAW", 25, 3);
            Modul m1 = new Modul("Programació", 8);

            cicle.afegirModul(m1);
            System.out.println("Mòdul afegit: " + m1.getNom());

            cicle.eliminarModul2("Angles");

        } catch (InstitutException e) {
            System.err.println("ERR INSTITUT: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("ERR GENÈRIC: " + e.getMessage());
        }
        /**
         * A la classe amb main afegeix un mètode que demani a l’usuari per
         * teclat totes les dades d’un Mòdul, el crei i el torni.
         * Si hi ha qualque errada ha d’informar a l’usuari i li ha de donar
         * l’oportunitat de tornar a entrar totes les dades del mòdul.
         * Si no ho vol fer, el mètode ha de llançar una InstitutException amb
         * el missatge que el mòdul no s’ha creat.
         */
        try {
            Modul modul = entradaModul();
        } catch (InstitutException e) {
            IO.println(e);
        }
    }

    public static Modul entradaModul() throws InstitutException {

        boolean respuestaUsuari = true;
        Modul modulCreat = null;

        while (respuestaUsuari == true) {

            try {
                String nom = IO.readln("Escriu el nom del modul: ");
                int horesSetmanals = Integer.parseInt(IO.readln("Escriu les hores setmanals del modul: "));
                modulCreat = new Modul(nom, horesSetmanals);
                return modulCreat;
            } catch (Exception e) {
                String respuesta = IO.readln("Ha ocurrit un error: " + e + "\n" + " Vols tornarlo a intentar? S/N : ");

                if (respuesta.equalsIgnoreCase("n")) {
                    respuestaUsuari = false;
                    throw new InstitutException("No se ha pogut crear el modul");
                }
            }

        }
        return modulCreat;
    };

}
