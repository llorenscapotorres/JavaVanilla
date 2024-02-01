public class EjemploArregloForOrdenamientoBurbuja {

    public static void sortBurbujaNumeros(Integer[] arreglo){

        int total = arreglo.length;

        int contador = 0;

        for (int i = 0; i < total - 1; i++){
            for (int j = 0; j < total - 1 - i; j++){
                if (arreglo[j+1] < arreglo[j]){
                    int auxiliar = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = auxiliar;
                }
            }
        }

        System.out.println("contador = " + contador);

    }

    public static void main(String[] args) {

        String[] productos = {"Kingston Pendrive 64GB", "Samsung Galaxy",
        "Disco Duro SSD Samsung Exterior, Asus NoteBook", "MacBook Air",
        "Chromecast 4ta generación", "Bicicleta Oxford"};

        int total = productos.length;

        for (int i = 0; i < total - 1; i++){
            for (int j = 0; j < total - 1 - i; j++){
                if (productos[j+1].compareTo(productos[j]) < 0){
                    String auxiliar = productos[j];
                    productos[j] = productos[j+1];
                    productos[j+1] = auxiliar;
                }
            }
        }

        System.out.println("----- Usando for -----");
        for (int i = 0; i < total; i++){
            System.out.println("para indice " + i + " : " + productos[i]);
        }

    }
}
