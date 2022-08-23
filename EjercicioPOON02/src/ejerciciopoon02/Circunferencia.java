/*
 2. Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (𝐀𝐫𝐞𝐚 = 𝛑 ∗ 𝐫𝐚𝐝𝐢𝐨𝟐).
e) Método perimetro(): para calcular el perímetro (𝐏𝐞𝐫𝐢𝐦𝐞𝐭𝐫𝐨 = 𝟐 ∗ 𝛑 ∗ 𝐫𝐚𝐝𝐢𝐨).
 */
package ejerciciopoon02;

import java.util.Scanner;
import java.lang.Math;


public class Circunferencia {
    
    private double radio;
    
    Scanner leer = new Scanner(System.in);

    public Circunferencia() {
    }
    
    public Circunferencia(double radio){
        this.radio = radio;
        }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    public double getRadio(){
        return radio;
    }
    public double crearCircunferencia(){
        System.out.println("Ingrese el radio de la circunferencia");
        radio = leer.nextDouble();
        return 0;
    }
    public double area(){
        double area = (Math.PI) * (radio*radio);
        return area;
    }
    public double perimetro(){
        double perimetro = 2 * (Math.PI) * radio;
        return perimetro;
    }
}
