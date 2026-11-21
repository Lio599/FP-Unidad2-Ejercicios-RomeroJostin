/*
 * Sesión: S10 - Argumentos y parámetros
 * Ejercicio 03: Aplicar un descuento
 * Enunciado: Modificar todos los precios del arreglo y mostrar antes y después.
 * Autor: Romero Jostin
 * Fecha: 20/11/2026
 */
import java.util.Arrays;

public class Ej03_AplicarDescuento {

    public static void aplicarDescuento(double[] precios, double pct) {
        for (int i = 0; i < precios.length; i++) {
            precios[i] = precios[i] - (precios[i] * pct / 100);
        }
    }

    public static void main(String[] args) {
        double[] precios = {450, 850, 50, 90};

        System.out.println("Precio orginal: " + Arrays.toString(precios));

        // Aqui aplico un descuento del 10 por ciento a todos los precios.
        aplicarDescuento(precios, 10);

        System.out.println("Precio de oferta: " + Arrays.toString(precios));
    }
}
