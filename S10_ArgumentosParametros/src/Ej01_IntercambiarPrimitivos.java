/*
 * Sesión: S10 - Argumentos y parámetros
 * Ejercicio 01: Intercambiar variables enteras
 * Enunciado: Intentar intercambiar dos int y explicar por qué no cambia main.
 * Autor: Romero Jostin
 * Fecha: 20/11/2026
 */
public class Ej01_IntercambiarPrimitivos {

    public static void intercambiar(int a, int b) {
        int aux = a;
        a = b;
        b = aux;
    }

    public static void main(String[] args) {
        int a = 6;
        int b = 9;

        intercambiar(a, b);
        System.out.println("Despues en main: a = " + a + ", b = " + b);
    }
}
// Respuesta: en main no se intercambian los valores por que el metodo recibe copias de a y b, por eso solo cambian dentro del metodo.
