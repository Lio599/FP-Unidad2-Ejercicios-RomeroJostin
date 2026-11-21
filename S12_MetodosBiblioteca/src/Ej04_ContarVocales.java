/*
 * Sesión: S12 - Métodos de biblioteca
 * Ejercicio 04: Contar vocales
 * Enunciado: Contar vocales de una frase utilizando String y Character.
 * Autor: Romero Jostin
 * Fecha: 20/11/2026
 */
import java.util.Scanner;

public class Ej04_ContarVocales {

    public static int contarVocales(String frase) {
        int total = 0;
        String vocales = "aeiouáéíóúü";

        for (int i = 0; i < frase.length(); i++) {
            // Con Character paso la letra a minuscula.
            char letra = Character.toLowerCase(frase.charAt(i));

            // Si la letra esta en vocales, aumento el contador.
            if (vocales.indexOf(letra) >= 0) {
                total++;
            }
        }

        return total;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escriba una frase: ");
        String frase = entrada.nextLine();

        System.out.println("Numero de vocales: " + contarVocales(frase));

        entrada.close();
    }
}
