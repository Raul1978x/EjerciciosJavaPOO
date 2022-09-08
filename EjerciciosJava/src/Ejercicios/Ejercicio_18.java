/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

/**
 *  Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
    traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
    cambiando sus filas por columnas (o viceversa).
 *  @author elias
 */
public class Ejercicio_18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [][] matriz, matriztranspuesta;
        matriz = new int[4][4];
        matriztranspuesta = new int [4][4];
    
    for (int i = 0; i < 4; i++){
       for (int j = 0; j < 4; j++){
           int aleatorio = (int) (Math.random() * 10);
           matriz[i][j]=aleatorio;
       }
    }
        System.out.println("Matriz Original");
        muestramatriz(matriz);
        System.out.println("");
    for (int i = 0; i < 4; i++){
        for (int j = 0; j < 4; j++){
            matriztranspuesta[j][i]=matriz[i][j];
        }
    }
        System.out.println("Matriz Transpuesta");
        muestramatriz(matriztranspuesta);
    }
    
    public static void muestramatriz(int [][] matrices){
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
            System.out.print(matrices[i][j]+ " ");
            }
        System.out.println(" ");
        }
    }
}
