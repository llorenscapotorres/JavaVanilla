package org.llorenscapo.empresa;

public class Cliente extends Persona{

    private int clienteId;
    private static int ultimoClienteId;

    public Cliente(String nombre, String apellido, String numeroFiscal,
                   String direccion){
        super(nombre, apellido, numeroFiscal, direccion);
        this.clienteId = ++ultimoClienteId;
    }

    public int getClienteId() {
        return clienteId;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNúmero de Cliente: " + this.clienteId +
                "\n====================================";
    }
}
