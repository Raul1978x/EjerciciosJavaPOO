/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

/**
 *  Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
    3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
    dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
    se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
    que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
    la matriz M en la cual empieza el primer elemento de la submatriz P.
 *  @author elias
 */
public class Ejercicio_21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] MatrizM;
        MatrizM = new int[10][10];
        int[] vectorGrande = {
                                1, 26, 36, 47, 5, 6, 72, 81, 95, 10,
                                11, 12, 13, 21, 41, 22, 67, 20, 10, 61,
                                56, 78, 87, 90, 9, 90, 17, 12, 87, 67,
                                41, 87, 24, 56, 97, 74, 87, 42, 64, 35,
                                32, 76, 79, 1, 36, 5, 67, 96, 12, 11,
                                99, 13, 54, 88, 89, 90, 75, 12, 41, 76,
                                67, 78, 87, 45, 14, 22, 26, 42, 56, 78,
                                98, 45, 34, 23, 32, 56, 74, 16, 19, 18,
                                24, 67, 97, 46, 87, 13, 67, 89, 93, 24,
                                21, 68, 78, 98, 90, 67, 12, 41, 65, 12};
        
        int[][] MatrizP;
        MatrizP = new int[3][3];
        int[] vectorChico = {36, 5, 67,
                            89, 90, 75, 
                            14, 22, 26};
        
        llenarmatriz(MatrizM, 10, vectorGrande);
        llenarmatriz(MatrizP, 3, vectorChico);
        mostrarmatriz(MatrizM, 10);
        System.out.println("");
        mostrarmatriz(MatrizP, 3);
        System.out.println("");
    }
    
    public static void llenarmatriz(int[][] matrices, int l, int [] vectores){
        int contador = 0;
        for (int i = 0; i < l; i++){
            for (int j = 0; j < l; j++){
                matrices[i][j] = vectores[contador];
                contador += 1;
            }
        }
    }
    
    public static void mostrarmatriz(int[][] matrices, int l){
        for (int i = 0; i < l; i++){
            for (int j = 0; j < l; j++){
                System.out.print(matrices[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
       
    
