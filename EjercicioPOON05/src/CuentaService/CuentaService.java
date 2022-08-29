/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CuentaService;

import Entidad.Cuenta;
import java.util.Scanner;

/**
 *
 * @author Raul
 */
public class CuentaService {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cuenta creaCuenta() {
        
        Cuenta c = new Cuenta();

        System.out.println("Ingrese el numero de cuenta: ");
        c.setNumeroCuenta(leer.nextInt());
        System.out.println("Ingrese el DNI del titular de la cuenta: ");
        c.setDni(leer.nextInt());
        System.out.println("Ingrese Nombre y Apellido del titular de la cuenta: ");
        c.setNombYApell(leer.next().toUpperCase());
        System.out.println("Ingrese el saldo de la cuenta: ");
        c.setSaldo(leer.nextInt());
        System.out.println("Ingrese la tasa de interes anual(T.E.A.): ");
        c.setInteres(leer.nextInt());
        return c;

    }

    public double ingresarDinero(Cuenta c) {
        double ingreso, saldo;
        saldo = c.getSaldo();
        System.out.println("Ingrese cuanto dinero desea depositar");
        ingreso = leer.nextDouble();
        c.setSaldo(saldo+ingreso);
        return saldo;
    }

    public double retiroDinero(Cuenta c) {
        double retiro, saldo = c.getSaldo();

        String resp;
        System.out.println("Ingrese cuanto dinero desea retirar");
        retiro = leer.nextDouble();
        if (retiro > c.getSaldo()) {
            System.out.println("Su saldo es de: $" + c.getSaldo() + " ¿desea retirar el total?(S/N)");
            resp = leer.next();
            if (resp.equalsIgnoreCase("s")) {
                System.out.println("Extracción: $" + c.getSaldo() + "\nSaldo Actual: $0.0");
                saldo = 0;
            } else {
                System.out.println("Ingrese cuanto dinero desea retirar");
                retiro = leer.nextDouble();
                saldo = c.getSaldo() - retiro;
                System.out.println("Extracción: $" + retiro + "\nSaldo Actual: $" + c.getSaldo());

            }
        } else {
            saldo = saldo - retiro;
            System.out.println("Extracción: $" + retiro + " \nSaldo Actual: $" + saldo);
        }
        return saldo;
    }

    public void extraccionRapida(Cuenta c) {
        double saldo = c.getSaldo();
        double extRapid = saldo * 0.2;
        System.out.println("Usted seleccionó una extraccion Rápida, se le entregará el 20% de su saldo actual ");
        c.setSaldo(saldo-extRapid);
        System.out.println("Extracción: $" + extRapid + " \nSaldo Actual: $" + c.getSaldo());
    }

    public void consultaSaldo(Cuenta c) {
        System.out.println("Saldo Actual: $" + c.getSaldo());
    }

    public void consultaDatos(Cuenta c) {
        System.out.println("Cuenta: " + c.getNumeroCuenta() + "\nNombre y Apellido: " + c.getNombYApell() + "\nDNI: " + c.getDni() + "\nSaldo Actual: $" + c.getSaldo() + "\nT.E.A: " + c.getInteres() + "%");
    }
}
