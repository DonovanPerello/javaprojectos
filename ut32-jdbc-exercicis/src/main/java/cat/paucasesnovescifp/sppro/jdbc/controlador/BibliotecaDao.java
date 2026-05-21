package cat.paucasesnovescifp.sppro.jdbc.controlador;

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

    public BibliotecaDao(String url, Properties propiedades) {
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

}
