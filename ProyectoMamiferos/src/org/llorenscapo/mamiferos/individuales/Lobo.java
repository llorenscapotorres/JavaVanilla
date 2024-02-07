package org.llorenscapo.mamiferos.individuales;

import org.llorenscapo.mamiferos.Canino;

public class Lobo extends Canino {

    private int numCamada;
    private String especieLobo;

    public Lobo(String habitat, float altura, float largo, float peso,
                String nombreCientifico, String color,
                float tamanoColmillos, int numCamada, String especieLobo) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanoColmillos);
        this.numCamada = numCamada;
        this.especieLobo = especieLobo;
    }

    public int getNumCamada() {
        return numCamada;
    }

    public String getEspecieLobo() {
        return especieLobo;
    }

    @Override
    public String comer() {
        String detalle = "El lobo (" + this.nombreCientifico + ") de color " +
                this.color + "aprovecha el tamaño de sus colmillos -" +
                this.tamanoColmillos + "- para comer";
        return detalle;
    }

    @Override
    public String dormir() {
        String detalle = "El lobo duerme en el siguiente habitat: " +
                this.habitat;
        return detalle;
    }

    @Override
    public String correr() {
        String detalle = "El lobo aprovecha su " + this.altura + ", " +
                this.largo + " y " + this.peso + " para correr rápidamente";
        return detalle;
    }

    @Override
    public String comunicarse() {
        String detalle = "El lobo de la especie " + this.especieLobo +
                " aulla para poder comunicarse con el resto de lobos de la camada, cuyo número es: "
                + this.numCamada;
        return detalle;
    }
}
