/*
 * Sesión: S11 - Ámbito de las variables
 * Ejercicio 04: Reescribir sin atributos static
 * Enunciado: Cambiar tres atributos static por parámetros y return.
 * Autor: Romero Jostin
 * Fecha: 20/11/2026
 */
public class Ej04_ReescribirSinStatic {

    /*
     Version original del Ej03_TrazaContadorStatic tenia tres atributos static compartidos:
     
        static int llamadas = 0;
        static int suma = 0;
        static int cantidad = 3;
      
     La nueva version deja estas variables dentro de main.
     */

    // Recibo un numero y devuelvo su cuadrado.
    public static int cuadrado(int n) {
        int resultado = n * n;
        return resultado;
    }

    // Recibo la suma anterior y el nuevo valor que quiero agregar.
    public static int sumar(int suma, int valor) {
        return suma + valor;
    }

    public static void main(String[] args) {
        // Estas tres variables ya no son atributos static.
        int llamadas = 0;
        int suma = 0;
        int cantidad = 3;

        for (int i = 1; i <= cantidad; i++) {
            int resultado = cuadrado(i);
            suma = sumar(suma, resultado);
            llamadas++;
        }

        System.out.println("Suma de cuadrados: " + suma);
        System.out.println("Llamadas a cuadrado: " + llamadas);
    }
}
