
package libro.entidades;

import java.util.Scanner;

/*
1. Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
 */
public class Libro {
    public int isbn;
    public String titulo;
    public String autor;
    public int numPag;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Libro(){
        
    }
    public Libro(int isbn, String titulo, String autor, int numPag){
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numPag = numPag;
    }
    
    public Libro cargaLibro(){
        Libro lb1 = new Libro();
       
        System.out.println("Ingrese el número ISBN del libro: ");
        isbn = leer.nextInt();
        System.out.println("Ingrese el título del libro: ");
        titulo = leer.next();
        System.out.println("Ingrese el Autor del libro: ");
        autor = leer.next();
        System.out.println("Ingrese el número de paginas del libro: ");
        numPag = leer.nextInt();
        return lb1;
    }
    public void infoLibro(){
        System.out.println("El número de ISBN del libro es: " + isbn);
        System.out.println("El Título del libro es: " + titulo);
        System.out.println("El Autor del libro es: " + autor);
        System.out.println("El número de páginas del libro es: " + numPag);
        
    }
}
