package org.llorenscapo.ejemplos.list;

import org.llorenscapo.ejemplos.modelo.Alumno;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EjemploListComparableComparator {
    public static void main(String[] args) {

        List<Alumno> sa = new ArrayList<>();
        sa.add(new Alumno("Pato", 5));
        sa.add(new Alumno("Cata", 6));
        sa.add(new Alumno("Luci", 4));
        sa.add(new Alumno("Jano", 7));
        sa.add(new Alumno("Andres", 3));
        sa.add(new Alumno("Zeus", 2));
        sa.add(new Alumno("Zeus2", 2));
        sa.add(new Alumno("Zeus", 3));
        // Collections.sort(sa, (a, b) -> b.getNota().compareTo(a.getNota()));
        // sa.sort((a, b) -> b.getNota().compareTo(a.getNota()));
        sa.sort(Comparator.comparing(Alumno::getNota).reversed());
        System.out.println(sa);

        System.out.println("----Usando expresiones lambda----");
        sa.forEach(alumno -> System.out.println(alumno.getNombre()));

    }
}
