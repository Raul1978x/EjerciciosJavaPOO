/**
 * 3. Vamos a realizar una clase llamada Raices, donde representaremos los valores de una
 * ecuación de 2o grado. Tendremos los 3 coeficientes como atributos, llamémosles a, b y c.
 * Hay que insertar estos 3 valores para construir el objeto a través de un método
 * constructor. Luego, las operaciones que se podrán realizar son las siguientes:
 * • Método getDiscriminante(): devuelve el valor del discriminante (double). El
 * discriminante tiene la siguiente formula: (b^2)-4*a*c
 * • Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
 * que esto ocurra, el discriminante debe ser mayor o igual que 0.
 * • Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
 * que esto ocurra, el discriminante debe ser igual que 0.
 * • Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2 posibles
 * soluciones.
 * • Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz. Es
 * en el caso en que se tenga una única solución posible.
 * • Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
 * pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
 * obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
 * de no existir solución, se mostrará un mensaje.
 * Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo delante de -b
 */
package servicioRaiz;

import entidades.Raiz;
import java.util.Scanner;

public class ServiceRaiz {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Raiz coeficientes() {
        Raiz coefRaiz = new Raiz();
        System.out.print("Ingrese el Coeficiente A: ");
        coefRaiz.setA(leer.nextDouble());
        System.out.print("Ingrese el Coeficiente B: ");
        coefRaiz.setB(leer.nextDouble());
        System.out.print("Ingrese el Coeficiente C: ");
        coefRaiz.setC(leer.nextDouble());
        return coefRaiz;
    }

    /**
     * • Método getDiscriminante(): devuelve el valor del discriminante
     * (double). El discriminante tiene la siguiente formula: (b^2)-4*a*c
     *
     * @param coefRaiz
     * @return
     */
    public double Discriminante(Raiz coefRaiz) {
        return (Math.pow(coefRaiz.getB(), 2)) - (4 * coefRaiz.getA() * coefRaiz.getC());
    }

    /**
     * • Método tieneRaices(): devuelve un booleano indicando si tiene dos
     * soluciones, para que esto ocurra, el discriminante debe ser mayor o igual
     * que 0.
     *
     * @param coefRaiz
     * @return
     */
    public boolean tieneRaices(Raiz coefRaiz) {
        boolean tieneRaices = false;
        if (Discriminante(coefRaiz) >= 0) {
            tieneRaices = true;
        }
        return tieneRaices;
    }

    /**
     * • Método tieneRaiz(): devuelve un booleano indicando si tiene una única
     * solución, para que esto ocurra, el discriminante debe ser igual que 0.
     *
     * @param coefRaiz
     * @return
     */
    public boolean tieneRaiz(Raiz coefRaiz) {
        return Discriminante(coefRaiz) == 0;
    }

    /**
     * • Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime
     * una única raíz. Es en el caso en que se tenga una única solución posible.
     *
     * @param coefRaiz
     */
    public void obtenerRaices(Raiz coefRaiz) {
        double solucionPos = (-coefRaiz.getB() + Math.sqrt((Math.pow(coefRaiz.getB(), 2)) - (4 * coefRaiz.getA() * coefRaiz.getC()))) / (2 * coefRaiz.getA());
        double solucionNeg = (-coefRaiz.getB() - Math.sqrt(Math.pow(coefRaiz.getB(), 2) - (4 * coefRaiz.getA() * coefRaiz.getC()))) / (2 * coefRaiz.getA());
        if (tieneRaiz(coefRaiz) == true) {
        }
    }

    /**
     * • Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y
     * mostrará por pantalla las posibles soluciones que tiene nuestra ecuación
     * con los métodos obtenerRaices() o obtenerRaiz(), según lo que devuelvan
     * nuestros métodos y en caso de no existir solución, se mostrará un
     * mensaje. Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a)
     * Solo varia el signo delante de -b
     *
     * @param coefRaiz
     */
    public void calcular(Raiz coefRaiz) {

        double solucionPos = (-coefRaiz.getB() + Math.sqrt((Math.pow(coefRaiz.getB(), 2)) - (4 * coefRaiz.getA() * coefRaiz.getC()))) / (2 * coefRaiz.getA());
        double solucionNeg = (-coefRaiz.getB() - Math.sqrt((Math.pow(coefRaiz.getB(), 2)) - (4 * coefRaiz.getA() * coefRaiz.getC()))) / (2 * coefRaiz.getA());
        if (tieneRaiz(coefRaiz) == true) {
            System.out.println("El resultado de la raiz es: " + solucionPos);
        } else if (tieneRaices(coefRaiz) == true) {
            System.out.println("El resultado de una raiz es: " + solucionPos);
            System.out.println("El resultado de la otra raiz es: " + solucionNeg);
        } else {
            System.out.println("No tiene raices");
        }
    }
}
