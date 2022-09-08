/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;

/**
 *  Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
    números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 *  @author elias
 */
public class Ejercicio_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero limite positivo");
        int num = leer.nextInt();
        int suma = 0;
        
        while (suma <= num){
            System.out.println("Ingrese otro numero");
            int num2 = leer.nextInt();
            suma += num2;
        }
        System.out.println("La suma o el numero ingresado " + suma + " Supero al primer numero limite: " + num);
    }
}
