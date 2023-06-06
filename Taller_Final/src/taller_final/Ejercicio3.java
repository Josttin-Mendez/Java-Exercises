package taller_final;

import java.util.ArrayList;
import java.util.Scanner;

    public class Ejercicio3 {
    
     /*Ejercicio de Listas:Diseña un programa que simule una lista de tareas pendientes. 
     El programa debe permitir al usuario agregar tareas, eliminar tareas y mostrar todas 
     las tareas pendientes.
     */
           
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> listaTareas = new ArrayList<String>();

        int opcion = 0;
        //Menú
        while (opcion != 5) {
            System.out.println("-------- Lista de Tareas --------");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Eliminar tarea");
            System.out.println("3. Editar tarea");
            System.out.println("4. Mostrar tareas pendientes");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = sc.nextInt();
        //Opciones
            switch (opcion) {
                case 1:
                    sc.nextLine(); // Ignora el salto de línea 
                    System.out.print("Ingrese la nueva tarea: ");
                    String nuevaTarea = sc.nextLine();
                    listaTareas.add(nuevaTarea);
                    System.out.println("");
                    System.out.println("Tarea agregada exitosamente.");
                    System.out.println("");
                    break;

                case 2:
                    sc.nextLine(); // Ignora el salto de línea 
                    System.out.print("Ingrese la descripción de la tarea a eliminar: ");
                    String tareaEliminar = sc.nextLine();
                    if (listaTareas.contains(tareaEliminar)) {
                        listaTareas.remove(tareaEliminar);
                        System.out.println("Tarea \"" + tareaEliminar + "\" eliminada.");
                    } else {
                        System.out.println("");
                        System.out.println("La tarea no existe en la lista.");
                        System.out.println("");
                    }
                    break;

                case 3:
                    sc.nextLine(); // Ignora el salto de línea 
                    System.out.print("Ingrese la descripción de la tarea a editar: ");
                    String tareaEditar = sc.nextLine();
                    if (listaTareas.contains(tareaEditar)) {
                        System.out.print("Ingrese la nueva descripción de la tarea: ");
                        String nuevaDescripcion = sc.nextLine();
                        int indice = listaTareas.indexOf(tareaEditar);
                        listaTareas.set(indice, nuevaDescripcion);
                        System.out.println("");
                        System.out.println("Tarea editada exitosamente.");
                        System.out.println("");
                    } else {
                        System.out.println("");
                        System.out.println("La tarea no existe en la lista.");
                        System.out.println("");
                    }
                    break;

                case 4:
                    System.out.println("");
                    System.out.println("Tareas pendientes:");
                    System.out.println("");
                    if (listaTareas.isEmpty()) {
                        System.out.println("");
                        System.out.println("No hay tareas pendientes.");
                        System.out.println("");
                    } else {
                        for (int i = 0; i < listaTareas.size(); i++) {
                            System.out.println((i + 1) + ". " + listaTareas.get(i));
                        }
                    }
                    break;

                case 5:
                    System.out.println("");
                    System.out.println("¡Hasta luego!");
                    break;

                default:
                    System.out.println("");
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
            }
            System.out.println();
        }

        sc.close();
    }
}
