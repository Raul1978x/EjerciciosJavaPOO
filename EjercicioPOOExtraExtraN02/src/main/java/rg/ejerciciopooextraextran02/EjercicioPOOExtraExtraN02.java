package rg.ejerciciopooextraextran02;

import entidades.Tiempo;
import servicios.ServicioTiempo;

public class EjercicioPOOExtraExtraN02 {

    public static void main(String[] args) {
        ServicioTiempo ServTiempo = new ServicioTiempo();
        Tiempo tiempo = ServTiempo.crearTiempo();
    }
}
