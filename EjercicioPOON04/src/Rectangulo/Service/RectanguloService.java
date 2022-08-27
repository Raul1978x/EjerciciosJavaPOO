package Rectangulo.Service;

import Rectangul.Rectangulo;
import java.util.Scanner;

public class RectanguloService {
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Rectangulo r1 = new Rectangulo();
    
     public Rectangulo crearRectangulo() {

        System.out.println("Ingrese la base del rectangulo");
        r1.setBase(leer.nextInt());
        
        System.out.println("Ingrese la altura del rectangulo");
        r1.setAltura(leer.nextInt());
        return new Rectangulo();
    }

    public int superficie() {
        int superficie = r1.getBase() * r1.getAltura();
        return superficie;
    }

    public int perimetro() {
        int perimetro = (r1.getBase() + r1.getAltura()) * 2;
        return perimetro;
    }

    public void dibujo() {
        for (int i = 0; r1.getAltura() > i; i++) {
                for (int j = 0; r1.getBase() > j; j++) {
                    if (i == 0 || i == r1.getAltura()-1 || j == 0 || j == r1.getBase()-1) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println("");
        }

    }
}
