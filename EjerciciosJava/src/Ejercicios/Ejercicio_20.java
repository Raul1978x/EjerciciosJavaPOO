/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;

/**
 *  Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
    suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
    permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
    El programa deberá comprobar que los números introducidos son correctos, es decir,
    están entre el 1 y el 9.
 *  @author elias
 */
public class Ejercicio_20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int [][] matriz, matriztranspuesta;
        System.out.println("Ingresa el tamaño del cuadrado");
        int n = leer.nextInt();
        int m = n;
        matriz = new int[n][m];
        matriztranspuesta = new int [m][n];
        llenarmatriz(matriz, n, m);
        System.out.println("");
        System.out.println("Matriz");
        mostrarmatriz(matriz, n, m);
        int fila = sumafila(matriz, m, n);
        int DiagonalPrincipal = sumadiagonal(matriz, n, m);
        int DiagonalOpuesta = sumadiagonalOpuesta(matriz, n, m);
        matriztrans(matriz, n, m, matriztranspuesta);
        int columna = sumacolumna(matriztranspuesta, n, m);
        System.out.println("");
        mostrarResultado (DiagonalPrincipal, DiagonalOpuesta, columna, fila, n, m);
    }
    
    public static void llenarmatriz(int [][] matriz, int n, int m){
        Scanner resp = new Scanner(System.in);
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                System.out.println("Ingrese un numero, posicion [" + i + "][" + j+"] entre 1 y 9");
                int num = resp.nextInt();
                while(num < 0 || num > 9){
                    System.out.println("Recuerde un numero entre 1 y 9 en la posicion [" + i + "][" + j+"]");
                    num = resp.nextInt();
                }
                matriz[i][j]=num; 
            }
        }
    }
    
    public static void mostrarmatriz(int [][] matrices, int n, int m){
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                System.out.print(matrices[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
    
    public static int sumadiagonal(int [][] matriz, int n, int m){
        int sumaOri=0;
        for (int i = 0; i < n; i++){
            for (int j= 0; j < m; j++){
                if (i==j){
                    sumaOri += matriz[i][j];
                }
            }
        }
        return sumaOri; 
    }
    
    public static int sumadiagonalOpuesta(int [][] matriz, int n, int m){
        int sumaOpu=0;
        for (int i = 0; i < n; i++){
            for (int j= 0; j < m; j++){
                if ((i+j) == n-1){
                    sumaOpu += matriz[i][j];
                }
            }
        }
        return sumaOpu; 
    }
    
    public static int sumafila(int [][] matrices, int m, int n){
        int suma = 0;
        int[] sumaf;
        sumaf = new int[n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                suma += matrices[i][j];
            }
            sumaf[i] = suma;
            suma = 0;
        }
        int igualfila = 1;
        int fila = sumaf[0];
        for (int i = 1; i < n; i++){
            if (fila == sumaf[i]){
                igualfila += 1;
            }
        }
        return igualfila;
    }
    
    public static void matriztrans(int [][] matriz, int n, int m, int [][] matriztranspuesta){
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                matriztranspuesta[j][i]= matriz[i][j];
            }
        }
    }
    
     public static int sumacolumna(int [][] matriztranspuesta, int m, int n){
        int suma = 0;
        int[] sumac;
        sumac = new int[n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                suma += matriztranspuesta[j][i];
            }
            sumac[i] = suma;
            suma = 0;
        }
        int igualcol = 1;
        int col = sumac[0];
        for (int i = 1; i < n; i++){
            if (col == sumac[i]){
                igualcol += 1;
            }
        }
        return igualcol;
    }
     
    public static void mostrarResultado (int DiagonalPrincipal, int DiagonalOpuesta, int columna, int fila, int n, int m){
        if (DiagonalPrincipal == DiagonalOpuesta){
            if(fila == n && columna == m){
                System.out.println("La Matriz es Magica");
            }else{
                System.out.println("La Matriz no es Magica");
            }
        }else{
            System.out.println("La Matriz no es Magica");
        }
    }
}