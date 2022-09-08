/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExtrasJava;

import java.util.Scanner;

/**
 *  Simular la división usando solamente restas. Dados dos números enteros mayores que
    uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método:
    Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este
    resultado es el residuo, y el número de restas realizadas es el cociente.
    Por ejemplo: 50 / 13:
    50 – 13 = 37 una resta realizada
    37 – 13 = 24 dos restas realizadas
    24 – 13 = 11 tres restas realizadas
    dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
    ¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.
 *  @author elias
 */
public class Extra9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el Dividendo");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el Divisor");
        int num2 = leer.nextInt();
        int total = num1;
        int cont = 0;
        if (total >= num2){
        while (num2 <= total){
            total -= num2;
            cont += 1;
        }
        System.out.println("El cociente es: " + cont + " El residuo es: " + total);
        }else{
            System.out.println("El dividendo no puede ser menor que el Divisor, Graacias!!");
        }
    }
}
