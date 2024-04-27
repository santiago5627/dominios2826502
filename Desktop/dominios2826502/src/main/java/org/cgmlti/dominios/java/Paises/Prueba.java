package org.cgmlti.dominios.java.Paises;

public class Prueba {

    public static void main(String[] args) {

        Ciudad ciudad1 = new Ciudad("Medellin");
        ciudad1.Nombre = "Medellin";

        Ciudad ciudad2 = new Ciudad("Bogota");
        ciudad2.Nombre = "Bogota";

        Ciudad ciudad3 = new Ciudad("Cucuta");
        ciudad3.Nombre = "Cucuta";

        Pais p1 = new Pais(" Colombia ");

        p1.Nombre = " Colombia ";

        Ruta r1 = new Ruta(16L);

        r1.numero = 16L;

        r1.listaCiudad.add(ciudad1);
        r1.listaCiudad.add(ciudad2);
        r1.listaCiudad.add(ciudad3);

        System.out.println("ruta: " + r1.numero);

        for (Ciudad ciudadRuta : r1.listaCiudad) {
            System.out.println(" Ciudad:" + ciudadRuta.Nombre);
        }

    }

}
