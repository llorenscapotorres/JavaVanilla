package org.llorenscapo.proyectocatalogo;

public class IPhone extends Electronico{

    private String modelo;
    private String color;

    public IPhone(int precio, String fabricante,
                  String modelo, String color) {
        super(precio, fabricante);
        this.modelo = modelo;
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    @Override
    public double getPrecioVenta(){
        return getPrecio() * 0.9;
    }
}
