/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mx.itson.aa_uc2_269990;

/**
 *
 * @author Daniel
 */
public class Ordenamientos {//complejidad temp // conteo
    
    public static void burbuja(int[] arreglo) { // arreglo inicial: [10, 4, 24, 3, 8, 12]
                        
        int n = arreglo.length; // 1 // n = 6

            for (int i = 0; i < n - 1; i++) { // 1 + n + n-1 // i=0:[10,4,24,3,8,12] i=1:[4,10,3,8,12,24]

                for (int j = 0; j < n - 1; j++) { // 1 + n + n-1 // j=0:10>4 correcto j=1:10>24 incorrecto j=2:...

                    // Comparación de elementos
                    if (arreglo[j] > arreglo[j + 1]) { // 1 // compara par actual con siguiente
                        // Intercambio de valores
                        int aux = arreglo[j];        // 1  // guarda elemento mayor: aux=10
                        arreglo[j] = arreglo[j + 1];  // 1 // coloca el menor en posición actual
                        arreglo[j + 1] = aux;        // 1 // coloca aux en posición siguiente
                    }
                }
            }
                //1 + (2n) + (n-1) * [2n + (n-1) * 4]
                //Complejidad temporal: O(n^2)
                //Arreglo inicial:    [10,  4, 24,  3,  8, 12]
                //Tras i=0:           [ 4, 10,  3,  8, 12, 24]
                //Tras i=1:           [ 4,  3,  8, 10, 12, 24]
                //Tras i=2:           [ 3,  4,  8, 10, 12, 24]
                //Tras i=3,4:         [ 3,  4,  8, 10, 12, 24] (sin cambios)
                //Arreglo final:      [ 3,  4,  8, 10, 12, 24]
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
