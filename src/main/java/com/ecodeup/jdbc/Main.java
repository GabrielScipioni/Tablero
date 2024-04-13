package com.ecodeup.jdbc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Tablero tablero = new Tablero();
        Ficha ficha = new Ficha();
        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Bienvenido al juego de Monopoly!");

        while (true) {
            System.out.println("Presiona Enter para tirar el dado o escribe 'salir' para terminar:");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("salir")) {
                break;
            }
            ficha.mover(tablero.getCantidadCasilleros());
            Casillero casilleroActual = tablero.getCasillero(ficha.getPosicion());
            System.out.println("Estás en el casillero: " + casilleroActual.getNombre());
        }

        scanner.close();
        System.out.println("¡Hasta luego!");
    }
}