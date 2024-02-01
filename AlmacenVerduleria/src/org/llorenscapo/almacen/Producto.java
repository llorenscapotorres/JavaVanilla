package org.llorenscapo.almacen;

public class Producto {

    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        String detalle = "# Producto: " + this.nombre +
                "\n# Precio: " + this.precio;
        if (this instanceof Lacteo || this instanceof Fruta ||
                this instanceof Limpieza || this instanceof NoPerecible){
            //
        } else {
            detalle += "\n===================================";
        }
        return detalle;
    }
}
