/**
 * 12. Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
 * (Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes
 * métodos:
 * • Agregar un método de creación del objeto que respete la siguiente firma:
 * crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
 * usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
 * fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
 * • Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
 * en cuenta que para conocer la edad de la persona también se debe conocer la fecha
 * actual.
 * • Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
 * edad y retorna true en caso de que el receptor tenga menor edad que la persona que
 * se recibe como parámetro, o false en caso contrario.
 * • Metodo mostrarPersona(): este método muestra la persona creada en el método
 * anterior.
 */
package servicePersona;

import entidades.Persona;
import java.util.Date;
import java.util.Scanner;
import java.lang.Integer;

public class ServicePersona {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    Persona p = new Persona();

    public Persona crearpersona() {
        System.out.println("Ingrese su nombre: ");
        p.setNombre(leer.next());
        System.out.println("Ingrese el dia de su fecha de nacimiento: ");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes de su fecha de nacimiento: ");
        int mes = leer.nextInt();
        System.out.println("Ingrese el año de su fecha de nacimiento: ");
        int anio = leer.nextInt();
        Date fecha = new Date(anio - 1900, mes - 1, dia);
        p.setFechaNacimento(fecha);
        return p;
    }

    public void calcularEdad(Persona p) {
        Date hoy = new Date();
        p.setEdad(hoy.getYear() - p.getFechaNacimento().getYear());
        System.out.println("Edad: " + p.getEdad() + " años");
    }

    /**
     * • Agregar a la clase el método menorQue(int edad) que recibe como
     * parámetro otra edad y retorna true en caso de que el receptor tenga menor
     * edad que la persona que se recibe como parámetro, o false en caso
     * contrario.
     */
    public void menorQue(int edad) {
        boolean menor;
//        System.out.println("Ingrese una edad");
//        edad = leer.nextInt();
        if (edad > p.getEdad()) {
            menor = true;
        }
        menor = false;
        System.out.println(p.getNombre() + " es menor que la edad cargada?");
        System.out.println(menor);
    }
    /**
     * * • Metodo mostrarPersona(): este método muestra la persona creada en el
     * método anterior.
     */
    public void mostrarPersona(){
        System.out.println(p.toString());
    }
}
