package com.ecodeup.jdbc;

import java.util.ArrayList;
import java.util.List;

public class Tablero {
    private List<Casillero> casilleros;

    public Tablero() {
        casilleros = new ArrayList<>();
        // Crear casilleros
        for (int i = 1; i <= 10; i++) {
            casilleros.add(new Casillero("Casillero " + i));
        }
    }

    public int getCantidadCasilleros() {
        return casilleros.size();
    }

    public Casillero getCasillero(int indice) {
        return casilleros.get(indice);
    }
}
