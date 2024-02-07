package org.llorenscapo.mamiferos.individuales;

import org.llorenscapo.mamiferos.Felino;

public class Leon extends Felino {

    private int numManda;
    private float potenciaRugidoDecibel;

    public Leon(String habitat, float altura, float largo, float peso,
                String nombreCientifico, float tamanoGarras, int velocidad,
                int numManda, float potenciaRugidoDecibel) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
        this.numManda = numManda;
        this.potenciaRugidoDecibel = potenciaRugidoDecibel;
    }

    public int getNumManda() {
        return numManda;
    }

    public float getPotenciaRugidoDecibel() {
        return potenciaRugidoDecibel;
    }

    @Override
    public String comer() {
        String detalle = "El león (" + this.nombreCientifico +
                ") aprovecha el tamaño de sus garras -" +
                this.tamanoGarras + "- para comer";
        return detalle;
    }

    @Override
    public String dormir() {
        String detalle = "El león duerme en el siguiente habitat: " +
                this.habitat;
        return detalle;
    }

    @Override
    public String correr() {
        String detalle = "El león aprovecha su " + this.altura + ", " +
                this.largo + " y " + this.peso + " para correr rápidamente a "
                + this.velocidad + " por km/h";
        return detalle;
    }

    @Override
    public String comunicarse() {
        String detalle = "El león se comunica con los " + this.numManda +
                " miembros de la manada, y se comunica mediante rugidos de " +
                this.potenciaRugidoDecibel + " decibelios";
        return detalle;
    }
}
