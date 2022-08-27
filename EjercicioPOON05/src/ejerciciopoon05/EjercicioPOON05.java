package ejerciciopoon05;

import CuentaService.CuentaService;
import Entidad.Cuenta;

public class EjercicioPOON05 {

    public static void main(String[] args) {
        CuentaService cs = new CuentaService();
        Cuenta c1=cs.creaCuenta();
        
        System.out.println("--------------------------------------------------------------------------");
        cs.consultaDatos(c1);
        System.out.println("--------------------------------------------------------------------------");
        cs.consultaSaldo(c1);
        System.out.println("--------------------------------------------------------------------------");
        cs.ingresarDinero(c1);
        System.out.println("--------------------------------------------------------------------------");
        cs.extraccionRapida(c1);
        System.out.println("--------------------------------------------------------------------------");
        cs.retiroDinero(c1);
        System.out.println("--------------------------------------------------------------------------");

       
    }
}
