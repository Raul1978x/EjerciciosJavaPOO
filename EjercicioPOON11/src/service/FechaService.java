package service;

import entidad.Fecha;
import java.util.Date;
import java.util.Scanner;

public class FechaService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void llenaFecha() {
        Fecha f1 = new Fecha();
        System.out.println("Ingrese el dia");
        f1.setDia(leer.nextInt());
        System.out.println("Ingrese el mes");
        f1.setMes(leer.nextInt());
        System.out.println("Ingrese el año");
        f1.setAnio(leer.nextInt());
        Date fecha = new Date(f1.getAnio() - 1900, f1.getMes() - 1, f1.getDia());
        System.out.println(fecha);
        Date fechaActual = new Date();
        System.out.println(fechaActual);
        int tiempo = fechaActual.getYear()-fecha.getYear();
        System.out.println("Hay "+tiempo+" años de diferencia");
    }
}
