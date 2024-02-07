package org.llorenscapo.proyectocatalogo;

public class TvLcd extends Electronico{

    private int pulgadas;

    public TvLcd(int precio, String fabricante, int pulgadas) {
        super(precio, fabricante);
        this.pulgadas = pulgadas;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    @Override
    public double getPrecioVenta(){
        return getPrecio() * 0.8;
    }
}
