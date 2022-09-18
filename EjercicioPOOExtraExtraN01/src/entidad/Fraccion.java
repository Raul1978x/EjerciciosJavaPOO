/**
 * Crear una clase llamada fracción que contenga 4 atributos (denominador y numerador de cada
fracción). Crear la clase servicio que contenga métodos para sumar, restar, multiplicar y dividir
fracciones. Mostrar por pantalla un menú de opciones para que el usuario decida que ver.
 */
package entidad;

public class Fraccion {
    
    private int num1;
    private int num2;
    private int den1;
    private int den2;
    private int numResultado;
    private int denResultado;

    public Fraccion() {
    }

    public Fraccion(int num1, int num2, int den1, int den2, int numResultado, int denResultado) {
        this.num1 = num1;
        this.num2 = num2;
        this.den1 = den1;
        this.den2 = den2;
        this.numResultado = numResultado;
        this.denResultado = denResultado;
    }

    public Fraccion(int num1, int num2, int den1, int den2) {
        this.num1 = num1;
        this.num2 = num2;
        this.den1 = den1;
        this.den2 = den2;
    }


    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getDen1() {
        return den1;
    }

    public void setDen1(int den1) {
        this.den1 = den1;
    }

    public int getDen2() {
        return den2;
    }

    public void setDen2(int den2) {
        this.den2 = den2;
    }

    public int getNumResultado() {
        return numResultado;
    }

    public void setNumResultado(int numResultado) {
        this.numResultado = numResultado;
    }

    public int getDenResultado() {
        return denResultado;
    }

    public void setDenResultado(int denResultado) {
        this.denResultado = denResultado;
    }

    @Override
    public String toString() {
        return "Fraccion{" + "num1=" + num1 + ", num2=" + num2 + ", den1=" + den1 + ", den2=" + den2 + ", numResultado=" + numResultado + ", denResultado=" + denResultado + '}';
    }
}
