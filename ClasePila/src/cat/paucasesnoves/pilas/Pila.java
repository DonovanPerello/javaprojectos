package cat.paucasesnoves.pilas;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class Pila implements Apilable {

    private ArrayList<Integer> elementos;

    public Pila() {
        elementos = new ArrayList<>();
    }

    public void push(int elemento) {
        elementos.add(elemento);
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return elementos.remove(elementos.size() - 1);
    }

    public boolean isEmpty() {
        return elementos.isEmpty();
    }

    public int top() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return elementos.get(elementos.size() - 1);
    }
}
