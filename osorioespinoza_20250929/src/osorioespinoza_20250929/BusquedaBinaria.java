/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package osorioespinoza_20250929;

/**
 *
 */
public class BusquedaBinaria {
    
    // MÉTODO PARA REALIZAR UNA BÚSQUEDA BINARIA EN UN ARREGLO UNIDIMENSIONAL
    public int buscarEnteroArray(int[] arreglo, int valorBuscado) {
        
        int inicio = 0;
        int fin = arreglo.length - 1; // CORREGIDO
        
        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;
            
            if (arreglo[medio] == valorBuscado) {
                return medio;
            } else if (arreglo[medio] < valorBuscado) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }
        return -1; // No encontrado
    }
    
    // MÉTODO PARA REALIZAR UNA BÚSQUEDA BINARIA EN UNA MATRIZ
    public void buscarEnteroMatriz(int[][] matriz, int objetivo) {
        
        int filas = matriz.length;
        int columnas = matriz[0].length;
        
        int inicio = 0;
        int fin = (filas * columnas) - 1;
        
        boolean encontrado = false;
        
        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;
            int f = medio / columnas; 
            int c = medio % columnas;
            
            if (matriz[f][c] == objetivo) {
                System.out.println("En la matriz, el elemento se encuentra en la posicion [" + f + "][" + c + "]");
                encontrado = true;
                break;
            } else if (matriz[f][c] < objetivo) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }
        
        if (!encontrado) {
            System.out.println("El elemento buscado no ha sido encontrado en la matriz.");
        }
    }
    
}
