/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package osorioespinoza_20250929;

/**
 *
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         BusquedaBinaria buscar = new BusquedaBinaria();
        
         // Arreglo unidimensional
        int[] arreglo = {17,19,21,23,25,27,29,31};

        // Matriz bidimensional
        int[][] matriz = {
            {1, 3, 5},
            {7, 9, 11},
            {13, 15, 17}
        };

        // Valor a buscar
        int a_buscar = 17;

        // Búsqueda en arreglo unidimensional
        int posicion = buscar.buscarEnteroArray(arreglo, a_buscar);

        if (posicion != -1) {
            System.out.println("El valor " + a_buscar + " está en la posición del arreglo: " + posicion);
        } else {
            System.out.println("No se encontró el valor " + a_buscar + " en el arreglo.");
        }

        // Búsqueda en matriz bidimensional
        buscar.buscarEnteroMatriz(matriz, a_buscar);
    }
}
