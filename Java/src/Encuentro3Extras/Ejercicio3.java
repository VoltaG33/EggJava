/*
 Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal. 
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
 */
package Encuentro3Extras;

import java.util.Scanner;


public class Ejercicio3 {

    public static void main(String[] args) {
          Scanner leer = new Scanner(System.in);
        String letra;
        System.out.println("Ingrese una vocal");
        letra = leer.nextLine();

        if (letra.equals("A") || letra.equals("E") || letra.equals("I") || letra.equals("O") || letra.equals("U")) {
            System.out.println("Es una vocal");
        } else {
            System.out.println("No es una vocal");
        }
    }
    
}
