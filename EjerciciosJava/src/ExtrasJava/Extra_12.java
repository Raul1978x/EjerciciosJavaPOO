/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExtrasJava;

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
public class Extra_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cen, dec, uni;
        for (int c = 0; c <= 9; c++){
            if (c == 3){
                cen = "E";
            }else{
                cen = String.valueOf(c);
            }
            for (int d = 0; d <=9; d++){
                if (d == 3){
                    dec = "E";
                }else{
                    dec = String.valueOf(d);
                }
                for (int u = 0; u <=9; u++){
                    if (u == 3){
                        uni = "E";
                    }else{
                        uni = String.valueOf(u);
                    }
                    System.out.println(cen + "-" + dec + "-" + uni);
                }
            }
        }
    }
    
}
