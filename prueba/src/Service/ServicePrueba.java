package Service;

import entidad.Prueba;
import java.util.Arrays;
import java.util.Scanner;

public class ServicePrueba {
     Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
//       
//        String palabra;
//        System.out.println("Ingrese palabra");
//        palabra = leer.next().toUpperCase();
//        String [] palabra1= new String[palabra.length()];
//  for (int i = 0; i < palabra.length(); i++) {
//      palabra1[i] = palabra.substring(i, i+1);
////            System.out.print(palabra1[i]);
//  }
//        System.out.println(Arrays.toString(palabra1));
//    }
        
       
//        String palabra;
     public Prueba cargaPalabra(){
        Prueba p = new Prueba();
        
        System.out.println("Ingrese palabra");
        p.setPalabra(leer.next().toUpperCase());
        
        
//        String [] palabra1= new String[palabra.length()];
//  for (int i = 0; i < p.getPalabra().length(); i++) {
//      p.getPalabra1()[i] = p.getPalabra().substring(i, i+1);
//            System.out.print(palabra1[i]);
//  }
        System.out.println(Arrays.toString(p.getPalabra1()));
        return p;
    }
    
}

