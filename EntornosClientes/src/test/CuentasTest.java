package test;


import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import clientesCuentas.*;

import org.junit.jupiter.api.TestMethodOrder;

/**
 *
 * @author donovan
 */
@TestMethodOrder(OrderAnnotation.class)
@TestInstance(Lifecycle.PER_CLASS)
public class CuentasTest {

    private Cliente cliente1;
    private Cliente cliente2;
    private Cuenta cuenta1;
    private Cuenta cuenta2;

    @BeforeEach
    public void setUp() {
        cliente1 = new Cliente("Pepe", "Martínez", "C/ Estación 22", "Valencia", LocalDate.of(2000, 1, 1));
        cliente2 = new Cliente("Marta");
        cuenta1 = new Cuenta(111, 1000.0, cliente1);
        cuenta2 = new Cuenta(222, 0.0, cliente2);
    }

    @Test
    @Order(1)
    public void testClienteGetters() {
        assertEquals("Pepe", cliente1.getNombre());
        assertEquals("Martínez", cliente1.getApellidos());
        assertEquals("C/ Estación 22", cliente1.getDireccion());
        assertEquals("Valencia", cliente1.getLocalidad());
        assertEquals(LocalDate.of(2000, 1, 1), cliente1.getFechaDeNacimiento());
        
        assertEquals("Marta", cliente2.getNombre());
        assertNull(cliente2.getApellidos());
    }

    @Test
    @Order(2)
    public void testClienteSetters() {
        cliente2.setNombre("Lucía");
        cliente2.setApellidos("Gómez");
        cliente2.setDireccion("Avenida Central 1");
        cliente2.setLocalidad("Sevilla");
        cliente2.setFechaDeNacimiento(LocalDate.of(1995, 5, 10));

        assertEquals("Lucía", cliente2.getNombre());
        assertEquals("Gómez", cliente2.getApellidos());
        assertEquals("Avenida Central 1", cliente2.getDireccion());
        assertEquals("Sevilla", cliente2.getLocalidad());
        assertEquals(LocalDate.of(1995, 5, 10), cliente2.getFechaDeNacimiento());
    }

    @Test
    @Order(3)
    public void testClienteMetodosFormato() {
        assertEquals("Pepe Martínez", cliente1.nombreCompleto());
        assertEquals("C/ Estación 22, Valencia", cliente1.direccionCompleta());
        assertEquals("Cliente [nombre=Pepe]", cliente1.toString());
        
        assertEquals("Marta null", cliente2.nombreCompleto());
        assertEquals("null, null", cliente2.direccionCompleta());
    }

    @Test
    @Order(4)
    public void testCuentaGetters() {
        assertEquals(111, cuenta1.getNumeroCuenta());
        assertEquals(1000.0, cuenta1.getSaldo());
        assertEquals(cliente1, cuenta1.getTitular());
    }

    @Test
    @Order(5)
    public void testIngresoPositivo() {
        cuenta1.ingreso(500.0);
        assertEquals(1500.0, cuenta1.getSaldo());
        
        cuenta1.ingreso(0.01);
        assertEquals(1500.01, cuenta1.getSaldo());
    }

    @Test
    @Order(6)
    public void testIngresoNegativoYCero() {
        cuenta1.ingreso(-100.0);
        assertEquals(1000.0, cuenta1.getSaldo());

        cuenta1.ingreso(0.0);
        assertEquals(1000.0, cuenta1.getSaldo());
    }

    @Test
    @Order(7)
    public void testRetiroValido() {
        cuenta1.retiro(200.0);
        assertEquals(800.0, cuenta1.getSaldo());
        
        cuenta1.retiro(799.99);
        assertEquals(0.01, cuenta1.getSaldo(), 0.001);
    }

    @Test
    @Order(8)
    public void testRetiroTotal() {
        cuenta1.retiro(1000.0);
        assertEquals(0.0, cuenta1.getSaldo());
    }

    @Test
    @Order(9)
    public void testRetiroExcesivo() {
        cuenta1.retiro(1000.01);
        assertEquals(1000.0, cuenta1.getSaldo());

        cuenta1.retiro(5000.0);
        assertEquals(1000.0, cuenta1.getSaldo());
    }

    @Test
    @Order(10)
    public void testRetiroNegativoYCero() {
        cuenta1.retiro(-50.0);
        assertEquals(1000.0, cuenta1.getSaldo());

        cuenta1.retiro(0.0);
        assertEquals(1000.0, cuenta1.getSaldo());
    }

    @Test
    @Order(11)
    public void testCuentaSinSaldo() {
        cuenta2.retiro(10.0);
        assertEquals(0.0, cuenta2.getSaldo());
        
        cuenta2.retiro(-10.0);
        assertEquals(0.0, cuenta2.getSaldo());
    }

    @Test
    @Order(12)
    public void testCuentaMetodosFormato() {
        assertEquals("Cuenta [numeroCuenta=111, titular=Pepe Martínez]", cuenta1.toString());
    }

    @Test
    @Order(13)
    public void testVerDatosSinExcepciones() {
        cuenta1.ingreso(100);
        cuenta1.retiro(50);
        assertDoesNotThrow(() -> cuenta1.verDatos());
        assertDoesNotThrow(() -> cuenta2.verDatos());
    }

    @Test
    @Order(14)
    public void testMainEjecucionCompleta() {
        assertDoesNotThrow(() -> Cuentas.main(new String[]{}));
    }
}
