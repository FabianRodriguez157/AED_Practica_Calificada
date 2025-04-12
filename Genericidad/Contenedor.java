package Genericidad;

import java.util.*;

public class Contenedor<T> {
    private ArrayList<T> elementos;
    
    public Contenedor() {
        this.elementos = new ArrayList<>();
    }
    
    public void agregar(T elemento) {
        elementos.add(elemento);
    }
    
    public T obtener(int indice) {
        if (indice >= 0 && indice < elementos.size()) {
            return elementos.get(indice);
        } else {
            throw new IndexOutOfBoundsException("Índice fuera de los límites");
        }
    }
    
    public int contar() {
        return elementos.size();
    }

    public boolean estaVacio() {
        return elementos.isEmpty();
    }
}
