package org.cgmlti.dominios.java.ejercicio4;

import java.time.LocalDate;

public class Prueba {
    public static void main(String[] args) {

        // crear una instancia del Vehiculo:
        Vehiculo vehiculo1 = new Vehiculo(1232456456L, true, 45);

        // crear un onjeto viaje
        Viaje v = new Viaje();
        // invocacion: llamado, ejecicion y utilizacion
        v.calcularDuracionViaje(LocalDate.of(2024, 4, 26), LocalDate.of(2024, 4, 28));

        // invocacion de la sobre carga
        System.out.println(" Duracion en Dias del viaje     |" + v.calcularDuracionViaje());

        // intanciar un ejemplar
        // de cada tipo de vehiculo

        // CREAR CAMION
        Camion c1 = new Camion();
        c1.estaDisponible = true;

        // establecer el viaje
        // del camion:

        c1.elTalViajeQueHizoElCamion = v;

        // CREAR CAMION REMOLQUE

        CamionConRemolque cr1 = new CamionConRemolque();
        cr1.capacidadCargaExtra = 9;
        cr1.capacidadCarga = 10;

        // invocar el metodo creado
        Integer totalcarga = cr1.calcularTotalCarga();
        System.out.println(" total carga: " + totalcarga);

        // CREAR CAMIONETA
        Camioneta cm1 = new Camioneta();
        cm1.esDobleCabina = true;

        System.out.println(" El viaje del camion " + "tiene fecha de inicio" + c1.elTalViajeQueHizoElCamion.fechaInicio
                + " Finaliza el viaje " + c1.elTalViajeQueHizoElCamion.fechaFin);
    }
}
