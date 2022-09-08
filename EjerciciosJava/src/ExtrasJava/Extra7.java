/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExtrasJava;

import java.util.Scanner;

/**
 *  Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
    de n números (n>0). El valor de n se solicitará al principio del programa y los números
    serán introducidos por el usuario. Realice dos versiones del programa, una usando el
    bucle “while” y otra con el bucle “do - while”.
 *  @author elias
 */
public class Extra7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int numero = 10;
        resultadocondowhile(numero);
        System.out.println("");
        resultadoconwhile(numero);
    }
    public static void resultadocondowhile(int numero){
        Scanner leer1 = new Scanner(System.in);
        int i=0;
        int maximo= 0;
        int minimo = 1000;
        int promedio = 0;
        do{
            System.out.println("Ingrese numeros mayor que 0 y menores que 1000, posicion ["+i+"]");
            int num = leer1.nextInt();
            if(num > 0 && num <= 999){
                promedio += num;
                i += 1;
                if(num > maximo){
                    maximo = num;
                }
                if(num < minimo){
                    minimo = num;
                }
            }
        }while (i!= numero);
        System.out.println("Bucle Do-While: El numero mayor es: " + maximo);
        System.out.println("Bucle Do-While: El numero minimo es: " + minimo);
        System.out.println("Bucle Do-While: El promedio del total de numeros ingresados es: " + promedio/i);
    }
    public static void resultadoconwhile(int numero){
        Scanner leer2 = new Scanner(System.in);
        int i=0;
        int maximo= 0;
        int minimo = 1000;
        int promedio = 0;
        while(i!=numero){
            System.out.println("Ingrese numeros mayor que 0 y menores que 1000, posicion ["+i+"]");
            int num = leer2.nextInt();
            if(num > 0 && num <= 999){
                promedio += num;
                i += 1;
                if(num > maximo){
                    maximo = num;
                }
                if(num < minimo){
                    minimo = num;
                }
            }
        }
        System.out.println("Bucle While: El numero mayor es: " + maximo);
        System.out.println("Bucle While: El numero minimo es: " + minimo);
        System.out.println("Bucle While: El promedio del total de numeros ingresados es: " + promedio/i);
    }
}
