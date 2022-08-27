package servicio;

import java.util.Scanner;
import libro.entidades.Libro;

public class ServicioLibro {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Libro cargaLibro() {
        Libro ls = new Libro();
        System.out.println("Ingrese el número ISBN del libro: ");
        ls.setIsbn(leer.nextInt());
        System.out.println("Ingrese el título del libro: ");
        ls.setTitulo(leer.next());
        System.out.println("Ingrese el Autor del libro: ");
        ls.setAutor(leer.next());
        System.out.println("Ingrese el número de paginas del libro: ");
        ls.setNumPag(leer.nextInt());

        return ls;

    }

    public void infoLibro(Libro ls1) {
//        System.out.println("ISBN: " + ls.getIsbn() 
//                + "\nTítulo: " + ls.getTitulo() 
//                + "\nAutor: " + ls.getAutor() 
//                + "\nNúmeros de Paginas: " + ls.getNumPag());
        System.out.println(ls1.toString());
    }

}
