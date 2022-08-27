package ejerciciopoon03;

import Operacion.Operacion;
import java.util.Scanner;

import OperacionService.OperacionService;

public class EjercicioPOON03 {

    public static void main(String[] args) {
        OperacionService os = new OperacionService();
        Scanner leer = new Scanner(System.in);

        Operacion o1 = os.crearOperacion();

        System.out.println("la suma de ambos numeros es: " + os.sumar());
        System.out.println("la resta de ambos numeros es: " + os.restar());
        System.out.println("la multiplicacion de ambos numeros es: " + os.multiplicar());
        System.out.println("la division de ambos numeros es: " + os.dividir());
    }
}
