/*
 * Sesión: S12 - Métodos de biblioteca
 * Ejercicio 02: Dados que suman siete
 * Enunciado: Lanzar dos dados 1000 veces con Random y mostrar cantidad y porcentaje.
 * Autor: Romero Jostin
 * Fecha: 20/11/2026
 */
import java.util.Random;

public class Ej02_DadosSuma7 {

    public static void lanzarDados(int veces) {
        Random azar = new Random();
        int sumanSiete = 0;

        for (int i = 0; i < veces; i++) {
            // Cada dado puede salir del 1 al 6.
            int dado1 = azar.nextInt(6) + 1;
            int dado2 = azar.nextInt(6) + 1;

            if (dado1 + dado2 == 7) {
                sumanSiete++;
            }
        }

        double porcentaje = sumanSiete * 100.0 / veces;

        System.out.println("Numero de veces: " + veces);
        System.out.println("Las veces en que sumaron 7: " + sumanSiete);
        System.out.printf("Porcentaje: %.2f%%%n", porcentaje);
    }

    public static void main(String[] args) {
        lanzarDados(1000);
    }
}
