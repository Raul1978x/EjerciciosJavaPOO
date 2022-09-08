/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;

/**
 *  Crea una aplicación que a través de una función nos convierta una cantidad de euros
    introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
    función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
    una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
    (void).
    El cambio de divisas es:
    * 0.86 libras es un 1 €
    * 1.28611 $ es un 1 €
    * 129.852 yenes es un 1 €
 *  @author elias
 */
public class Ejercicio_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese cuantos euros quiere cambiar");
        double euro = leer.nextDouble();
        System.out.println("A que moneda quiere cambiar? Libras, Yenes o Dolares");
        String moneda = leer.next();
        moneda = moneda.toLowerCase();
        switch (moneda){
            case "libras":
                conversor(euro, moneda, 0.86);
                break;
            case "yenes":
                conversor(euro, moneda, 192.852);
                break;
            case "dolares":
                conversor(euro, moneda, 1.28611);
                break;
            default:
                System.out.println("No ha ingresado correctamente a que valor quiere cambiar");
        }
    }
    public static void conversor(double euro, String moneda, double valor){
          double total;
          total = euro * valor;
          System.out.println(euro + " Euros, equivale a: " + total + " de " + moneda);
    }
}

