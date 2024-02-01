package org.llorenscapo.empresa;

public class Empleado extends Persona{

    private double remuneracion;
    private int empleadoId;
    private static int ultimoEmpleadoId;

    public Empleado(String nombre, String apellido, String numeroFiscal,
                    String direccion, double remuneracion){
        super(nombre, apellido, numeroFiscal, direccion);
        this.remuneracion = remuneracion;
        this.empleadoId = ++ultimoEmpleadoId;
    }

    public double getRemuneracion() {
        return remuneracion;
    }

    public int getEmpleadoId() {
        return empleadoId;
    }

    public void aumentarRemuneracion(int porcentaje){
        this.remuneracion += remuneracion * porcentaje/100;
    }

    @Override
    public String toString() {
        String detalle = super.toString() + "\nRemuneración: " + this.remuneracion +
                "\t\tNúmero de Empleado: " + this.empleadoId;
        if (this instanceof Gerente){
            //
        } else {
            detalle += "\n====================================";
        }
        return detalle;
    }
}
