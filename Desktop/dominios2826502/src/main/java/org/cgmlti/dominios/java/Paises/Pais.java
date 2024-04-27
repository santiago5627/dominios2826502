package org.cgmlti.dominios.java.Paises;

import java.util.ArrayList;
import java.util.List;

public class Pais {

    String Nombre;

    List<Ciudad> listaCiudad = new ArrayList<Ciudad>();

    public Pais(String nombre) {
        Nombre = nombre;
    }

}
