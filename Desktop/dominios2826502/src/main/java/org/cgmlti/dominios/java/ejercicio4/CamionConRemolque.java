package org.cgmlti.dominios.java.ejercicio4;

public class CamionConRemolque extends Vehiculo {

    Integer capacidadCargaExtra;
    String descripcion;

    // crear un metodo que permita
    // calcular el total de carga maxima
    // soportado en los camiones con remolque
    // declaracion de metodos

    public Integer calcularTotalCarga() {

        Integer totalCarga = capacidadCarga + capacidadCargaExtra;

        return totalCarga;

    }
}
