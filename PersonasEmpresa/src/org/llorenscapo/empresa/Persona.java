package org.llorenscapo.empresa;

public class Persona {

    private String nombre;
    private String apellido;
    private String numeroFiscal;
    private String direccion;

    public Persona(String nombre, String apellido, String numeroFiscal, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroFiscal = numeroFiscal;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNumeroFiscal() {
        return numeroFiscal;
    }

    public String getDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        String detalle = this.nombre + " " + this.apellido +
                "\nNúmero Fiscal: " + this.numeroFiscal +
                "\t\tDirección: " + this.direccion;
        if (this instanceof Cliente || this instanceof Empleado || this instanceof Gerente){
            //
        } else {
            detalle += "\n====================================";
        }
        return detalle;
    }
}
