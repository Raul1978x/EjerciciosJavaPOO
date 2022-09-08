/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExtrasJava;

import java.util.Scanner;

/**
 *  Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
    las personas ingresadas por teclado e indique si son mayores o menores de edad.
    Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
    mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
 *  @author elias
 */
public class Extra_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String nombre;
        String resp;
        int edad;
        do{
            System.out.println("Ingrese su nombre");
            nombre = leer.next();
            System.out.println("Ingrese su edad");
            edad = leer.nextInt();
            if (edad >= 18){
                System.out.println("Su nombre es: " + nombre +
                        "su edad es " + edad + " y es mayor de edad");
            }else{
                System.out.println("Su nombre es: " + nombre +
                        ", su edad es: " + edad + " y es menor de edad");
            }
            System.out.println("Desea Continuar si o no?");
            resp = leer.next();
        }while(!resp.equals("no"));
    }
    
}
