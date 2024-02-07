package org.llorenscapo.ejemplos.map;

import java.util.*;

public class EjemploHashMap {
    public static void main(String[] args) {

        Map<String, Object> persona = new HashMap<>();

        persona.put("nombre", "John");
        persona.put("apellido", "Doe");
        persona.put("apellidoPaterno", "Roe");
        persona.put("email", "john.doe@email.com");
        persona.put("edad", 30);

        Map<String, String> direccion = new HashMap<>();

        direccion.put("pais", "USA");
        direccion.put("estado", "California");
        direccion.put("ciudad", "Santa Barbara");
        direccion.put("calle", "One Street");
        direccion.put("numero", "120");

        persona.put("direccion", direccion);

        System.out.println("persona = " + persona);

        String nombre = (String) persona.get("nombre");
        System.out.println("nombre = " + nombre);

        String apellido = (String) persona.get("apellido");
        System.out.println("apellido = " + apellido);

        Map<String, String> direccionPersona = (Map<String, String>) persona.get("direccion");
        String pais = direccionPersona.get("pais");
        String ciudad = direccionPersona.get("ciudad");
        String barrio = direccionPersona.getOrDefault("barrio", "La playa");
        System.out.println("El pais de " + nombre + " es: " + pais);
        System.out.println("La ciudad de " + nombre + " es: " + ciudad);
        System.out.println("El barrio de " + nombre + " es: " + barrio);

        System.out.println("====================================");

        String valorApellido = (String) persona.remove("apellidoPaterno");
        boolean b = persona.remove("apellidoPaterno", "Roe");
        System.out.println("eliminado = " + valorApellido);
        System.out.println("apellido paterno = " + b);
        System.out.println("persona = " + persona);

        System.out.println("====================================");

        Collection<Object> valores = persona.values();
        for (Object valor: valores){
            System.out.println(valor);
        }

        System.out.println("=======================================");

        Set<String> llaves = persona.keySet();
        for (String llave: llaves){
            System.out.println(llave);
        }

        System.out.println("=====================================");

        for (Map.Entry<String, Object> par: persona.entrySet()){
            Object valor = par.getValue();
            if (valor instanceof Map) {
                String nom = (String) persona.get(nombre);
                Map<String, String> direccionMap = (Map<String, String>) valor;
                for (Map.Entry<String, String> parDir: direccionMap.entrySet()){
                    System.out.println(parDir.getKey() + " => " + parDir.getValue());
                }
            } else {
                System.out.println(par.getKey() + " => " + valor);
            }
        }

        System.out.println("========================================");

        for (String llave: persona.keySet()){
            Object valor = persona.get(llave);
            if (valor instanceof Map) {
                String nom = (String) persona.get(nombre);
                Map<String, String> direccionMap = (Map<String, String>) valor;
                System.out.println("El país de " + nom + ": " + direccionMap.get("pais"));
                System.out.println("La ciudad de " + nom + ": " + direccionMap.get("ciudad"));
            } else {
                System.out.println(llave + " => " + valor);
            }
        }

        System.out.println("=======================================");

        persona.forEach((llave, valor) -> {
            System.out.println(llave + " => " + valor);
        });

        System.out.println("==================================");

        System.out.println("total: " + persona.size());
        System.out.println("contiene elementos = " + !persona.isEmpty());
        persona.replace("nombre", "Andrés");
        System.out.println("persona = " + persona);

    }
}
