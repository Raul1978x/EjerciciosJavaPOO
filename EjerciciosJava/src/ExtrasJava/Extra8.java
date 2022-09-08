/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExtrasJava;

import java.util.Scanner;

/**
 *  Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
    detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
    la cantidad de números impares. Al igual que en el ejercicio anterior los números
    negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
 *  @author elias
 */
public class Extra8 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int cont = 0;
        int par= 0;
        int impar =0;
        int i = 0;
        do{
            System.out.println("Escriba numeros enteros > 0");
            int num = leer.nextInt();
            if (num > 0){
                cont = num;
                i += 1;
                if(num%2==0){
                    par += 1;
                }
                if(num%2!=0){
                    impar += 1;
                }
                if(num%5==0){
                    break;
                }
            }
        }while (cont%5!=0 || cont==0);
        System.out.println("La cantidad de numeros leidos es de: " + i);
        System.out.println("La cantidad de numeros pares es de: " + par);
        System.out.println("La cantidad de numeros impares es de: " + impar);
    }
}
   
