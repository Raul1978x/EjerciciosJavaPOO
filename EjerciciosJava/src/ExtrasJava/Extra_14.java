/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExtrasJava;

import java.util.Scanner;

/**
 *  Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
    hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad
    de hijos para averiguar la media de edad de los hijos de todas las familias.
 *  @author elias
 */
public class Extra_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Cuantas Familias Son:");
        int fam = leer.nextInt();
        int hijos;
        int totalanios = 0;
        int anios;
        int canthijos = 0;
        for (int i = 1; i <= fam; i++){
            System.out.println("Cuantos Hijos Tiene La Familia " + i);
            hijos = leer.nextInt();
            for (int j = 1; j <= hijos; j++){
                System.out.println("Cuantos Años Tiene El Hijo " + j);
                anios = leer.nextInt();
                totalanios += anios;
                canthijos++;
            }
        }
        int media = totalanios/(canthijos);
        System.out.println("La Media Edad De Todos Los Hijos De Las " + fam + " Familias Es: " + media + " Años");
    }
    
}
