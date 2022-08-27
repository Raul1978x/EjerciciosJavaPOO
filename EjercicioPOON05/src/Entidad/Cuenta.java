package Entidad;

import java.util.Scanner;

/*
5. Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero). Las
operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la
restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el
saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
public class Cuenta {

    private String nombYApell;
    private int numeroCuenta;
    private long dni;
    private double saldo;
    private int interes;
    Scanner leerInt = new Scanner(System.in);
    Scanner leerDouble = new Scanner(System.in);
    Scanner leerString = new Scanner(System.in);

    public Cuenta() {
    }

    public Cuenta(String nombYApell, int numeroCuenta, long dni, double saldo, int interes) {
        this.nombYApell = nombYApell;
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldo = saldo;
        this.interes = interes;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getInteres() {
        return interes;
    }

    public void setInteres(int interes) {
        this.interes = interes;
    }

    public String getNombYApell() {
        return nombYApell;
    }

    public void setNombYApell(String nombYApell) {
        this.nombYApell = nombYApell;
    }

    public Scanner getLeerInt() {
        return leerInt;
    }

    public void setLeerInt(Scanner leerInt) {
        this.leerInt = leerInt;
    }

    public Scanner getLeerDouble() {
        return leerDouble;
    }

    public void setLeerDouble(Scanner leerDouble) {
        this.leerDouble = leerDouble;
    }

}
