/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejextra5;

import entidad.Mes;
import java.util.Scanner;

/**
 *
 * @author elias
 */
public class POOEjExtra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mes mm = new Mes();
        Scanner leer = new Scanner(System.in);
        System.out.println("Vamos a jugar, Adivine el mes");
        String resp = leer.next();
        while(!resp.equalsIgnoreCase(mm.getAdivinanza())){
            System.out.println("Incorrecto, intente de nuevo, loser");
            resp = leer.next();
        }
        System.out.println("Adivinaste!!!, genial vuelve cuando quieras");
        System.out.println("");
        System.out.println("Vamos a jugar una vez mas!!!");
        Mes mm2 = new Mes();
        System.out.println("Vamos a jugar, Adivine el mes");
        resp = leer.next();
        while(!resp.equalsIgnoreCase(mm2.getAdivinanza())){
            System.out.println("Incorrecto, intente de nuevo, loser");
            resp = leer.next();
        }
        System.out.println("Adivinaste!!!, genial vuelve cuando quieras");
    }
}
