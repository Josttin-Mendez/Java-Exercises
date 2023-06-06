package taller_final;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

    public class Ejercicio5 {
        
        /*Ejercicio de Colas: Diseña un programa que simule una fila de un supermercado. 
        El programa debe permitir agregar clientes a la fila y atenderlos en orden, 
        mostrando el nombre del cliente atendido.
        */

    public static void main(String[] args) {
        Queue<String> filaSupermercado = new LinkedList<>(); // Representa la fila del supermercado
        Scanner scanner = new Scanner(System.in);
        String nombreCliente;

        System.out.println("---Bienvenido al supermercado---");

        while (true) {
            System.out.println("\n---Menú---");
            System.out.println("1. Agregar cliente a la fila");
            System.out.println("2. Atender cliente");
            System.out.println("3. Salir");

            System.out.print("Ingrese una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del cliente: ");
                    nombreCliente = scanner.nextLine();
                    filaSupermercado.add(nombreCliente); // Agrega el nombre del cliente a la cola
                    System.out.println("");
                    System.out.println("El cliente " + nombreCliente + " ha sido agregado a la fila.");
                    break;
                  
                case 2:
                    if (!filaSupermercado.isEmpty()) {
                        String clienteAtendido = filaSupermercado.poll(); // Obtine y elimina al cliente que está al frente de la cola
                        System.out.println("");
                        System.out.println("Atendiendo al cliente: " + clienteAtendido);
                    } else {
                        System.out.println("");
                        System.out.println("No hay clientes en la fila.");
                        System.out.println("");
                    }
                    break;
                case 3:
                    System.out.println("");
                    System.out.println("¡Hasta luego!");
                    System.out.println("");
                    return; 
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
                    break;
            }
        }
    }
}
