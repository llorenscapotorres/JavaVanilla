package org.llorenscapo.mamiferos;

abstract public class Felino extends Mamifero {

    protected float tamanoGarras;
    protected int velocidad;

    public Felino(String habitat, float altura, float largo, float peso,
                  String nombreCientifico, float tamanoGarras, int velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.tamanoGarras = tamanoGarras;
        this.velocidad = velocidad;
    }

    public float getTamanoGarras() {
        return tamanoGarras;
    }

    public int getVelocidad() {
        return velocidad;
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
