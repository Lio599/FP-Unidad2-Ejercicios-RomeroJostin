/*
 * Sesión: S12 - Métodos de biblioteca
 * Ejercicio 03: Validar una contraseña
 * Enunciado: Comprobar al menos ocho caracteres, una mayúscula y un dígito.
 * Autor: Romero Jostin
 * Fecha: 20/11/2026
 */
import java.util.Scanner;

public class Ej03_ValidarContrasena {

    public static boolean validar(String contrasena) {
        if (contrasena.length() < 8) {
            return false;
        }

        boolean tieneMayuscula = false;
        boolean tieneDigito = false;

        for (int i = 0; i < contrasena.length(); i++) {
            char letra = contrasena.charAt(i);

            if (Character.isUpperCase(letra)) {
                tieneMayuscula = true;
            }

            if (Character.isDigit(letra)) {
                tieneDigito = true;
            }
        }

        return tieneMayuscula && tieneDigito;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese una contrasena: ");
        String contrasena = entrada.nextLine();

        if (validar(contrasena)) {
            System.out.println("La contrasena es valida");
        } else {
            System.out.println("La contrasena no es valida, debe contener al menos ocho caracteres, una mayúscula y un dígito.");
        }

        entrada.close();
    }
}
// La contrasena necesita 8 caracteres, una mayuscula y un numero.
