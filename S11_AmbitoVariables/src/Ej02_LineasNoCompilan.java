/*
 * Sesión: S11 - Ámbito de las variables
 * Ejercicio 02: Líneas que no compilan
 * Enunciado: Comentar los errores de ámbito y explicar su causa.
 * Autor: Romero Jostin
 * Fecha: 20/11/2026
 */
public class Ej02_LineasNoCompilan {

    // STATIC: esta variable se comparte dentro de la clase.
    static int llamadas = 0;

    public static int cuadrado(int n) {
        llamadas++;

        // LOCAL: resultado solo existe en cuadrado.
        int resultado = n * n;
        return resultado;
    }

    public static void main(String[] args) {
        int suma = 0;

        // DE BLOQUE: i solo se puede usar en el for.
        for (int i = 1; i <= 3; i++) {
            suma = suma + cuadrado(i);
        }

        // "ERROR: cannot find symbol".
        // La i ya no existe cuando termina el for.
        // System.out.println(i);

        // ERROR: cannot find symbol: el resultado pertenece al metodo cuadrado, no a main.
        // System.out.println(resultado);

        // ERROR: variable suma is already defined in method main(String[]): quiere decir que no puedo declarar otra suma en el mismo bloque de main.
        // int suma = 100;

        int sinInicializar;

        // ERROR: variable sinInicializar might not have been initialized: dice que necesita recibir un valor antes de imprimirla.
        // System.out.println(sinInicializar);

        if (suma > 0) {
            // DE BLOQUE: mensaje solo existe dentro del if.
            String mensaje = "La suma es positiva";
            System.out.println(mensaje);
        }

        // ERROR: cannot find symbol: quiere decir que se declaró dentro del if y aqui ya no existe.
        // System.out.println(mensaje);

        sinInicializar = 10;
        System.out.println("Suma de cuadrados: " + suma);
        System.out.println("Llamadas a cuadrado: " + llamadas);
        System.out.println("Variable con valor: " + sinInicializar);
    }
}
