import java.util.Arrays;
import java.util.Collections;

public class EjemploArregloFor {
    public static void main(String[] args) {

        String[] productos = new String[7];
        int total = productos.length;

        productos[0] = "Pendrive";
        productos[1] = "SG";
        productos[2] = "Disco Duro";
        productos[3] = "Asus";
        productos[4] = "McBook";
        productos[5] = "Chromecast";
        productos[6] = "Bicicleta Oxford";

        System.out.println("----- Usando for -----");

        for (int i = 0; i < total; i++){
            System.out.println("para indice " + i + " : " + productos[i]);
        }

        System.out.println("----- Usando foreach -----");

        for (String prod: productos){
            System.out.println("prod = " + prod);
        }

        System.out.println("----- Usando while -----");

        int i = 0;
        while (i < total){
            System.out.println("para indice " + i + " : " + productos[i]);
            i++;
        }

        System.out.println("----- Usando do while -----");

        int j = 0;
        do {
            System.out.println("para indice " + j + " : " + productos[j]);
            j++;
        } while (j < total);

        for (int s = 0; s < total/2; s++){
            String actual = productos[s];
            String inverso = productos[total-1-s];
            productos[s] = inverso;
            productos[total-1-s] = actual;
        }

        for (String prod: productos){
            System.out.println("prod = " + prod);
        }

        System.out.println("----- Otra forma de reordenar -----");

        Collections.reverse(Arrays.asList(productos));

    }
}
