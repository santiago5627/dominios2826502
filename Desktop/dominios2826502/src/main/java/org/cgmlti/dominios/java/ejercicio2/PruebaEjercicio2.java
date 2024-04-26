package org.cgmlti.dominios.java.ejercicio2;

public class PruebaEjercicio2 {

    public static void main(String[] args) {
        // Crear 2 intancias de cada entidad
        // Intanciar 2 veses cada Entidad
        // Crear 2 objetos de cada entidad
        // 1.Nombre de la case a Intanciar
        // 2.Nombre del objeto(identificacdor)
        // 3.operador de asignacion
        // 4.palabra(referencia) new
        // 5.otra vez el nombre de la clase
        // 6.parentesis(contrctor)
        Hospital hospital1 = new Hospital();
        Hospital h1 = new Hospital();

        // acceder a los atributos del objeto:
        // operador .
        // 1.identificador del objeto
        // 2.el punto
        // 3.el atributo a trabajar
        // 4.el operador de asignacion
        // 5.el valo9r a asignar al atributo
        hospital1.direccion = "Av.caracas con 52";
        h1.nombre = "Cristian";
        h1.telefono = 21325414551534L;

        // crear 3 medicos
        Medico medico1 = new Medico();
        medico1.nombre = "Carlos";
        medico1.cedula = 45456465L;
        medico1.especialidad = "CARDIOLOGIA";

        Medico medico2 = new Medico();
        medico2.nombre = "Angel";
        medico2.cedula = 456451654L;
        medico2.especialidad = "ODONTOLOGIA";

        Medico medico3 = new Medico();
        medico3.nombre = "Miguel";
        medico3.cedula = 1313212312L;
        medico3.especialidad = "PEDIATRIA";

        // añadir medicos al hospital
        hospital1.listaMedicos.add(medico1);
        hospital1.listaMedicos.add(medico2);
        hospital1.listaMedicos.add(medico3);

        // recorrer la lista de medico
        // del hospital1;
        for (Medico medicoRecorrer : hospital1.listaMedicos) {
            System.out.println("Medico:" + medicoRecorrer.cedula);

        }

        // Crear 2 salas

        SalaHospital Sala1 = new SalaHospital();
        Sala1.numero = 54545645;
        Sala1.cantidadCamas = 18;

        SalaHospital Sala2 = new SalaHospital();
        Sala2.numero = 12123132;
        Sala2.cantidadCamas = 26;

        // añadir salas al hospital
        hospital1.listSalas.add(Sala1);
        hospital1.listSalas.add(Sala2);

        // recorrer la lista de salas
        // del hospital
        for (SalaHospital salaRecorrer : hospital1.listSalas) {
            System.out.println("SalaHospital:" + salaRecorrer.cantidadCamas);

        }

    }

}
