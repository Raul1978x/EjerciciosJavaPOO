/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Arrays;

/**
 *  Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
    muestre por pantalla en orden descendente.
 *  @author elias
 */
public class Ejercicio_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] vector;  
        vector = new int[100];
        llenar(vector);
    }
    
    public static void llenar(int[] vector ){//forma de llamar en un subproceso a un vector
        for (int i = 0; i<100; i++){
            int numero = (int) (Math.random()*100);//Numeros aleatorios del 1 al 100
            vector[i] = numero;         
        }
        for (int i = 99 ; i >=0 ; i--){
            Arrays.sort(vector);//Organiza el arreglo en forma ordenada
            System.out.println(vector[i]);
        }
    }
}
