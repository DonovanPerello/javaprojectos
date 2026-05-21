package cat.paucasesnovescifp.sppro.jdbc;

import java.util.Properties;

import cat.paucasesnovescifp.sppro.jdbc.auxiliars.*;
import cat.paucasesnovescifp.sppro.jdbc.controlador.*;

/**
 * Exercici: 3
 * 
 * A la classe ProvesJDBC crea un objecte de la classe BibliotecaDao configurat
 * de manera que es pugui connectar a la biblioteca.
 * 
 * @author Donovan Perello
 */
public class ProvesJDBC {

    public static void main(String[] args) {
        Properties credenciales = new Properties();
        credenciales.setProperty("user", "usuari");
        credenciales.setProperty("password", "seCret_24");
        BibliotecaDao biblio = new BibliotecaDao("jdbc:mysql://daw.paucasesnovescifp.cat:3306/biblioteca",
                credenciales);
    }

}
