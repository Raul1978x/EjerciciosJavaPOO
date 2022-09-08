/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;

/**
 *  Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
    usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
    numero y si se encuentra repetido
 *  @author elias
 */
public class Ejercicio_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int [] vector;
        System.out.println("Ingrese el tamaño del vector");
        int num = leer.nextInt();
        vector = new int [num];
        llenarvector(vector);
        System.out.println("Escribir que numero quiere buscar?");
        int busc = leer.nextInt();
        for (int i = 0; i < num; i++){
            if (busc == vector[i]){
                System.out.println("El numero se encuentra en la posicion: " + i);
            }
        }
    }
    public static void llenarvector(int[] vector){
        for (int i = 0; i < vector.length; i++){
            int aleatorio = (int) (Math.random()*100);
            vector[i]=aleatorio;
        }
    }
}
