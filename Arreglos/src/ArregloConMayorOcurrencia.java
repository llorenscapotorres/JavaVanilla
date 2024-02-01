import java.util.Scanner;

public class ArregloConMayorOcurrencia {
    public static void main(String[] args) {

        int[] a = new int[10];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < a.length; i++){
            System.out.print("Ingrese un número del 1 al 9: ");
            int num = scanner.nextInt();
            if (num < 1 || num > 9){
                System.err.println("ERROR, EL NÚMERO NO SE ENCUENTRA EN EL RANGO DEFINIDO");
                System.exit(-1);
            } else {
                a[i] = num;
            }
        }

        for (int i = 0; i < a.length - 1; i++){
            for (int j = 0; j < a.length - 1 -i; j++){
                if (a[j+1] < a[j]){
                    int aux = a[j];
                    a[j] = a[j+1];
                    a[j+1] = aux;
                }
            }
        }

        int contadorNumerosDiferentes = 1;

        for (int i = 0; i < a.length - 1; i++){
            if (a[i] != a[i+1]){
                contadorNumerosDiferentes++;
            }
        }

        int[] arregloPorNumeroDiferente = new int[contadorNumerosDiferentes];

        int contador = 1;
        int idx = 0;

        for (int i = 0; i < a.length - 1; i++){
            if (a[i] == a[i+1]){
                contador++;
            } else {
                arregloPorNumeroDiferente[idx++] = contador;
                contador = 1;
            }
        }

        int mayorOcurrencia = 0;

        for (int num : arregloPorNumeroDiferente){
            mayorOcurrencia = (num > mayorOcurrencia) ? num : mayorOcurrencia;
        }

        int idxMayorOcurrencia = 0;

        for (int i = 0; i < arregloPorNumeroDiferente.length; i++){
            if (arregloPorNumeroDiferente[i] == mayorOcurrencia){
                idxMayorOcurrencia = i;
                break;
            }
        }

        int idxArreglo = 0;
        int elementoMasRepetido;

        if (idxMayorOcurrencia != 0) {
            int contadorAuxiliar = 0;
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] != a[i+1]){
                    contadorAuxiliar++;
                    if (contadorAuxiliar == idxMayorOcurrencia){
                        idxArreglo = i + 1;
                        break;
                    }
                }
            }
        }

        elementoMasRepetido = a[idxArreglo];

        System.out.println("La mayor ocurrencias es: " + mayorOcurrencia);
        System.out.println("El elemento que más se repite es: " + elementoMasRepetido);

    }
}
