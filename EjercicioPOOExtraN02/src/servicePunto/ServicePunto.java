/**
 * 2. Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
 * atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
 * usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
 * los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
 * que existe entre los dos puntos que existen en la clase Puntos. Para conocer como
 * calcular la distancia entre dos puntos consulte el siguiente link:
 * http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html
 * √(x2-x1)^2+(y2-y1)^2
 */
package servicePunto;

import entidades.Punto;
import static java.lang.Math.sqrt;
import java.util.Scanner;

public class ServicePunto {

    Punto p = new Punto();
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Punto crearPuntos(){
        System.out.println("Ingrese las coordenadas del punto 1: ,\nx1: ");
        p.setX1(leer.nextDouble());
        System.out.println("y1: ");
        p.setY1(leer.nextDouble());
        System.out.println("Ingrese las coordenadas del punto 2: ,\nx2: ");
        p.setX2(leer.nextDouble());
        System.out.println("y2: ");
        p.setY2(leer.nextDouble());
        return p;
    }
    public double calculaDistancia(){
        double resultado = sqrt((Math.sqrt(Math.pow((p.getX2()-p.getX1()), 2))
                +(Math.pow((p.getY2()-p.getY1()),2))));
        return resultado;
    }
}
