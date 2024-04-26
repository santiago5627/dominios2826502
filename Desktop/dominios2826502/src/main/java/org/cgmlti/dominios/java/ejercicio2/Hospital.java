package org.cgmlti.dominios.java.ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Hospital {

    String nombre;
    String direccion;
    Long telefono;

    // Lista de Medicos
    // tambien es un atributo
    // de los objetos hospital
    List<Medico> listaMedicos = new ArrayList<Medico>();
    List<SalaHospital> listSalas = new ArrayList<SalaHospital>();

}
