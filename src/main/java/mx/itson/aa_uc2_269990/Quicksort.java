/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.aa_uc2_269990;

import java.util.Arrays;

/**
 *
 * @author Daniel
 */
public class Quicksort {
    
    public static void quicksort(int[] arr, int inicio, int fin) { // arreglo inicial: [4, 2, 4, 3, 1, 4]

                    //complejidad temp // conteo

    if (inicio < fin) { // 1 // verifica que el subarreglo tenga mas de un elemento

        int pivoteIndice = particion(arr, inicio, fin); // 1 // obtiene el indice del pivote ya en su posicion correcta

        System.out.println("El indice del pivote es: " + pivoteIndice + ". El arreglo actualmente es: " + Arrays.toString(arr)); // imprime estado actual

        // Sub arreglo Izquierdo
        System.out.println("Izquierda");                    // imprime indicador de llamada izquierda
        quicksort(arr, inicio, pivoteIndice - 1);           // 1 // ordena recursivamente la mitad izquierda del pivote

        // Sub arreglo Derecho
        System.out.println("Derecha");                      // imprime indicador de llamada derecha
        quicksort(arr, pivoteIndice + 1, fin);              // 1 // ordena recursivamente la mitad derecha del pivote
    }
    // Complejidad temporal: O(n log n) promedio, O(n^2) peor caso
    // Arreglo inicial:          [4, 2, 4, 3, 1, 4]
    // Tras primera particion:   [2, 3, 1, 4, 4, 4]  pivote=4 en indice 3
    // Tras partir izquierda:    [1, 2, 3, 4, 4, 4]  pivote=1 en indice 0
    // Arreglo final:            [1, 2, 3, 4, 4, 4]
}

    public static int particion(int[] arr, int inicio, int fin) { // 1 // divide el arreglo usando el ultimo elemento como pivote

        int pivote = arr[fin]; // 1 // toma el ultimo elemento como pivote: pivote=arr[fin]

        int i = inicio - 1; // 1 // i apunta a la posicion del ultimo elemento menor que el pivote

        for (int j = inicio; j < fin; j++) { // 1 + n + n-1 // recorre el arreglo comparando cada elemento con el pivote

            if (arr[j] < pivote) { // 1 // si el elemento actual es menor que el pivote
                i++;               // 1 // avanza i para marcar nueva posicion de elemento menor

                int temp = arr[i]; // 1 // guarda elemento en posicion i
                arr[i] = arr[j];   // 1 // coloca elemento menor en la zona izquierda
                arr[j] = temp;     // 1 // completa el intercambio
            }
        }

    int temp = arr[i + 1];  // 1 // guarda el elemento que esta donde ira el pivote
    arr[i + 1] = arr[fin];  // 1 // coloca el pivote en su posicion correcta
    arr[fin] = temp;        // 1 // mueve el elemento desplazado al final

    return i + 1; // 1 // retorna el indice donde quedo el pivote
    // 1 + (2n) + (n-1) * [4]
}
    
}
