/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExtrasJava;

import java.util.Scanner;

/**
 *  Escribir un programa que lea un número entero y devuelva el número de dígitos que
    componen ese número. Por ejemplo, si introducimos el número 12345, el programa
    deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador
    de división. Nota: recordar que las variables de tipo entero truncan los números o
    resultados.
 *  @author elias
 */
public class Extra_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Escribir un numero");
        int num = leer.nextInt();
        resultado(num);
        
    }
    public static void resultado(int num){
        int contador=0;
        while (num != 0){
            num = (num/10);
            contador += 1;
        }
        System.out.println("Tiene " + contador + " Digitos");
    }
}
