package com.example;

// Clase Movimiento.java
public class Movimiento {
    public static void moverFicha(Ficha ficha, int cantidadCasilleros, Turno turno) {
        // Verificar si el jugador está en la cárcel y tiene que esperar un turno
        if (ficha.isPreso()) {
            if (turno.getTurnosPerdidos() == 0) {
                ficha.setPreso(false); // Liberar al jugador si se quedó sin turnos perdidos
            } else {
                turno.setTurnosPerdidos(turno.getTurnosPerdidos() - 1); // Reducir los turnos perdidos
                return; // Salir sin mover la ficha
            }
        }

        // Tirar los dados y obtener la suma de los resultados
        int sumaDados = turno.tirarDados();
        System.out.println("Has tirado un " + sumaDados);

        // Mover la ficha según la suma de los dados
        int nuevaPosicion = (ficha.getPosicion() + sumaDados) % cantidadCasilleros;

        // Ajustar la posición para que no sea menor que 0
        if (nuevaPosicion < 0) {
            nuevaPosicion += cantidadCasilleros;
        }

        // Actualizar la posición de la ficha
        ficha.setPosicion(nuevaPosicion);

        System.out.println("Te has movido al casillero " + (nuevaPosicion + 1)); // Sumar 1 para ajustar al índice del tablero

        // Verificar si la ficha ha caído en la cárcel
        if (nuevaPosicion == 14) {
            ficha.setPreso(true);
            turno.setTurnosPerdidos(1); // Se pierde un turno
            System.out.println("¡MARCHE PRESO!");
        }
    }
}
