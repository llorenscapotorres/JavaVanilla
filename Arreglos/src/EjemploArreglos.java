import java.util.Arrays;

public class EjemploArreglos {
    public static void main(String[] args) {

        String[] productos = new String[7];

        productos[0] = "Pendrive";
        productos[1] = "SG";
        productos[2] = "Disco Duro";
        productos[3] = "Asus";
        productos[4] = "McBook";
        productos[5] = "Chromecast";
        productos[6] = "Bicicleta Oxford";

        Arrays.sort(productos);

        String prod1 = productos[0];
        String prod2 = productos[1];
        String prod3 = productos[2];
        String prod4 = productos[3];
        String prod5 = productos[4];
        String prod6 = productos[5];
        String prod7 = productos[6];

        int[] numeros = new int[4];

        numeros[0] = 13;
        numeros[1] = -2;
        numeros[2] = 3;
        numeros[3] = 99;

        Arrays.sort(numeros);

        int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];
        int l = numeros[3];

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);
        System.out.println("numeros = " + numeros);

    }
}
