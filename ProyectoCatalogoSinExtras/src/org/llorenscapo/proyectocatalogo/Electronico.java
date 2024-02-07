package org.llorenscapo.proyectocatalogo;

abstract public class Electronico extends Producto{

    private String fabricante;

    public Electronico(int precio, String fabricante) {
        super(precio);
        this.fabricante = fabricante;
    }

    public String getFabricante() {
        return fabricante;
    }

    abstract public double getPrecioVenta();
}
