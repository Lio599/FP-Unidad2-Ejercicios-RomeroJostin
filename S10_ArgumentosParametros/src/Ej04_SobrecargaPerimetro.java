/*
 * Sesión: S10 - Argumentos y parámetros
 * Ejercicio 04: Sobrecarga de perímetro
 * Enunciado: Calcular el perímetro de un cuadrado y un rectangulo con el mismo nombre.
 * Autor: Romero Jostin
 * Fecha: 20/11/2026
 */
public class Ej04_SobrecargaPerimetro {

    // Este metodo es para el cuadrado porque solo recibe un lado.
    public static double perimetro(double lado) {
        return 4 * lado;
    }

    // Este metodo es para el rectangulo porque recibe dos lados.
    public static double perimetro(double a, double b) {
        return 2 *(a + b);
    }

    public static void main(String[] args) {
        System.out.println("Perimetro del cuadrado: " +perimetro(4));
        System.out.println("Perimetro del rectangulo: " +perimetro(5, 6));
    }
}
