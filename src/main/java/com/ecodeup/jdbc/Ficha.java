package com.ecodeup.jdbc;

import java.util.Random;

public class Ficha {
    private int posicion;

    public Ficha() {
        posicion = 0;
    }

    public int getPosicion() {
        return posicion;
    }

    public void mover(int cantidadCasilleros) {
        Random random = new Random();
        int tirada = random.nextInt(6) + 1; // Tirada de dado de 6 caras
        System.out.println("Has tirado un " + tirada);
        posicion = (posicion + tirada) % cantidadCasilleros;
        System.out.println("Te has movido al casillero " + (posicion + 1));
    }
}
