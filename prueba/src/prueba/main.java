package prueba;

import Service.ServicePrueba;
import entidad.Prueba;
import java.util.Arrays;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
//        Scanner leer = new Scanner(System.in).useDelimiter("\n");
//
//        String palabra;
//        System.out.println("Ingrese palabra");
//        palabra = leer.next().toUpperCase();
//        String[] palabra1 = new String[palabra.length()];
//        for (int i = 0; i < palabra.length(); i++) {
//            palabra1[i] = palabra.substring(i, i + 1);
////palabra1 = palabra.split(palabra);
String str = new String("Welcome to BeginnersBook.com"); 
char[] array= str.toCharArray(); 
System.out.print("Content of Array:"); 
for(char c: array){ 
    System.out.print(c); 
        }
        System.out.println("");
        System.out.println("Arreglo");
        System.out.println(Arrays.toString(array));

    }
}
