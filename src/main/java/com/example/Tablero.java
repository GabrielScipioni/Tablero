package com.example;
import java.util.ArrayList;
import java.util.List;
public class Tablero {
    private final List<Casillero> casilleros;

    public Tablero() {
        casilleros = new ArrayList<>();
        // Crear casilleros
        for (int i = 1; i <= 42; i++) {
            casilleros.add(new Casillero("Casillero " + i+ " "+ nombreCasillero(i)));
        }
    }
    public String nombreCasillero(int numeroCasillero){
        String[] nombresCasilleros = {
                "SALIDA",
                "Formosa Sur", "Formosa Centro", "Formosa Norte",
                "Impuesto a los Reditos",
                "Rio Negro Sur", "Rio Negro Norte",
                "PREMIO GANADERO",
                "Compañia Petrolera",
                "Salta Sur", "DESTINO", "Salta Centro", "Ferrocarril Belgrano",
                "Salta Norte","COMISARIA",
                "SUERTE",
                "Bodega",
                "Mendoza Sur","Ferrocarril San Martin", "Mendoza Centro",
                "Mendoza Norte",
                "DESCANSO",
                "Ferrocarril B. Mitre",
                "Santa Fe Sur", "Santa Fe Centro","DESTINO",
                "Santa Fe Norte",
                "Ferrocarril General Urquiza",
                "LIBRE ESTACIONAMIENTO",
                "Tucuman Sur", "Tucuman Norte",
                "Ingenio",
                "Cordoba Sur", "Cordoba Centro", "Cordoba Norte",
                "MARCHE PRESO",
                "SUERTE",
                "Buenos Aires Sur","DESTINO", "Buenos Aires Centro",
                "Buenos Aires Norte",
                "Impuesto a las ventas"
        };

        if (numeroCasillero >= 0 && numeroCasillero < nombresCasilleros.length) {
            return nombresCasilleros[numeroCasillero];
        } else {
            return "Casillero desconocido";
        }
    }


    public int getCantidadCasilleros() {
        return casilleros.size();
    }

    public Casillero getCasillero(int indice) {
        int indiceAjustado = (indice + casilleros.size() - 1) % casilleros.size(); // Ajustar el índice para que sea cíclico
        return casilleros.get(indiceAjustado);
    }

}
