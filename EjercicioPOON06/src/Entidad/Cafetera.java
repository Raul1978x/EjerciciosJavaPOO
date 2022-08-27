package Entidad;

import static java.lang.Math.abs;
import java.util.Scanner;

/*
6. Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad
actual de café que hay en la cafetera). Implemente, al menos, los siguientes métodos:
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual
• Métodos getters y setters.
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero.
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 */
public class Cafetera {

    private double capMax;
    private double cantActual;
    Scanner leer = new Scanner(System.in);
    Scanner leerS = new Scanner(System.in);

    public Cafetera() {
    }

    public Cafetera(double capMax, double cantActual) {
        this.capMax = capMax;
        this.cantActual = cantActual;
    }

    public double getCapMax() {
        return capMax;
    }

    public void setCapMax(double capMax) {
        this.capMax = capMax;
    }

    public double getCantActual() {
        return cantActual;
    }

    public void setCantActual(double cantActual) {
        this.cantActual = cantActual;
    }

    public void llenarCafetera() {
        capMax = 1500;
        cantActual = capMax;
        System.out.println("Cafetera llena con 1500 ml");
    }

    public void servirTaza() {
        int taza;
        double porc;
        boolean resp;
        String op;
        do {
            System.out.println("Indique el tamaño de la taza en ml: ");
            taza = leer.nextInt();
            if (cantActual > taza) {
                cantActual -= taza;
                System.out.println("Taza llena");
                System.out.println("Cantidad café restante " + (int) cantActual + " ml");
                System.out.println("¿Desea Servir otra taza?(S/N)");
                op = leerS.nextLine().toUpperCase();
                resp = op.equals("S");

            } else {
                porc = (cantActual * 100) / taza;
                System.out.println("Taza " + (int) porc + " % llena");
                cantActual = 0;
                resp = false;
                System.out.println("Cafetera Vacia");
            }

        } while (cantActual > 0 && resp);
    }

    public void vaciarCafetera() {
        cantActual = 0;
        System.out.println("Cafetera vaciada");
    }

    public void agregarCafe() {
        int cantAgregada;
        System.out.println("Cantidad de café Actual " + (int) cantActual + " ml");
        System.out.println("Ingrese cantidad de café a agregar(MAX " + (int) (1500 - cantActual) + " ml)");
        cantAgregada = leer.nextInt();
        cantActual += cantAgregada;
        System.out.println("Cafetera tiene ahora " + (int) cantActual + " ml de café");
    }
}
