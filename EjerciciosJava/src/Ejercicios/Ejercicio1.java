/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;

/*
   Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
   dos. El programa deberá después mostrar el resultado de la suma
   @author elias
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num1, num2;
        System.out.println("Digite un numero");
        num1 = leer.nextInt();
        System.out.println("Digite otro numero");
        num2 = leer.nextInt();
        int suma = num1 + num2;
        System.out.println("La suma de: " + num1 + " + " + num2 + " = " + suma);
    }
    
}
