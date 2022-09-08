/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExtrasJava;

import java.util.Scanner;

/**
 *  Realice un programa para que el usuario adivine el resultado de una multiplicación entre
    dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
    si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
    al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
    utilizar la función Math.random() de Java.
 *  @author elias
 */
public class Extra_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num1 = (int) (Math.random()*10);
        int num2 = (int) (Math.random()*10);
        int resultado = num1*num2;
        int num;
        do {
            System.out.println("Juguemos, Adivina el numero entre 0 y 100");
            num = leer.nextInt();
        }while(resultado != num);
    }
    
}
