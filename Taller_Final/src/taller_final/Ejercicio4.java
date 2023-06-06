package taller_final;

import java.util.Scanner;
import java.util.Stack;

    public class Ejercicio4 {

     /* Ejercicio de Pilas: Diseña un programa que verifique si una expresión matemática 
     con paréntesis está balanceada.Es decir, si los paréntesis de apertura y cierre están 
     correctamente emparejados.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        // Menú
        while (!salir) {
            System.out.println("-------- Expresiones --------");
            System.out.println();
            System.out.println("1. Verificar expresión");
            System.out.println("2. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            // Opciones
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la expresión matemática: ");
                    String expresion = scanner.nextLine();

                    if (expresion.matches(".*[a-zA-Z]+.*")) {  // Comprueba si la expresión contiene letras
                        System.out.println("La expresión contiene letras. Debe ingresar una expresión matemática válida.");
                    } else if (verificarBalance(expresion)) {
                        System.out.println("La expresión está balanceada.");
                    } else {
                        System.out.println("La expresión NO está balanceada.");
                    }
                    break;
                case 2:
                    salir = true;
                    break;
                default:
                    System.out.println("");
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
            System.out.println();
        }

        scanner.close();
    }

    public static boolean verificarBalance(String expresion) {
        Stack<Character> pila = new Stack<>();

        for (char caracter : expresion.toCharArray()) {
            if (caracter == '(') {  // Si se encuentra un paréntesis de apertura, se agrega a la pila.
                pila.push(caracter);
            } else if (caracter == ')') {  // Si se encuentra un paréntesis de cierre
                if (pila.isEmpty() || pila.peek() != '(') {  // Si la pila está vacía o el elemento en la parte superior de la pila no es un paréntesis de apertura correspondiente
                    return false;  // La expresión no está balanceada, se devuelve false.
                }
                pila.pop();  // Se quita el paréntesis de apertura correspondiente de la pila.
            }
        }

        return pila.isEmpty();  // Si la pila está vacía al final, la expresión está balanceada; de lo contrario, no lo está.
    }
}

