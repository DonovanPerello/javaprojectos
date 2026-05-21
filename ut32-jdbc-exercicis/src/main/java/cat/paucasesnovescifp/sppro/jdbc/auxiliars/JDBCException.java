package cat.paucasesnovescifp.sppro.jdbc.auxiliars;

/**
 * Exercici: 1
 * 
 * Al paquet auxiliars crea una excepció, JDBCException, amb el constructor buid
 * i un altre amb un paràmetre per el missatge.
 * 
 * @author Donovan Perello
 */
public class JDBCException extends Exception {

    public JDBCException() {
    };

    public JDBCException(String mensaje) {

        super(mensaje);

    }

}
