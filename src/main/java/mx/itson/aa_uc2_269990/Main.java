/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.aa_uc2_269990;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int[] arreglo = {10, 4, 24, 3, 8, 12};
        
        System.out.println("--- Menu de Algoritmos ---");
        System.out.println("1. Ordenamiento Burbuja");
        System.out.println("2. Ordenamiento por Seleccion");
        System.out.println("3. Ordenamiento por Insercion");
        System.out.print("Selecciona una opcion: ");
        
        int opcion = sc.nextInt();
        
        switch (opcion) {
            case 1:
                System.out.println("Ordenando por Burbuja...");
                Ordenamientos.BubbleSort(arreglo);
                imprimirArreglo(arreglo);
                break;
            case 2:
                System.out.println("Ordenamiento por Seleccion...");
                Ordenamientos.selectionSort(arreglo);
                imprimirArreglo(arreglo);
                break;
            case 3:
                System.out.println("Ordenamiento por Insercion...");
                Ordenamientos.insertionSort(arreglo);
                imprimirArreglo(arreglo);
            default:
                System.out.println("Opcion no valida.");
        }
    }

    public static void imprimirArreglo(int[] arreglo) {
        System.out.print("Resultado: [ ");
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println("]");
    }
    
}
