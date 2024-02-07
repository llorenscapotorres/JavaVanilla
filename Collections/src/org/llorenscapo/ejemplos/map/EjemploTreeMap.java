package org.llorenscapo.ejemplos.map;

import java.util.*;

public class EjemploTreeMap {
    public static void main(String[] args) {

        Map<String, Object> persona = new TreeMap<>(
                Comparator.reverseOrder()
        ); //utiliza el método compareTo para ordenar los elementos

        persona.put("nombre", "John");
        persona.put("apellido", "Doe");
        persona.put("apellidoPaterno", "Roe");
        persona.put("email", "john.doe@email.com");
        persona.put("edad", 30);

        Map<String, String> direccion = new TreeMap<>(Comparator.comparing(String::length));

        direccion.put("pais", "USA");
        direccion.put("estado", "California");
        direccion.put("ciudad", "Santa Barbara");
        direccion.put("calle", "One Street");
        direccion.put("numero", "120");

        persona.put("direccion", direccion);

        System.out.println(persona);

    }
}
