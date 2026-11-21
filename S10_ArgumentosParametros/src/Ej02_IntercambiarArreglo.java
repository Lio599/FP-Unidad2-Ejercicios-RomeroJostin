/*
 * Sesión: S10 - Argumentos y parámetros
 * Ejercicio 02: Intercambiar elementos del arreglo
 * Enunciado: Intercambiar dos posiciones con int[] y explicar por qué sí funciona.
 * Autor: Romero Jostin
 * Fecha: 20/11/2026
 */
import java.util.Arrays;

public class Ej02_IntercambiarArreglo {

    public static void intercambiar(int[] v, int i, int j) {
        int aux = v[i];
        v[i] = v[j];
        v[j] = aux;
    }

    public static void main(String[] args) {
        int[] numeros = {9, 6};

        System.out.println("Antes: " + Arrays.toString(numeros));
        intercambiar(numeros, 0, 1);
        System.out.println("Despues: " + Arrays.toString(numeros));
    }
}
// Ahora si cambian las posiciones del arreglo, por que el metodo trabaja con el mismo arreglo que se creo en main.
