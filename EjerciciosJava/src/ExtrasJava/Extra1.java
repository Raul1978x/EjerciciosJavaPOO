/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExtrasJava;

import java.util.Scanner;

/**
 *  Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
    usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 *  @author elias
 */
public class Extra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int minutos;
        int horas;
        int dias;

        System.out.println("Introduce los minutos: ");
        minutos = scanner.nextInt();
        

        dias = minutos / (60*24);
        horas = minutos % (60*24) / 60;
        minutos = minutos - (dias * 60 * 24) - (horas * 60);
        System.out.println("Transcurrieron " + dias + " dias , " + horas + " horas y " + minutos + " minutos");
    }
}
