/*
 * Sesión: S11 - Ámbito de las variables
 * Ejercicio 01: Marcar ámbitos
 * Enunciado: Reconocer variables locales, de bloque y static.
 * Autor: Romero Jostin
 * Fecha: 20/11/2026
 */
public class Ej01_MarcarAmbito {

    // STATIC: cuenta todas las veces que se llama al metodo.
    static int veces = 0;

    // STATIC: guarda el ultimo cuadrado calculado.
    static int ultimoCuadrado = 0;

    public static int cuadrado(int n) {
        // LOCAL: n solo se usa dentro de cuadrado.
        veces++;

        // LOCAL: resultado solo existe dentro de este metodo.
        int resultado = n * n;
        ultimoCuadrado = resultado;
        return resultado;
    }

    public static void main(String[] args) {
        // LOCAL: suma pertenece al metodo main.
        int suma = 0;

        // LOCAL: cantidad indica cuantas vueltas haremos.
        int cantidad = 3;

        // DE BLOQUE: i solo existe dentro del for.
        for (int i = 1; i <= cantidad; i++) {
            // DE BLOQUE: actual se usa solo dentro del for.
            int actual = cuadrado(i);
            suma = suma + actual;

            if (actual > 5) {
                // DE BLOQUE: aviso solo existe dentro de este if.
                String aviso = "Encontre un cuadrado mayor que 5";
                System.out.println(aviso);
            }
        }

        System.out.println("Suma de cuadrados: " + suma);
        System.out.println("Llamadas a cuadrado: " + veces);
        System.out.println("Ultimo cuadrado: " + ultimoCuadrado);
    }
}
