package org.llorenscapo.poointerfaces.imprenta.modelo;

public interface Imprimible {

    final static String TEXTO_DEFECTO = "Imprimiendo un valor por defecto";

    default String imprimir(){
        return TEXTO_DEFECTO; //valor por defecto
    }

    static void imprimir(Imprimible imprimible){
        System.out.println(imprimible.imprimir());
    }

}
