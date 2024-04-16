package com.example;

import java.util.Scanner;import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Tablero tablero = new Tablero();
        Ficha jugador1 = new Ficha("Jugador 1");
        Ficha jugador2 = new Ficha("Jugador 2");
        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Bienvenido al juego de Monopoly!");

        Ficha turnoActual = jugador1; // Iniciar con el primer jugador
        Turno turno = new Turno();

        while (true) {
            // Imprimir el nombre del jugador actual con color rojo o azul
            if (turnoActual == jugador1) {
                System.out.print("\u001B[31m"); // Código ANSI para color rojo
            } else {
                System.out.print("\u001B[34m"); // Código ANSI para color azul
            }
            System.out.println(turnoActual.getJugador() + "\u001B[0m"); // Restaurar color original

            System.out.println("Presiona Enter para tirar el dado o escribe 'salir' para terminar:");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("salir")) {
                break;
            }

            Movimiento.moverFicha(turnoActual, tablero.getCantidadCasilleros(), turno);
            Casillero casilleroActual = tablero.getCasillero(turnoActual.getPosicion());
            System.out.println("Estás en el casillero: " + casilleroActual.getNombre());

            // Cambiar al siguiente jugador
            turnoActual = (turnoActual == jugador1) ? jugador2 : jugador1;
        }

        scanner.close();
        System.out.println("¡Hasta luego!");
    }
}

