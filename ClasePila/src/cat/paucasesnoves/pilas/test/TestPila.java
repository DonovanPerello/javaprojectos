package cat.paucasesnoves.pilas.test;

import org.junit.jupiter.api.Test;
import java.util.EmptyStackException;
import static org.junit.jupiter.api.Assertions.*;
import cat.paucasesnoves.pilas.Pila;

public class TestPila {

    @Test
    public void testPilaVaciaInicialmente() {
        Pila pila = new Pila();
        assertTrue(pila.isEmpty());
    }

    @Test
    public void testPushYTop() {
        Pila pila = new Pila();
        pila.push(100);
        pila.push(200);

        assertFalse(pila.isEmpty());
        assertEquals(200, pila.top());
        assertEquals(200, pila.top());
    }

    @Test
    public void testPopComportamientoLIFO() {
        Pila pila = new Pila();
        pila.push(10);
        pila.push(20);
        pila.push(30);

        assertEquals(30, pila.pop());
        assertEquals(20, pila.pop());
        assertEquals(10, pila.pop());

        assertTrue(pila.isEmpty());
    }

    @Test
    public void testLanzamientoExcepciones() {
        Pila pila = new Pila();

        assertThrows(EmptyStackException.class, () -> {
            pila.pop();
        });

        assertThrows(EmptyStackException.class, () -> {
            pila.top();
        });
    }
}