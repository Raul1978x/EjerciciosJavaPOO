/*
1. Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
 */
package libro;

import libro.entidades.Libro;
import servicio.ServicioLibro;

public class Main {

    public static void main(String[] args) {

        ServicioLibro sl = new ServicioLibro();

        Libro l1 = sl.cargaLibro();
        Libro l2 = sl.cargaLibro();
        sl.infoLibro(l1);
        sl.infoLibro(l2);
    }
}
