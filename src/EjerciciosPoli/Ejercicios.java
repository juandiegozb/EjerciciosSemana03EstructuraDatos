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
        Scanner scanner = new Scanner(System.in);

        // designar el tamaño de los arreglos
        System.out.println("Ingrese el tamaño del  arreglo A:");
        int tamanioA = scanner.nextInt();
        System.out.println("Ingrese el tamaño del  arreglo B:");
        int tamanioB = scanner.nextInt();

        // Declarar los arreglos
        int[] a = new int[tamanioA];
        int[] b = new int[tamanioB];

        // dar  los valores del primer arreglo
        System.out.println("Ingrese los valores del  arreglo A:");
        for (int i = 0; i < tamanioA; i++) {
            a[i] = scanner.nextInt();
        }

        // indicar los valores del segundo arreglo
        System.out.println("Ingrese los valores del  arreglo B:");
        for (int i = 0; i < tamanioB; i++) {
            b[i] = scanner.nextInt();
        }

        // Encontrar la intersección de los dos arreglos
        int[] interseccion = new int[tamanioA];
        int indiceInterseccion = 0;
        for (int i = 0; i < tamanioA; i++) {
            for (int j = 0; j < tamanioB; j++) {
                if (a[i] == b[j]) {
                    interseccion[indiceInterseccion++] = a[i];
                }
            }
        }

        // Imprimir la intersección de los arreglos si hay
        if (indiceInterseccion > 0) {
            System.out.println("Intersección de los dos arreglos:");
            for (int i = 0; i < indiceInterseccion; i++) {
                System.out.print(interseccion[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("No hay intersección entre los dos arreglos.");
        }
    }

    /**
     * Desarrolle una solución que lea un arreglo de 10 números enteros e identifique el
     * segundo número más grande, La solución debe solicitar por consola el listado de los 10
     * números, la salida de este programa debe mostrar el 2 número más grande del arreglo.
     */
    public void punto2() {
        System.out.println("Punto 2");
        Scanner scanner = new Scanner(System.in);

        
        int[] numeros = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

      
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int num : numeros) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2 && num != max1) {
                max2 = num;
            }
        }

      
        System.out.println("El segundo número más grande es: " + max2);

        scanner.close();
        
    }


    /**
     * Desarrolle una solución que permita leer por consola un arreglo de Strings y que
     * retorne la cadena más larga ingresada por el usuario, la solución debe solicitar al usuario
     * el tamaño del arreglo y el ingreso de cada uno de los Strings, la salida de este programa
     * debe indicar el índice de donde se encuentra el String más largo y la palabra.
     */
    public void punto3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe el tamaño del arreglo: ");
        int size = scanner.nextInt();

        String[] array = new String[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Escribe la palabra " + (i + 1) + ": ");
            array[i] = scanner.next();
        }

        int indexMaxLenght = 0;
        int maxLenght = array[0].length();

        for (int i = 1; i < size; i++) {
            if (array[i].length() > maxLenght) {
                maxLenght = array[i].length();
                indexMaxLenght = i;
            }
        }

        System.out.println("La cadena más larga ingresada es: " + array[indexMaxLenght]);
        System.out.println("Se encuentra en el índice: " + indexMaxLenght);
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

