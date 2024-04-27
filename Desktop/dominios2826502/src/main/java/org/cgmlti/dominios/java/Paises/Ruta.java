package org.cgmlti.dominios.java.Paises;

import java.util.ArrayList;
import java.util.List;

public class Ruta {

    Long numero;

    // Lista de rutas

    List<Ciudad> listaCiudad = new ArrayList<Ciudad>();

    public Ruta(Long numero) {
        this.numero = numero;
    }

}
