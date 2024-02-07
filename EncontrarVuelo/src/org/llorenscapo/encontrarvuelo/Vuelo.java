package org.llorenscapo.encontrarvuelo;

import java.util.Date;

public class Vuelo {

    private String nombre;
    private String origen;
    private String destino;
    private Date fechaHora;
    private int cantidadPasajeros;

    public Vuelo(String nombre, String origen, String destino,
                 Date fechaHora, int cantidadPasajeros) {
        this.nombre = nombre;
        this.origen = origen;
        this.destino = destino;
        this.fechaHora = fechaHora;
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public String getNombre() {
        return nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    @Override
    public String toString() {
        return "Vuelo: " + nombre + "\nOrigen: " + origen
                + "\nDestino: " + destino + "\nFecha: " + fechaHora
                + "\nNumero de Pasajeros: " + fechaHora;
    }
}
