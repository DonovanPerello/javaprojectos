package cat.paucasesnovescifp.sppro.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import cat.paucasesnovescifp.sppro.jdbc.auxiliars.JDBCException;
import cat.paucasesnovescifp.sppro.jdbc.controlador.BibliotecaDao;

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

        Properties credencials = new Properties();
        credencials.setProperty("user", "usuari");
        credencials.setProperty("password", "seCret_24");
        String urlDb = "jdbc:mysql://daw.paucasesnovescifp.cat:3306/biblioteca";

        try {

            BibliotecaDao biblio = new BibliotecaDao(urlDb, credencials);
            List<String> departamentos = biblio.departamentsBiblio();

            System.out.println("--- Llista de Departaments ---");
            for (String dep : departamentos) {
                System.out.println("- " + dep);
            }
            System.out.println("Insertar Departament: " + biblio.insertarDepartament("PruebaDepartament"));
        } catch (JDBCException e) {

            System.out.println("Error en la configuració de les dades: " + e.getMessage());
        }

    }
}
