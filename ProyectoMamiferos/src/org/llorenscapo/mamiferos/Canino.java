package org.llorenscapo.mamiferos;

abstract public class Canino extends Mamifero {

    protected String color;
    protected float tamanoColmillos;

    public Canino(String habitat, float altura, float largo, float peso,
                  String nombreCientifico, String color, float tamanoColmillos) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.color = color;
        this.tamanoColmillos = tamanoColmillos;
    }

    public String getColor() {
        return color;
    }

    public float getTamanoColmillos() {
        return tamanoColmillos;
    }

    @Override
    abstract public String comer();

    @Override
    abstract public String dormir();

    @Override
    abstract public String correr();

    @Override
    abstract public String comunicarse();

}
