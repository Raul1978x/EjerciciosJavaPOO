package entidad;

import java.util.Arrays;
import java.util.Scanner;

public class Prueba {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private String palabra;
    private char[] palabra1;

    public Prueba() {
        palabra1 = new char[palabra.length()];
    }

    public Prueba(String palabra, char[] palabra1) {
        this.palabra = palabra;
        this.palabra1 = new char[palabra.length()];
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public char[] getPalabra1() {
        return palabra1;
    }

    public void setPalabra1(char[] palabra1) {
        this.palabra1 = palabra1;
    }

    @Override
    public String toString() {
        return "Prueba{" + "palabra=" + palabra + ", palabra1=" + palabra1 + '}';
    }

//    public Prueba cargaPalabra(Prueba p) {
////        Prueba p = new Prueba();
//
//        System.out.println("Ingrese palabra");
//        p.setPalabra(leer.next().toUpperCase());
////        String [] palabra1= new String[palabra.length()];
//        for (int i = 0; i < p.getPalabra().length(); i++) {
//            p.getPalabra1()[i] = p.getPalabra().substring(i, i + 1);
////            System.out.print(palabra1[i]);
//        }
//        System.out.println(Arrays.toString(p.getPalabra1()));
//        return p;
//    }
}
