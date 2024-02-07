package org.llorenscapo.poosobrecarga;

public class Calculadora {

    public int sumar(int a, int b){
        return a + b;
    }

    public int sumar(int... argumentos){
        int total = 0;
        for (int i: argumentos){
            total += i;
        }
        return total;
    }

    public float sumar(float a, int... argumentos){
        float total = a;
        for (int i: argumentos){
            total += i;
        }
        return total;
    }

    public float sumar(float a, float b){
        return a + b;
    }

    public float sumar(int a, float b){
        return a + b;
    }

    public float sumar(float a, int b){
        return a + b;
    }

    public double sumar(double a, double b){
        return a + b;
    }

    public int sumar(String a, String b){
        int resultado;
        try {
            return Integer.parseInt(a) + Integer.parseInt(b);
        } catch (NumberFormatException error){
            resultado = 0;
        }
        return resultado;
    }

    public int sumar(int a, int b, int c){
        return a + b + c;
    }

}
