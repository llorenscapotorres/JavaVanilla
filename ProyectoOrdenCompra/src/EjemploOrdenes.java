import java.util.Calendar;
import java.util.Date;

public class EjemploOrdenes {
    public static void main(String[] args) {

        OrdenCompra primeraOrden = new OrdenCompra("Primera orden de compra");
        Cliente primerCliente = new Cliente("Llorenç", "Capó");
        primeraOrden.setCliente(primerCliente);
        primeraOrden.setFecha(new Date(2024, Calendar.FEBRUARY, 26));
        primeraOrden.addProducto(new Producto("HP", "TV", 150));
        primeraOrden.addProducto(new Producto("Apple", "iPhone 14", 850));
        primeraOrden.addProducto(new Producto("Innobella", "Impresora DCP", 80));
        primeraOrden.addProducto(new Producto("Sony", "Monitor", 120));

        System.out.println(primeraOrden.verDetalle());

        OrdenCompra segundaOrden = new OrdenCompra("Segunda orden de compra");
        Cliente segundoCliente = new Cliente("Kelito", "365");
        segundaOrden.setCliente(segundoCliente);
        segundaOrden.setFecha(new Date(2024, Calendar.JANUARY, 25));
        Producto[] productos2 = new Producto[4];
        Producto prod21 = new Producto("BIC", "Bolígrafo", 1);
        Producto prod22 = new Producto("Milán", "Lápiz", 2);
        Producto prod23 = new Producto("O'reilley", "Libro", 30);
        Producto prod24 = new Producto("Pull & Bear", "Camiseta", 20);
        productos2[0] = prod21;
        productos2[1] = prod22;
        productos2[2] = prod23;
        productos2[3] = prod24;
        for (Producto producto : productos2) {
            segundaOrden.addProducto(producto);
        }

        System.out.println("------------------------------");

        System.out.println(segundaOrden.verDetalle());

    }
}
