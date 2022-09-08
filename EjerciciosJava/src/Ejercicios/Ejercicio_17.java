/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;

/**
 *  Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
    de 2 dígitos, etcétera (hasta 5 dígitos).
 * @author elias
 */
public class Ejercicio_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int [] vector;
        System.out.println("De que dimension es el vector");
        int n = leer.nextInt();
        vector = new int[n];
        for (int i = 0; i < n; i++){
            int aleatorio = (int) (Math.random() * 100000);
            vector[i]=aleatorio;
        }
        int undig=0;
        int dosdig=0;
        int tresdig=0;
        int cuatrodig=0;
        int cincodig=0;
        for (int i = 0; i< n; i++){
            if (vector[i]>=0 && vector[i]<=9){
                undig += 1;
            }else if (vector[i]>=10 && vector[i]<=99){
                dosdig += 1;
            }else if (vector[i]>=100 && vector[i]<=999){
                tresdig += 1;
            }else if (vector[i]>=1000 && vector[i]<=9999){
                cuatrodig += 1;
            }else if (vector[i]>=10000 && vector[i]<=99999){
                cincodig += 1;
            }
        }
        System.out.println("Hay numeros de 1 Digito: " + undig);
        System.out.println("Hay numeros de 2 Digitos: " + dosdig);
        System.out.println("Hay numeros de 3 Digitos: " + tresdig);
        System.out.println("Hay numeros de 4 Digitos: " + cuatrodig);
        System.out.println("Hay numeros de 5 Digitos: " + cincodig);
    }
}
