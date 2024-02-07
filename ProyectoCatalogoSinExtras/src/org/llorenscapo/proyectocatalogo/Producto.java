package org.llorenscapo.proyectocatalogo;

abstract public class Producto {

    private int precio;

    public Producto(int precio) {
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }

    abstract public double getPrecioVenta();
}
