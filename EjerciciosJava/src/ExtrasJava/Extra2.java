/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExtrasJava;

/**
 *  Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
    una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
    tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
    iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
 *  @author elias
 */
public class Extra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int A = 5;
        int B = 10;
        int C = 15;
        int D = 20;
        int aux = B;
        System.out.println(A + ", " + B + ", " + C + ", " + D);//Variables Declaradas
        B = C;
        C = A;
        A = D;
        D = aux;
        System.out.println(A + ", " + B + ", " + C + ", " + D);//Variables Cambiadas     
    }
    
}
