/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExtrasJava;

import java.util.Scanner;

/**
 *  Realizar un programa que complete un vector con los N primeros números de la sucesión
    de Fibonacci. Recordar que la sucesión de Fibonacci es la sucesión de los siguientes
    números:
    1, 1, 2, 3, 5, 8, 13, 21, 34, ...
    Donde cada uno de los números se calcula sumando los dos anteriores a él. Por ejemplo:
    La sucesión del número 2 se calcula sumando (1+1)
    Análogamente, la sucesión del número 3 es (1+2),
    Y la del 5 es (2+3),
    Y así sucesivamente...
    La sucesión de Fibonacci se puede formalizar de acuerdo a la siguiente fórmula:
    Fibonaccin = Fibonaccin-1 + Fibonaccin-2 para todo n>1
    Fibonaccin = 1 para todo n<=1
    Por lo tanto, si queremos calcular el término “n” debemos escribir una función que reciba
    como parámetro el valor de “n” y que calcule la serie hasta llegar a ese valor.
 *  @author elias
 */
public class Extra_24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
         System.out.println("Elija hasta que posicion de la sucesion de Fibonacci quiere ver: ");
        int pos = leer.nextInt();
        int[] vector = new int[pos];
        
        
        for (int i = 0 ; i < pos ; i++){
            vector[i] = nroFibo(i);
        }
        
        System.out.println("Los numeros de Fibonacci hasta la posicion " + pos + " son :");
        for (int i = 0 ; i < pos ; i++){
            System.out.print(vector[i] + " ");
            System.out.println("");
        }
    }
    
    public static int nroFibo(int n){
        int suma = 0;
           if (n <=1){
               suma += 1;
           } else {
               suma = nroFibo(n-2) + nroFibo(n - 1); 
           }
        return suma;
    }
}
