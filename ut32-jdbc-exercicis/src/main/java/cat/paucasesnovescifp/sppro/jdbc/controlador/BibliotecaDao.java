package cat.paucasesnovescifp.sppro.jdbc.controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import cat.paucasesnovescifp.sppro.jdbc.auxiliars.JDBCException;

/**
 * Exercici: 2
 * 
 * Al paquet controlador crea la clase BibliotecaDao amb un atribut String per a
 * la url de la connexió i un objecte Properties per a les propietats user i
 * password.
 * 
 * @author Donovan Perello
 * 
 * 
 *         1Crea un constructor amb paràmetres per a les dues dades, els getters
 *         i els setters.
 * 
 *         2Ha de ser impossible assignar com a url un null o una cadena buida i
 *         com a propietats un null o un objecte sense cap propietat. Si voleu
 *         afinar més tampoc hauríeu d'acceptar un objecte Properties que no
 *         tenguin les propietats per a l'usuari i la contrasenya.
 * 
 *         3Aquesta classe no pot mostrar res per pantalla, ni tan sols les
 *         excepcions.
 * 
 */
public class BibliotecaDao {
    private String url;
    private Properties uP;

    public BibliotecaDao(String url, Properties propiedades) throws JDBCException {
        setUrl(url);
        setuP(propiedades);
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) throws JDBCException {
        if (url == null || url.trim().isEmpty()) {
            throw new JDBCException("La URL de conexión no puede ser nula ni estar vacía.");
        }
        this.url = url;
    }

    public Properties getuP() {
        return uP;
    }

    public void setuP(Properties uP) throws JDBCException {
        if (url == null || url.isEmpty()) {
            throw new JDBCException(
                    "El objeto Properties debe contener obligatoriamente las propiedades 'user' y 'password'");
        }
        this.uP = uP;
    }

    /**
     * Exercici: 4
     * 
     * Crea un mètode a la classe BibliotecaDao que torni totes els departaments que
     * hi ha a la base de dades. Ho pot fer com a una llista de String. A la classe
     * ProvesJDBC mostra els departaments que torna el mètode anterior.
     * 
     * @author Donovan Perello
     */

    public List<String> departamentsBiblio() throws JDBCException {
        List<String> departamentos = new ArrayList<>();
        String sql = "SELECT DEPARTAMENT FROM DEPARTAMENTS";
        try (Connection con = DriverManager.getConnection(url, uP);
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(sql);) {
            while (rs.next()) {

                departamentos.add(rs.getString("DEPARTAMENT"));
            }

        } catch (SQLException e) {

            throw new JDBCException("Error de base de datos: " + e.getMessage());
        }
        return departamentos;
    }

    /**
     * Exercici: 5
     * 
     * Crea un mètode a la classe BibliotecaDao que rebi com a paràmetre el valor
     * d'un departament i l’insereixi a la base de dades. Si hi ha cap errada ha de
     * llençar una excepció. Crida’l des del main.
     * 
     * @author Donovan Perello
     */

    public int insertarDepartament(String departament) throws JDBCException {

        String sql = "INSERT INTO DEPARTAMENTS (DEPARTAMENT) VALUES ('" + departament + "')";
        try (
                Connection con = DriverManager.getConnection(url, uP);
                Statement st = con.createStatement();

        ) {
            int filesAfectades = st.executeUpdate(sql);

            return filesAfectades;

        } catch (SQLException e) {

            throw new JDBCException("Error de base de datos: " + e.getMessage());
        }

    }

    /**
     * Exercici: 6
     * 
     * Crea un mètode a la classe BibliotecaDao que rebi com a paràmetre el valor
     * d'un departament i l’esborri de la base de dades. Procura que sigui una que
     * no activi cap cascade. Si hi ha cap errada ha de llençar una excepció.
     * Crida’l des del main passant-li algun dels departaments que has insertat
     * provant l’exercici anterior.
     * 
     * @author Donovan Perello
     */

    public int borrarDepartament(String departament) throws JDBCException {

        String sql = "DELETE FROM DEPARTAMENTS WHERE DEPARTAMENT = '" + departament + "'";
        try (
                Connection con = DriverManager.getConnection(url, uP);
                Statement st = con.createStatement();

        ) {
            int filesAfectades = st.executeUpdate(sql);

            return filesAfectades;

        } catch (SQLException e) {

            throw new JDBCException("Error de base de datos: " + e.getMessage());
        }

    }

    /**
     * Exercici: 7
     * 
     * Crea un mètode a la classe BibliotecaDao que rebi com a paràmetre el valor
     * d'un departament i torni els títols de tots els llibres que contenguin aquest
     * valor com a clau forana. Utilitza un Statement. Prova'l desde ProvesJDBC.
     * 
     * @author Donovan Perello
     */

    public List<String> llibresDepartament(String departament) throws JDBCException {
        List<String> libros = new ArrayList<>();
        String sql = "SELECT TITOL FROM LLIBRES WHERE FK_DEPARTAMENT = '" + departament + "'";
        try (Connection con = DriverManager.getConnection(url, uP);
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(sql);) {
            while (rs.next()) {

                libros.add(rs.getString("TITOL"));
            }

        } catch (SQLException e) {

            throw new JDBCException("Error de base de datos: " + e.getMessage());
        }
        return libros;
    }

}
