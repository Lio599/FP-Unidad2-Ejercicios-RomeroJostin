/*
 * Sesión: S12 - Métodos de biblioteca
 * Ejercicio 05: Generar un código
 * Enunciado: Crear un código de tres letras y tres dígitos al azar.
 * Autor: Romero Jostin
 * Fecha: 20/11/2026
 */
import java.util.Random;

public class Ej05_GenerarCodigo {

    public static String generarCodigo() {
        Random azar = new Random();
        String codigo = "";

        // Primero agrego tres letras mayusculas al azar.
        for (int i = 0; i < 3; i++) {
            char letra = (char) ('A' + azar.nextInt(26));
            codigo = codigo + letra;
        }

        // Despues agrego tres digitos del 0 al 9.
        for (int i = 0; i < 3; i++) {
            int digito = azar.nextInt(10);
            codigo = codigo + digito;
        }

        return codigo;
    }

    public static void main(String[] args) {
        System.out.println("Codigo generado: " + generarCodigo());
    }
}
