package test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import clientesCuentas.Cliente;

import org.junit.jupiter.api.TestMethodOrder;

/**
 *
 * @author Toni
 */
@TestMethodOrder(OrderAnnotation.class)
@TestInstance(Lifecycle.PER_CLASS)
public class ClienteTest {

    private Cliente cliente1;
    private Cliente cliente2;

    public ClienteTest() {
    }

    @BeforeAll
    public void createClients() {
        cliente1 = new Cliente("Pepe", "Martínez", "C/ Estación 22", "Valencia", LocalDate.of(2000, 1, 1));
        cliente2 = new Cliente("Marta", "García", "C/ Mayor 25", "Madrid", LocalDate.of(2002, 2, 2));
    }

    @Test
    @Order(2)
    public void testGetNombre() {
        String expResult1 = "Pepe";
        String result1 = this.cliente1.getNombre();
        assertEquals(expResult1, result1);

        String expResult2 = "Marta";
        String result2 = this.cliente2.getNombre();
        assertEquals(expResult2, result2);
        assertNotEquals(expResult1, result2);
    }

    @Test
    @Order(1)
    public void testSetNombre() {
        String nombre = "Andrés";
        this.cliente1.setNombre(nombre);
        assertEquals(this.cliente1.getNombre(), nombre);
        assertNotEquals(this.cliente1.getNombre(), "Pepe");
    }

}