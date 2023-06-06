package taller_final;

import java.util.Scanner;

    public class Ejercicio1 {
    
    /*Ejercicio de Vectores: Diseña un programa que solicite al usuario ingresar 
    un vector de números enteros y luego muestre la suma de todos los elementos.
    */
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicita el tamaño del vector
        System.out.print("Ingrese el tamaño del vector: ");
        int tamaño = sc.nextInt();

        // Crea un vector con el tamaño especificado
        int[] vector = new int[tamaño];

        // Solicita ingresar los elementos del vector
        System.out.println("Ingrese los elementos del vector:");
        for (int i = 0; i < tamaño; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector[i] = sc.nextInt();
        }

        // Calcula la suma de los elementos del vector
        int suma = 0;
        for (int i = 0; i < tamaño; i++) {
            suma += vector[i];
        }

        // Muestra la suma de los elementos del vector 
        System.out.println("La suma de los elementos del vector es: " + suma);

        sc.close();
    }
}
