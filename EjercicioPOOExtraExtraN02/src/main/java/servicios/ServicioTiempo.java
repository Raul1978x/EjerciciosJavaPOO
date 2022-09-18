package servicios;

import entidades.Tiempo;
import java.time.LocalTime;
import java.util.Scanner;

public class ServicioTiempo {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Tiempo crearTiempo() {
        Tiempo tiempo = new Tiempo();
        if (tiempo.getHora() == 24) {
            tiempo.setHora(leer.nextInt());
        }
        while (tiempo.getHora() > 24) {

            tiempo.setMinutos(leer.nextInt());
        }
        while (tiempo.getMinutos() >= 60) {
            tiempo.setSegundos(leer.nextInt());
        }
        LocalTime tiempoCargado = LocalTime.of(tiempo.getHora(), tiempo.getMinutos(), tiempo.getSegundos());
        System.out.println(tiempoCargado);
        return tiempo;

    }
}
