package org.llorenscapo.proyectocatalogo;

public class Main {
    public static void main(String[] args) {

        Producto[] productos = new Producto[6];

        productos[0] = new IPhone(299000, "Apple", "3G", "Negro");
        productos[1] = new IPhone(399000, "Apple", "4G", "Blanco");
        productos[2] = new TvLcd(340000, "Sony", 40);
        productos[3] = new Libro(18000, "Eric Gamma", "Elementos reusables POO", "Alguna...");
        productos[4] = new Libro(14000, "Martin Fowler", "UML Gota a Gota", "Alguna...");
        productos[5] = new Comic(5000, "Pepo", "Condorito", "Alguna...", "Condorito");

        for (Producto producto: productos){

            System.out.println("Tipo de: " + producto.getClass().getName());
            System.out.println(" - ");
            System.out.println("Precio: " + producto.getPrecio());
            System.out.println(" - ");
            System.out.println("Precio final: " + producto.getPrecioVenta());

            if (producto instanceof Electronico){
                System.out.println(" - ");
                System.out.println("Fabricante: " + ((Electronico) producto).getFabricante());

                if (producto instanceof IPhone){
                    System.out.println(" - ");
                    System.out.println("Modelo: " + ((IPhone) producto).getModelo());
                    System.out.println(" - ");
                    System.out.println("Color: " + ((IPhone) producto).getColor());
                }

                if (producto instanceof TvLcd){
                    System.out.println(" - ");
                    System.out.println("Pulgadas: " + ((TvLcd) producto).getPulgadas());
                }
            }

            if (producto instanceof Libro){
                System.out.println(" - ");
                System.out.println("Titulo: " + ((Libro) producto).getTitulo());
                System.out.println(" - ");
                System.out.println("Autor: " + ((Libro) producto).getAutor());

                if (producto instanceof Comic){
                    System.out.println(" - ");
                    System.out.println("Personaje: " + ((Comic) producto).getPersonaje());
                }
            }

            System.out.println("===================================");

        }

    }
}
