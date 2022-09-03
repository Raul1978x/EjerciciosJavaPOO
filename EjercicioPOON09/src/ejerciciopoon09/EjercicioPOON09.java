package ejerciciopoon09;

import entidades.Matematica;
import service.matemativa.matematicaService;


public class EjercicioPOON09 {

    public static void main(String[] args) {
    matematicaService ms = new matematicaService();
    Matematica m1=null;
    ms.cargaNum(m1);
        
        System.out.println(ms.devolverMayor());
        System.out.println(ms.calcularPotencia());
        System.out.println(ms.calcularRaiz());
    }
    
}
