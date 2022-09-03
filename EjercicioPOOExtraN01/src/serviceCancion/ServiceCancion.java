/**
 * 1. Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́ definir
 * además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas vacías y
 * otro que reciba como parámetros el titulo y el autor de la canción. Se deberán además
 * definir los métodos getters y setters correspondientes.
 */
package serviceCancion;

import entidades.Cancion;
import java.util.Scanner;

public class ServiceCancion {

    Cancion c = new Cancion();
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cancion cargaCancion(){
        System.out.println("INGRESE EL NOMBRE DE LA CANCION:");
        c.setTitulo(leer.next());
        System.out.println("INGRESE EL AUTOR DE LA CANCION:");
        c.setAutor(leer.next());
        return c;
    }
    
}
