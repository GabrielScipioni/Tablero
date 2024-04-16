package com.example;

public class Ficha {
    private int posicion;
    private boolean preso;
    private String jugador;

    public Ficha(String jugador) {
        this.jugador = jugador;
        this.posicion = 0;
        this.preso = false;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public boolean isPreso() {
        return preso;
    }

    public void setPreso(boolean preso) {
        this.preso = preso;
    }

    public String getJugador() {
        return jugador;
    }

    public void setJugador(String jugador) {
        this.jugador = jugador;
    }
}

