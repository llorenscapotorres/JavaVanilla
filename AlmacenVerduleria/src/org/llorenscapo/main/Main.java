package org.llorenscapo.main;

import org.llorenscapo.almacen.*;

public class Main {
    public static void main(String[] args) {

        Lacteo lacteo1 = new Lacteo("Leche", 3.99, 1000, 5);
        Lacteo lacteo2 = new Lacteo("Queso Manchego", 20.19, 1500, 23);

        Fruta fruta1 = new Fruta("Manzana", 1.20, 8.8, "Rojo");
        Fruta fruta2 = new Fruta("Pera", 1.40, 9.3, "Verde");

        Limpieza limpieza1 = new Limpieza("Don Limpio", 13, "Baño", 2.5);
        Limpieza limpieza2 = new Limpieza("KH-7", 9.99, "Baño y Ducha",  1);

        NoPerecible noPerecible1 = new NoPerecible("Control PS5", 49.59, 2, 0);
        NoPerecible noPerecible2 = new NoPerecible("Nueces", 7.33, 100, 87);

        Producto[] productos = new Producto[8];
        productos[0] = lacteo1;
        productos[1] = lacteo2;
        productos[2] = fruta1;
        productos[3] = fruta2;
        productos[4] = limpieza1;
        productos[5] = limpieza2;
        productos[6] = noPerecible1;
        productos[7] = noPerecible2;

        for (Producto item: productos){
            System.out.println(item);
        }
    }
}
