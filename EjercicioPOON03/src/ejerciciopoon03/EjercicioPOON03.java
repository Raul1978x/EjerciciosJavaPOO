
package ejerciciopoon03;

import java.util.Scanner;

public class EjercicioPOON03 {


    public static void main(String[] args) {
        Operacion op1 = new Operacion();
        Scanner leer = new Scanner(System.in);
        
        op1.crearOperacion();
        if(op1.multiplicar()==0 || op1.dividir()==0){
            System.out.println("Error");
            System.out.println("va ha multiplicar/dividir por cero");
            System.out.println("Ingrese nuevamente numero 1");
            op1.setNumero1(leer.nextInt());
            System.out.println("Ingrese nuevamente numero 2");
            op1.setNumero2(leer.nextInt());
        }
       
        System.out.println("la suma de ambos numeros es: "+op1.sumar());  
        System.out.println("la resta de ambos numeros es: "+op1.restar()); 
        System.out.println("la multiplicacion de ambos numeros es: "+op1.multiplicar()); 
        System.out.println("la division de ambos numeros es: "+op1.dividir()); 
    }
}
