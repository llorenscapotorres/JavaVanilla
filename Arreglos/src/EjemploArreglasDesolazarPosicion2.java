import java.util.Scanner;

public class EjemploArreglasDesolazarPosicion2 {
    public static void main(String[] args) {

        int[] a = new int[10];
        int elemento, posicion;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < a.length-1; i++){
            a[i] = scanner.nextInt();
        }

        System.out.println();

        System.out.println("Nuevo elemento:");
        elemento = scanner.nextInt();

        System.out.println("Posición donde agregar (de 0 a 9)");
        posicion = scanner.nextInt();

        for (int i = a.length - 2; i >= posicion; i--){
            a[i+1] = a[i];
        }

        a[posicion] = elemento;

        System.out.println("El arreglo:");
        for (int i : a){
            System.out.println(i);
        }

    }
}
