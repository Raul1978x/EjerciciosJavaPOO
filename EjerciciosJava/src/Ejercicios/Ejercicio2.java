/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;

/**
 *  Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
    pantalla.
 *  @author elias
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba su nombre");
        String nombre = leer.nextLine();
        System.out.println("Hola " + nombre);
    }
    
}
