package ejerciciopoon08;

import entidad.Cadena;
import java.util.Scanner;

public class EjercicioPOON08 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese frase o palabra");
        Cadena c1 = new Cadena(leer.next());
        System.out.println(c1.getFrase() + " (" + c1.getLongitud() + " caracteres incluidos espacios)");
        int op=0;
        do {
            System.out.println("-----------------------MENU-------------------------");
        System.out.println("1-Mostrar vocales\n2-Invertir Frase"
                + "\n3-Veces Repetido\n4-Comparar Longitud\n5-Unir frases\n"
                + "6-Reemplazar la letra 'a'\n7-Contiene\n0-Salir");
            System.out.println("----------------------------------------------------");
            System.out.println("---------Seleccione el metodo a aplicar-------------");
        op = leer.nextInt();
        
            switch (op) {
                case 1:
                    c1.mostrarVocales(c1);
                    break;
                case 2:
                    c1.invertirFrase(c1);
                    break;
                case 3:
                    c1.vecesRepetido(c1);
                    break;
                case 4:
                    c1.compararLongitud(c1.getFrase());
                    break;
                case 5:
                    c1.unirFrases(c1.getFrase());
                    break;
                case 6:
                    c1.reemplazar(c1.getFrase());
                    break;
                case 7:
                    c1.contiene(c1);
                    break;
                case 0:
                    break;
            }
            
            System.out.println("-----------------------------------------------------");
        } while (op!=0 );
    }
}
