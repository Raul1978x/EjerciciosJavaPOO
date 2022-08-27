
package ejerciciopoon04;

import Rectangul.Rectangulo;
import Rectangulo.Service.RectanguloService;

public class EjercicioPOON04 {
    
    public static void main(String[] args) {
        RectanguloService rs = new RectanguloService();
        Rectangulo r1 =  rs.crearRectangulo();
        
        System.out.println("La superficie del rectangulo es: " + rs.superficie());
        System.out.println("El perimetro del rectangulo es "+ rs.perimetro());
        rs.dibujo();
        
        
    }
    
}
