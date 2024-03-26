package EjerciciosPoli;

import java.util.Scanner;

/**
 * B02 - Subgrupo 09
 * Estudiantes
 * - Nombre: Juan Diego Zambrano Benavides
 * - Nombre: Rubiel Stiven Rodríguez Chalarca
 * - Nombre: José Daniel Velandia Cruz
 * - Nombre: Jhody Smith Cuchala Bambague
 */

public class Ejercicios {

    /**
     * Desarrolle una solución que permita leer por consola 2 arreglos a=[], b=[] de números
     * enteros y retorne la intersección de estos dos arreglos. La solución debe solicitar por
     * consola el tamaño de ambos arreglos y debe permitir el ingreso de los valores para cada
     * uno de ellos; la salida de este programa deberá mostrar la intersección de los 2 arreglos,
     * si no existe intersección el programa debe indicarlo, tenga en cuenta que se debe validar
     * los valores ingresados por el usuario.
     */
    public void punto1() {
        System.out.println("Punto 1");
    }

    /**
     * Desarrolle una solución que lea un arreglo de 10 números enteros e identifique el
     * segundo número más grande, La solución debe solicitar por consola el listado de los 10
     * números, la salida de este programa debe mostrar el 2 número más grande del arreglo.
     */
    public void punto2() {
        System.out.println("Punto 2");
    }


    /**
     * Desarrolle una solución que permita leer por consola un arreglo de Strings y que
     * retorne la cadena más larga ingresada por el usuario, la solución debe solicitar al usuario
     * el tamaño del arreglo y el ingreso de cada uno de los Strings, la salida de este programa
     * debe indicar el índice de donde se encuentra el String más largo y la palabra.
     */
    public void punto3() {
        System.out.println("Punto 3");
    }
}

class Principal {
    public static void main(String[] args) {

        Ejercicios ejercicios = new Ejercicios();

        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.print("Ingrese el número del método que desea ejecutar (1, 2, 3) o 'x' para salir: ");
            String entrada = scanner.nextLine();

            switch (entrada) {
                case "1":
                    ejercicios.punto1();
                    break;
                case "2":
                    ejercicios.punto2();
                    break;
                case "3":
                    ejercicios.punto3();
                    break;
                case "x":
                    salir = true;
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }
        scanner.close();
    }
}

