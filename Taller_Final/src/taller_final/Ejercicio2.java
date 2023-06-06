package taller_final;

import java.util.Scanner;

    public class Ejercicio2 {
        
     /*Ejercicio de Matrices:Diseña un programa que solicite al usuario ingresar
     una matriz cuadrada de números enteros y luego muestre la suma de los elementos 
     en la diagonal principal.
     */
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicita el tamaño de la matriz
        System.out.print("Ingrese el tamaño de la matriz cuadrada: ");
        int tamaño = sc.nextInt();

        // Crea la matriz cuadrada con el tamaño digitado
        int[][] matriz = new int[tamaño][tamaño];

        // Solicita ingresar los elementos de la matriz
        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                System.out.print("Elemento [" + (i + 1) + "][" + (j + 1) + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        // Calcula la suma de los elementos en la diagonal principal
        int suma = 0;
        for (int i = 0; i < tamaño; i++) {
            suma += matriz[i][i];
        }

        // Muestra la suma de los elementos en la diagonal principal 
        System.out.println("La suma de los elementos en la diagonal principal es: " + suma);

        sc.close();
    }
}

