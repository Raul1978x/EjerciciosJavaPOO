/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExtrasJava;

import java.util.Scanner;

/**
 *  Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
    restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
    matemática y deben devolver sus resultados para imprimirlos en el main.
 *  @author elias
 */
public class Extra_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese Numero 1");
        int num1 = leer.nextInt();
        System.out.println("Ingrese Numero 2");
        int num2 = leer.nextInt();
        System.out.println("Menu: ");
        System.out.println("Sumar");
        int sumados = suma(num1, num2);
        System.out.println("Restar");
        int restados = resta(num1, num2);
        System.out.println("Multiplicar");
        int multiplicador = multiplica(num1, num2);
        System.out.println("Dividir");
        double divididos = divide(num1, num2);
        System.out.println("Que Quieres Hacer");
        String resp = leer.next();
        resp = resp.toLowerCase();
        switch (resp){
            case "sumar": System.out.println("La suma es: " + sumados);
                break;
            case "restar": System.out.println("La resta es: " + restados);
                break;
            case "mmultiplicar": System.out.println("La muliplicación es: " + multiplicador);
                break;
            case "dividir": System.out.println("La division es: " + divididos);
                break;
            default: System.out.println("No Has Escrito Bien Lo Que Quieres Hacer");
        }
    }
    
    public static int suma(int num1, int num2){
        int total = num1+num2;
        return total;
    }
    public static int resta(int num1, int num2){
        int total = num1-num2;
        return total;
    }
    public static int multiplica(int num1, int num2){
        int total = num1*num2;
        return total;
    }
    public static double divide(int num1, int num2){
        double total = num1/num2;
        return total;
    }
}
