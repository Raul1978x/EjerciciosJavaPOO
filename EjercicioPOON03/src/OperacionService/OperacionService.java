package OperacionService;

import Operacion.Operacion;
import java.util.Scanner;

public class OperacionService {

    private Scanner leer = new Scanner(System.in);
    Operacion op = new Operacion();

    public Operacion crearOperacion() {
        System.out.println("Ingrese el primer numero");
        op.setNumero1(leer.nextInt());
        System.out.println("Ingrese el segundo numero");
        op.setNumero2(leer.nextInt());
        if (op.getNumero1() == 0) {
            System.out.println("Error el primer numero es cero");
            System.out.println("Ingrese nuevamente el primer numero ");
            op.setNumero1(leer.nextInt());
        } else if (op.getNumero2() == 0) {
            System.out.println("Error el segundo numero es cero");
            System.out.println("Ingrese nuevamente el segundo numero");
            op.setNumero2(leer.nextInt());
        }

        return new Operacion();
    }

    public int sumar() {
        int suma = op.getNumero1() + op.getNumero2();
        return suma;
    }

    public int restar() {
        int resta = op.getNumero1() - op.getNumero2();
        return resta;
    }

    public int multiplicar() {
        int producto;
        producto = op.getNumero1() * op.getNumero2();
        return producto;
    }

    public double dividir() {
        double division;
        division = (float) op.getNumero1() / op.getNumero2();
        return division;
    }
}
