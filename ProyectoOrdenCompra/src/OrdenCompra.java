import java.util.Date;

public class OrdenCompra {

    private int id;
    private static int ultimoId = 0;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private Producto[] productos;
    private int indiceProducto = 0;

    public OrdenCompra(String descripcion) {
        this.id = ++OrdenCompra.ultimoId;
        this.descripcion = descripcion;
        this.productos = new Producto[4];
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void addProducto(Producto producto){
        if (indiceProducto < this.productos.length) {
            this.productos[indiceProducto++] = producto;
        }
    }

    public int precioTotal(){
        int suma = 0;
        for (Producto producto: this.productos){
            suma += producto.getPrecio();
        }
        return suma;
    }
    public String verDetalle(){
        String detalle = this.getId() + ": " + "Descripción: " + this.getDescripcion();
        detalle += "\nFecha: " + this.getFecha();
        detalle += "\nCliente: " + this.getCliente();
        detalle += "\nProductos: ";
        for (Producto prod: this.getProductos()){
            detalle += prod + ", ";
        }
        detalle += "\nPrecio total: " + this.precioTotal();
        return detalle;
    }

}
