package ejerciciopoon06;

import Entidad.Cafetera;

public class EjercicioPOON06 {

    public static void main(String[] args) {
        Cafetera c1 = new Cafetera();

        System.out.println("-------------------------LLENAR------------------------------");
        c1.llenarCafetera();
        System.out.println("-------------------------SERVIR------------------------------");
        c1.servirTaza();
        System.out.println("-------------------------VACIAR-------------------------------");
        c1.vaciarCafetera();
        System.out.println("-------------------------AGREGAR------------------------------");
        c1.agregarCafe();
    }

}
