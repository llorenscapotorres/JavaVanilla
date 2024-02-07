package org.llorenscapo.mamiferos.individuales;

import org.llorenscapo.mamiferos.Felino;

public class Guepardo extends Felino {

    public Guepardo(String habitat, float altura, float largo, float peso,
                    String nombreCientifico, float tamanoGarras, int velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
    }

    @Override
    public String comer() {
        String detalle = "El guepardo (" + this.nombreCientifico +
                ") aprovecha el tamaño de sus garras -" +
                this.tamanoGarras + "- para comer";
        return detalle;
    }

    @Override
    public String dormir() {
        String detalle = "El guepardo duerme en el siguiente habitat: " +
                this.habitat;
        return detalle;
    }

    @Override
    public String correr() {
        String detalle = "El guepardo aprovecha su " + this.altura + ", " +
                this.largo + " y " + this.peso + " para correr rápidamente a "
                + this.velocidad + " por km/h";
        return detalle;
    }

    @Override
    public String comunicarse() {
        String detalle = "El perro guepardea para poder comunicarse";
        return detalle;
    }
}
