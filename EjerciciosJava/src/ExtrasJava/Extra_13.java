/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExtrasJava;

import java.util.Scanner;

/**
 *  Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-
    0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
    Ejemplo:
    0-0-0
    0-0-1
    0-0-2
    0-0-E
    0-0-4
    0-1-2
    0-1-E
    Nota: investigar función equals() y como convertir números a String.
 *  @author elias
 */
public class Extra_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int tamEscalera;
        int i = 1;
        String numerosConcatenados = "";
        String auxiliar;
        System.out.print("Ingrese el tamaño de la escalera de numeros: ");
        tamEscalera = leer.nextInt();
        while(i <= tamEscalera){
            auxiliar = String.valueOf(i);
            numerosConcatenados = numerosConcatenados.concat(auxiliar);
            System.out.println(numerosConcatenados);
            i++;
        }
    }
}
    
