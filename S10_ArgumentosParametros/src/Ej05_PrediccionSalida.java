/*
 * Sesión: S10 - Argumentos y parámetros
 * Ejercicio 05: Predicción de salida
 * Enunciado: Predecir la salida de tres llamadas y luego comprobarla al ejecutar.
 * Autor: Romero Jostin
 * Fecha: 20/11/2026
 */
public class Ej05_PrediccionSalida {

    public static void cambiarNumero(int numero) {
        numero = numero + 5;
        System.out.println("Llamada 1: " + numero);
    }

    public static void cambiarArreglo(int[] datos) {
        datos[0] = datos[0] + 5;
        System.out.println("Llamada 2: " + datos[0]);
    }

    public static void mostrar(int numero, int[] datos) {
        System.out.println("Llamada 3: numero = " + numero + ", dato = " + datos[0]);
    }

    public static void main(String[] args) {
        int numero = 10;
        int[] datos = {10, 20};

        // Mi prediccion antes de ejecutar:
        // Llamada 1: 15
        // Llamada 2: 15
        // Llamada 3: numero = 10, dato = 15
        // El numero original sigue igual, pero el arreglo si cambia.

        cambiarNumero(numero);
        cambiarArreglo(datos);
        mostrar(numero, datos);
    }
}
