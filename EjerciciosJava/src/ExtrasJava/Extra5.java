/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExtrasJava;

import java.util.Scanner;

/**
 *  Una obra social tiene tres clases de socios:
    o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
    todos los tipos de tratamientos.
    o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
    los mismos tratamientos que los socios del tipo A.
    o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
    tratamientos.
    o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
    real que represente el costo del tratamiento (previo al descuento) y determine el
    importe en efectivo a pagar por dicho socio.
 *  @author elias
 */
public class Extra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Cual es el costo del tratamiento?");
        int precio = leer.nextInt();
        System.out.println("Que Clase de socio sos A,B o C");
        String resp = leer.next();
        Costo(resp, precio);
    }
    public static void Costo(String resp, int precio){
        if (resp.equalsIgnoreCase("a")){
            double socioA = precio-(precio * 0.5);
            System.out.println("Usted es Socio A, tiene un 50% de descuento"
                    + " su tratamiento le costaria $" + socioA);
        }else if(resp.equalsIgnoreCase("b")){
            double socioB = precio-(precio * 0.35);
            System.out.println("Usted es Socio B, tiene un 35% de descuento"
                    + " su tratamiento le costaria $" + socioB);
        }else if(resp.equalsIgnoreCase("c")){
            System.out.println("Usted es Socio C, por tal motivo No tiene descuento"
                    + " su tratamiento le costaria $" + precio);
        }
    }
}
