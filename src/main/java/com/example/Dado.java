package com.example;

import java.util.Random;

public class Dado {
    private Random random;

    public Dado() {
        random = new Random();
    }
        public int tirar() {
            return random.nextInt(6)+1; // Siempre devuelve 0, representando el número 1
        }


}
