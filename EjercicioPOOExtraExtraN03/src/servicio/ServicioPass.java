/**
 * Métodos para desarrollar:
 * ● Ingresar datos de usuarios (usando el constructor. HACER INGRESO DE DATOS FIJOS (no por
 * teclado)
 * ● Crear un método para ingresar una contraseña (crearPass). En este método, debemos
 * validar que la longitud sea correcta. (10). En caso de ser correcto, almaceno la contraseña.
 * Si ingreso a esta opción del menú, indefectiblemente deberá dejar su contraseña asignada.
 * ● Crear un método para analizar la contraseña(analizarPass). Donde:
 * o SI Existe al menos una letra z : Es nivel MEDIO
 * o Si Existe al menos una letra z y al menos 2 letras a: Es nivel ALTO
 * o Si ninguna condición se cumple es nivel BAJO
 * ● Crear los métodos correspondientes para modificar el nombre o DNI. Atención! Primero
 * debe ingresar el pass para poder realizar dicha gestión. Caso contrario se impedirá el
 * acceso a modificar los datos.
 * ● A través de un menú de opciones:
 * o A) ingresar la contraseña, recordar que antes de guardarla debe ser ingresada una
 * contraseña valida).
 * o B) Mensaje al usuario que tipo de NIVEL es su contraseña
 * o C) Modificar contraseña, donde primero debe poner su contraseña anterior para
 * dar permiso
 * o C) Modificar nombre, donde primero debe poner su contraseña para dar permiso,
 * SINO impedir cambios
 * o D) Modificar DNI, donde primero debe poner su contraseña para dar permiso,
 * SINO impedir cambios
 */
package servicio;

import entidad.Pass;
import java.util.Scanner;

public class ServicioPass {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Pass crearUsuario(Pass pass) {
//        
        pass = new Pass(pass.getPass(), pass.getNombre(), pass.getDni());
        return pass;
    }

    /**
     * ● Crear un método para ingresar una contraseña (crearPass). En este
     * método, debemos validar que la longitud sea correcta. (10). En caso de
     * ser correcto, almaceno la contraseña. Si ingreso a esta opción del menú,
     * indefectiblemente deberá dejar su contraseña asignada.
     *
     * @param pass
     * @return
     */
    public Pass crearPass(Pass pass) {
        pass = new Pass("Raul", 22333444);
        do {
            System.out.println("Ingrese una contraseña de 10 caracteres");
            pass.setPass(leer.next());
        } while (pass.getPass().length() != 10);
        return pass;
    }

    /**
     * ● Crear un método para analizar la contraseña(analizarPass). Donde: o SI
     * Existe al menos una letra z : Es nivel MEDIO o Si Existe al menos una
     * letra z y al menos 2 letras a: Es nivel ALTO o Si ninguna condición se
     * cumple es nivel BAJO
     *
     * @param pass
     */
    public void analizarContraseña(Pass pass) {
        boolean comprobada = false;
        int contZ = 0;
        int contA = 0;
        for (int i = 0; i < pass.getPass().length(); i++) {
            String[] palabra = new String[pass.getPass().length()];
            palabra[i] = pass.getPass().substring(i, i + 1).toLowerCase();
            if ("z".equals(palabra[i])) {
                contZ++;
            } else if ("a".equals(palabra[i])) {
                contA++;
            }
        }
        if (contA > 1 && contZ > 0) {
            System.out.println("Contraseña Nivel ALTO");
            comprobada = true;
        } else if (contZ == 1) {
            System.out.println("Contraseña Nivel MEDIO");
            comprobada = true;
        } else {
            System.out.println("Contraseña Nivel bajo");
            comprobada = true;
        }
    }

    /**
     * ● Crear los métodos correspondientes para modificar el nombre o DNI.
     * Atención! Primero debe ingresar el pass para poder realizar dicha
     * gestión. Caso contrario se impedirá el acceso a modificar los datos.
     */
    public void modificarDNI(Pass pass) {
        String afirma = null;
        String contrasena = null;
        System.out.println("Desea cambiar DNI de usuario");

        afirma = leer.next().toLowerCase();
        if ("s".equals(afirma)) {
            System.out.println("Ingrese contraseña");
            contrasena = leer.next();
            if (contrasena.equals(pass.getPass())) {
                System.out.println("Ingrese el nuevo DNI de usuario");
                pass.setDni(leer.nextInt());
            }
        }
    }

    public void modificarNombre(Pass pass) {
        String afirma = null;
        String contrasena = null;
        System.out.println("Desea cambiar nombre de usuario");
        afirma = leer.next().toLowerCase();
        if ("s".equals(afirma)) {
            System.out.println("Ingrese contraseña");
            contrasena = leer.next();
            if (contrasena.equals(pass.getPass())) {
                System.out.println("Ingrese el nuevo nombre de usuario");
                pass.setNombre(leer.next());
            }

        }

    }
}
