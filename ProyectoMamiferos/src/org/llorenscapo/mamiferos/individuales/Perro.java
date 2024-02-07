package org.llorenscapo.mamiferos.individuales;

import org.llorenscapo.mamiferos.Canino;

public class Perro extends Canino {

    private int fuerzaMordida;

    public Perro(String habitat, float altura, float largo, float peso,
                 String nombreCientifico, String color,
                 float tamanoColmillos, int fuerzaMordida) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanoColmillos);
        this.fuerzaMordida = fuerzaMordida;
    }

    public int getFuerzaMordida() {
        return fuerzaMordida;
    }

    @Override
    public String comer() {
        String detalle = "El perro (" + this.nombreCientifico + ") de color " +
                this.color + "aprovecha el tamaño de sus colmillos -" +
                this.tamanoColmillos + " y de su fuerza de mordida (" +
                this.fuerzaMordida + ")- para comer";
        return detalle;
    }

    @Override
    public String dormir() {
        String detalle = "El perro duerme en el siguiente habitat: " +
                this.habitat;
        return detalle;
    }

    @Override
    public String correr() {
        String detalle = "El perro aprovecha su " + this.altura + ", " +
            this.largo + " y " + this.peso + " para correr rápidamente";
        return detalle;
    }

    @Override
    public String comunicarse() {
        String detalle = "El perro ladra para poder comunicarse";
        return detalle;
    }
}
