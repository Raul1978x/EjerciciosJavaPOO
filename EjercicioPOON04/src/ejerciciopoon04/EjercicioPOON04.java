
package ejerciciopoon04;

public class EjercicioPOON04 {
    
    public static void main(String[] args) {
        
        Rectangulo r1 = new Rectangulo();
        
        r1.crearRectangulo();
        System.out.println("La superficie del rectangulo es: " + r1.superficie());
        System.out.println("El perimetro del rectangulo es "+ r1.perimetro());
        r1.dibujo();
        
        
    }
    
}
