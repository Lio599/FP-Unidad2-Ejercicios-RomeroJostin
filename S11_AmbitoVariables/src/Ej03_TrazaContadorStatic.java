/*
 * Sesión: S11 - Ámbito de las variables
 * Ejercicio 03: Traza de un contador static
 * Enunciado: Seguir las variables de un contador llamado desde un for.
 * Autor: Romero Jostin
 * Fecha: 20/11/2026
 */
public class Ej03_TrazaContadorStatic {

    // STATIC: este contador no vuelve a cero cuando termina cuadrado.
    static int llamadas = 0;

    public static int cuadrado(int n) {
        // L2: cada llamada aumenta el contador.
        llamadas++;
        int resultado = n * n;
        return resultado;
    }

    public static void main(String[] args) {
        // L1: empiezo con la suma y el ultimo resultado en cero.
        int suma = 0;
        int ultimoCuadrado = 0;

        for (int i = 1; i <= 3; i++) {
            // L3: recibo el cuadrado de cada numero.
            int actual = cuadrado(i);

            // L4: actualizo la suma y guardo el ultimo cuadrado.
            suma = suma + actual;
            ultimoCuadrado = actual;
        }

        // L5: ya terminaron las tres vueltas del for.
        System.out.println("Suma de cuadrados: " + suma);
        System.out.println("Llamadas a cuadrado: " + llamadas);
        System.out.println("Ultimo cuadrado: " + ultimoCuadrado);
    }

    /*
     Al terminar cada llamada, n y resultado dejan de existir.
     Despues del for, tampoco existen i ni actual.
     */
}
