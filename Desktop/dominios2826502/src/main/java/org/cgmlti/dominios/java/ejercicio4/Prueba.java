package org.cgmlti.dominios.java.ejercicio4;

import java.time.LocalDateTime;

public class Prueba {
    public static void main(String[] args) {

        // crear un onjeto viaje
        Viaje v = new Viaje();
        v.fechaFin = LocalDateTime.of(2024, 4, 26, 22, 30, 0);
        v.fechaInicio = LocalDateTime.of(2024, 4, 28, 6, 30, 0);
        // intanciar un ejemplar
        // de cada tipo de vehiculo

        Camion c1 = new Camion();
        c1.estaDisponible = true;

        // establecer el viaje
        // del camion:

        c1.elTalViajeQueHizoElCamion = v;

        CamionConRemolque cr1 = new CamionConRemolque();
        cr1.capacidadCargaExtra = 9;

        Camioneta cm1 = new Camioneta();
        cm1.esDobleCabina = true;

        System.out.println("El viaje del camion" + "tiene fecha de inicio" + c1.elTalViajeQueHizoElCamion.fechaInicio
                + " Finaliza el viaje " + c1.elTalViajeQueHizoElCamion.fechaFin);
    }
}
