package ejerciciopoon06;

import Entidad.Cafetera;

public class EjercicioPOON06 {

    public static void main(String[] args) {
        Cafetera c1 = new Cafetera();

        System.out.println("-------------------------LLENAR------------------------------");
        System.out.println("");
        c1.llenarCafetera();
        System.out.println("-------------------------SERVIR------------------------------");
        System.out.println("");
        c1.servirTaza();
        System.out.println("-------------------------VACIAR-------------------------------");
        System.out.println("");
        c1.vaciarCafetera();
        System.out.println("-------------------------AGREGAR------------------------------");
        System.out.println("");
        c1.agregarCafe();
    }

}
