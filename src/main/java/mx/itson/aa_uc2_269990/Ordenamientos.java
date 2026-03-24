/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mx.itson.aa_uc2_269990;

/**
 *
 * @author Daniel
 */
public class Ordenamientos {

    public static void BubbleSort(int[] arreglo) { // arreglo inicial: [10, 4, 24, 3, 8, 12]

                        //complejidad temp // conteo

        int n = arreglo.length; // 1 // n = 6

        for (int i = 0; i < n - 1; i++) { // 1 + n + n-1 // i=0:[10,4,24,3,8,12] i=1:[4,10,3,8,12,24] i=2:[4,3,8,10,12,24] i=3:[3,4,8,10,12,24] i=4:[3,4,8,10,12,24]

            for (int j = 0; j < n - i - 1; j++) { // 1 + n + n-1 // j=0:10>4 correcto j=1:10>24 incorrecto j=2:...

                // Comparación de elementos
                if (arreglo[j] > arreglo[j + 1]) { // 1 // compara par actual con siguiente
                    // Intercambio de valores
                    int temp = arreglo[j];          // 1 // guarda elemento mayor: temp=10
                    arreglo[j] = arreglo[j + 1];   // 1 // coloca el menor en posición actual
                    arreglo[j + 1] = temp;          // 1 // coloca temp en posición siguiente
                }
            }
        }
        //1 + (2n) + (n-1) * [2n + (n-1) * 4]
        //Complejidad temporal: O(n^2)
        //Arreglo inicial:    [10,  4, 24,  3,  8, 12]
        //Despues i=0:        [ 4, 10,  3,  8, 12, 24]
        //Despues i=1:        [ 4,  3,  8, 10, 12, 24]
        //Despues i=2:        [ 3,  4,  8, 10, 12, 24]
        //Despues i=3,4:      [ 3,  4,  8, 10, 12, 24] sin cambios
        //Arreglo final:      [ 3,  4,  8, 10, 12, 24]
    }

    
    public static void selectionSort(int[] arr) { // arreglo inicial: [10, 4, 24, 3, 8, 12]

                        //complejidad temp // conteo

        int n = arr.length; // 1 // n = 6

        for (int i = 0; i < n - 1; i++) { // 1 + n + n-1 // i=0:[10,4,24,3,8,12] i=1:[3,4,24,10,8,12] i=2:[3,4,24,10,8,12] i=3:[3,4,8,10,24,12] i=4:[3,4,8,10,24,12]

            int indiceMinimo = i; // 1 // asume que el elemento actual es el mínimo

            for (int j = i + 1; j < n; j++) { // 1 + n + n-1 // busca el elemento menor en el resto del arreglo

                if (arr[j] < arr[indiceMinimo]) { // 1 // compara con el mínimo actual
                    indiceMinimo = j;             // 1 // actualiza el índice del mínimo si encuentra uno menor
                }
            }

            int aux = arr[indiceMinimo]; // 1 // guarda el valor mínimo encontrado
            arr[indiceMinimo] = arr[i];  // 1 // coloca el elemento actual en la posición del mínimo
            arr[i] = aux;                // 1 // coloca el mínimo en la posición actual
            // 1 + (2n) + (n-1) * [2n + (n-1) * 3]
            //Complejidad temporal: O(n^2)
            //Arreglo inicial:    [10,  4, 24,  3,  8, 12]
            //Despues de i=0:     [ 3,  4, 24, 10,  8, 12]
            //Despues de i=1:     [ 3,  4, 24, 10,  8, 12]
            //Despues de i=2:     [ 3,  4,  8, 10, 24, 12]
            //Despues de i=3:     [ 3,  4,  8, 10, 24, 12]
            //Despues de i=4:     [ 3,  4,  8, 10, 12, 24]
            //Arreglo final:      [ 3,  4,  8, 10, 12, 24]
        }
    }
    
    public static void insertionSort(int[] arr) { // arreglo inicial: [10, 4, 24, 3, 8, 12]

                        //complejidad temp // conteo

        int n = arr.length; // 1 // n = 6

        for (int i = 1; i < n; i++) { // 1 + n + n-1 // i=1:[10,4,24,3,8,12] i=2:[4,10,24,3,8,12] i=3:[4,10,24,3,8,12] i=4:[3,4,10,24,8,12] i=5:[3,4,8,10,24,12]

            int key = arr[i]; // 1 // guarda el elemento actual como clave a insertar
            int j = i - 1;   // 1 // j apunta al elemento anterior a la clave

            // Mover elementos mayores que la clave
            while (j >= 0 && arr[j] > key) { // n + n-1 // desplaza hacia la derecha elementos mayores que key
                arr[j + 1] = arr[j];          // 1       // mueve elemento mayor una posición a la derecha
                j = j - 1;                    // 1       // retrocede j para comparar el siguiente elemento
            }

            arr[j + 1] = key; // 1 // inserta la clave en su posición correcta
            // 1 + (2n) + (n-1) * [2n + (n-1) * 3]
            //Complejidad temporal: O(n^2)
            //Arreglo inicial:    [10,  4, 24,  3,  8, 12]
            //Despues de i=1:     [ 4, 10, 24,  3,  8, 12]
            //Despues de i=2:     [ 4, 10, 24,  3,  8, 12]
            //Despues de i=3:     [ 3,  4, 10, 24,  8, 12]
            //Despues de i=4:     [ 3,  4,  8, 10, 24, 12]
            //Despues de i=5:     [ 3,  4,  8, 10, 12, 24]
            //Arreglo final:      [ 3,  4,  8, 10, 12, 24]
        }
    }
    
}
