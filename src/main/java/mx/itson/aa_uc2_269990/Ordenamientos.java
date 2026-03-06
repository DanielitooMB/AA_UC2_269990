/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mx.itson.aa_uc2_269990;

/**
 *
 * @author Daniel
 */
public class Ordenamientos {
    
    public static void burbuja(int[] arreglo) {

        int n = arreglo.length; // 1

            for (int i = 0; i < n - 1; i++) { // 1 + n + n-1

                for (int j = 0; j < n - 1; j++) { // 1 + n + n-1

                    // Comparación de elementos
                    if (arreglo[j] > arreglo[j + 1]) { // 1
                        // Intercambio de valores
                        int aux = arreglo[j];        // 1 
                        arreglo[j] = arreglo[j + 1];  // 1
                        arreglo[j + 1] = aux;        // 1 
                    }
                }
            }
               //1 + (2n) + (n-1) * [2n + (n-1) * 4]
               //Complejidad temporal: O(n^2)
    }

    public static void seleccionSort(int[] arreglo) {

        int n = arreglo.length; // 1

        for (int i = 1; i < n; i++) { // 1 + n + n-1
            int clave = arreglo[i]; // 1
            int j = i - 1; // 1

            // Mover elementos mayores que la clave
            while (j >= 0 && arreglo[j] > clave) { // n + n-1
                arreglo[j + 1] = arreglo[j]; // 1
                j = j - 1; // 1
            }

            arreglo[j + 1] = clave; // 1
            // 1 + (2n) + (n-1) * [2n + (n-1) * 3]
            //Complejidad temporal: O(n^2)
        }
        }
}
