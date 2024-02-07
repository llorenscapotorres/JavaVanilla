package org.llorenscapo.mamiferos.individuales;

import org.llorenscapo.mamiferos.Felino;

public class Tigre extends Felino {

    private String especieTigre;

    public Tigre(String habitat, float altura, float largo, float peso,
                 String nombreCientifico, float tamanoGarras,
                 int velocidad, String especieTigre) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
        this.especieTigre = especieTigre;
    }

    public String getEspecieTigre() {
        return especieTigre;
    }

    @Override
    public String comer() {
        String detalle = "El tigre (" + this.nombreCientifico +
                ") aprovecha el tamaño de sus garras -" +
                this.tamanoGarras + "- para comer";
        return detalle;
    }

    @Override
    public String dormir() {
        String detalle = "El tigre duerme en el siguiente habitat: " +
                this.habitat;
        return detalle;
    }

    @Override
    public String correr() {
        String detalle = "El tigre aprovecha su " + this.altura + ", " +
                this.largo + " y " + this.peso + " para correr rápidamente a "
                + this.velocidad + " por km/h";
        return detalle;
    }

    @Override
    public String comunicarse() {
        String detalle = "El tigre se comunica con los de su especie, que es: " +
                this.especieTigre;
        return detalle;
    }
}
