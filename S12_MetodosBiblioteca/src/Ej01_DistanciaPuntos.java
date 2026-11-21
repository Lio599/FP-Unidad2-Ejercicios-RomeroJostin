/*
 * Sesión: S12 - Métodos de biblioteca
 * Ejercicio 01: Distancia entre dos puntos
 * Enunciado: Calcular distancia usando Math.sqrt y Math.pow.
 * Autor: Romero Jostin
 * Fecha: 20/11/2026
 */
public class Ej01_DistanciaPuntos {

    public static double distancia(double x1, double y1, double x2, double y2) {
        double diferenciaX = x2 - x1;
        double diferenciaY = y2 - y1;

        // Math.pow eleva al cuadrado y Math.sqrt calcula la raiz.
        return Math.sqrt(Math.pow(diferenciaX, 2) + Math.pow(diferenciaY, 2));
    }

    public static void main(String[] args) {
        double resultado = distancia(1, 2, 4, 6);
        System.out.println("Distancia entre los puntos X, e Y: " + resultado);
    }
}
