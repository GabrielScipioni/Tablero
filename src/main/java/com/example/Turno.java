package com.example;

public class Turno {
    private Dado dado1;
    private Dado dado2;
    private int doblesConsecutivos;
    private int turnosPerdidos;

    public Turno() {
        dado1 = new Dado();
        dado2 = new Dado();
        doblesConsecutivos = 0;
        turnosPerdidos = 0;
    }

    public int tirarDados() {
        int tiradaDado1 = dado1.tirar();
        int tiradaDado2 = dado2.tirar();

        if (tiradaDado1 == tiradaDado2) {
            doblesConsecutivos++;
            if (doblesConsecutivos == 3) {
                return -1; // Ir a la cárcel
            }
        } else {
            doblesConsecutivos = 0;
        }

        return tiradaDado1 + tiradaDado2;
    }

    public int getTurnosPerdidos() {
        return turnosPerdidos;
    }

    public void setTurnosPerdidos(int turnosPerdidos) {
        this.turnosPerdidos = turnosPerdidos;
    }
}
