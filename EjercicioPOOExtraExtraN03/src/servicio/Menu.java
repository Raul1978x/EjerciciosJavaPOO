package servicio;

import entidad.Pass;
import java.util.Scanner;

public class Menu {

    /**
     * ● A través de un menú de opciones: o A) ingresar la contraseña, recordar
     * que antes de guardarla debe ser ingresada una contraseña valida). o
     * B)Mensaje al usuario que tipo de NIVEL es su contraseña o C) Modificar
     * contraseña, donde primero debe poner su contraseña anterior para dar
     * permiso o C) Modificar nombre, donde primero debe poner su contraseña
     * para dar permiso, SINO impedir cambios o D) Modificar DNI, donde primero
     * debe poner su contraseña para dar permiso, SINO impedir cambios
     */
    public void menu() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServicioPass servicioPass = new ServicioPass();
        Pass pass = new Pass();
        servicioPass.crearUsuario(pass);
        boolean menuinicio = true;
        int cont = 0;
        String menu = null;
        System.out.println("Menú:\nA)Ingresar Contraseña\nB)Nivel de seguridad"
                + "\nC)Modificar contraseña\nD)Modificar nombre\nE)Modificar DNI\nF)Imprimir Datos\nG)Salir");
        menu = leer.next().toUpperCase();
        do {
            if (cont > 0) {
                System.out.println("Menú:\nA)Ingresar Contraseña\nB)Nivel de seguridad"
                        + "\nC)Modificar contraseña\nD)Modificar nombre\nE)Modificar DNI\nF)Imprimir Datos\nG)Salir");
                menu = leer.next().toUpperCase();
            }
            cont++;
            switch (menu) {
                case "A":
                    pass = servicioPass.crearPass(pass);
                    break;
                case "B":
                    servicioPass.analizarContraseña(pass);
                    break;
                case "C":
                    System.out.println("Ingrese la contraseña actual");
                    String contrasena = leer.next();
                    if (contrasena.equals(pass.getPass())) {
                        servicioPass.crearPass(pass);
                    } else {
                        System.out.println("contraseña Incorrecta");
                    }
                    break;
                case "D":
                    servicioPass.modificarNombre(pass);
                    break;
                case "E":
                    servicioPass.modificarDNI(pass);
                    break;
                case "F":
                    pass = servicioPass.crearUsuario(pass);
                    System.out.println(pass);
                    break;

                case "G":
                    menuinicio = false;
                    break;
            }
        } while (menuinicio);

    }
}
