/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

/**
    *Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
    cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
    * * * *
    *     *
    *     *
    * * * *
    * @author elias
 */
public class Ejercicio_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 10;
    for (int i = 0; i <= n; i++){
        for(int j = 0; j<= n; j++){
            if (i>0 && i<n && j>0 && j<n){
                System.out.print("  ");
            }else{
                System.out.print("* ");
            }
        }
        System.out.println(" ");
    }
}
}
